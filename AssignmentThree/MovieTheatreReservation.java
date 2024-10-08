// Purpose: This program simulates a movie theatre reservation system. The user can reserve a seat, cancel a reservation, or exit the program.
import java.util.ArrayList;
import java.util.Scanner;

public class MovieTheatreReservation {
    static final int ROWS = 5;
    static final int COLS = 5;
    static ArrayList<ArrayList<Integer>> seats = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeSeats();
        while (true) {
            System.out.println();
            displaySeats();
            System.out.println();
            System.out.println("Select an option:");
            System.out.println("1. Reserve a seat");
            System.out.println("2. Cancel a reservation");
            System.out.println("3. Exit");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    reserveSeat();
                    break;
                case 2:
                    cancelReservation();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Exiting. Enjoy your movie!");
                    System.out.println();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static void initializeSeats() {
        for (int i = 0; i < ROWS; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < COLS; j++) {
                row.add(0);
            }
            seats.add(row);
        }
    }

    public static void displaySeats() {
        System.out.println("Current seat arrangement:");
        System.out.println();
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(seats.get(i).get(j) == 0 ? "[ ]" : "[X]");
            }
            System.out.println();
        }
    }

    public static void reserveSeat() {
        System.out.println("Enter row number (1-5) to reserve: ");
        int row = scanner.nextInt() - 1;
        System.out.println("Enter column number(1-5) to reserve:");
        int col = scanner.nextInt() - 1;
        
        if (isValidSeat(row, col)) {
            if (seats.get(row).get(col) == 0) {
                seats.get(row).set(col, 1);
                System.out.println("Seat reserved successfully.");
            } else {
                System.out.println();
                System.out.println("Seat already reserved. Below, see seat availability:");
                offerAlternativeSeat();
            }
        } else {
            System.out.println("Invalid seat selection. Please try again.");
        }
    }

    public static void cancelReservation() {
        System.out.println("Enter row and column (1-5) to cancel:");
        int row = scanner.nextInt() - 1;
        int col = scanner.nextInt() - 1;
        
        if (isValidSeat(row, col)) {
            if (seats.get(row).get(col) == 1) {
                seats.get(row).set(col, 0);
                System.out.println("Reservation cancelled.");
                displaySeats();
            } else {
                System.out.println("No reservation found for this seat.");
            }
        } else {
            System.out.println("Invalid seat selection. Please try again.");
        }
    }

    public static boolean isValidSeat(int row, int col) {
        return row >= 0 && row < ROWS && col >= 0 && col < COLS;
    }

    public static void offerAlternativeSeat() {
        int count = 0;
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (seats.get(i).get(j) == 0) {
                    System.out.println("Available seat: Row " + (i + 1) + ", Column " + (j + 1));
                    count++;
                    
                    System.out.println("See seating chart below for other options.");
                    if (count == 1) return;
                }
            }
        }
        if (count == 0) {
            System.out.println("No other seats are available.");
        }
    }
}
