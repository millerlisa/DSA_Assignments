// This uses the two dimension array.
package AssignmentThree;

import java.util.Scanner;

public class MovieTheatreReservation {
    // ROWS & COLS are the number of rows and columns in the theatre, they are constants, that's why they are in uppercase
    static final int ROWS = 5;
    static final int COLS = 5;
    // seats is a 2D array that represents the seats in the theatre
    static int[][] seats = new int[ROWS][COLS];
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

    // Sets all the seats in the theatre to 0, which means they are all available
    public static void initializeSeats() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                seats[i][j] = 0;
            }
        }
    }

    // Displays the current seat arrangement in the theatre. [ ] means the seat is available, [X] means the seat is reserved    
    public static void displaySeats() {
        System.out.println("Current seat arrangement:");
        System.out.println();
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(seats[i][j] == 0 ? "[ ]" : "[X]");
            }
            System.out.println();
        }
    }

    // Prompts the user to enter the row and column number of the seat they want to reserve, then reserves the seat if it's available & displays seat arrangement. If the seat is already reserved, it offers an alternative seat. See offerAlternativeSeat() method for more details.
    public static void reserveSeat() {
        System.out.println("Enter row number (1-5) to reserve: ");
        int row = scanner.nextInt() - 1;
        System.out.println("Enter column number(1-5) to reserve:");
        int col = scanner.nextInt() - 1;
        
        if (isValidSeat(row, col)) {
            if (seats[row][col] == 0) {
                seats[row][col] = 1;
                System.out.println("Seat reserved successfully.");
                // displaySeats();
            } else {
                System.out.println();
                System.out.println("Seat already reserved. Below, see seat availability:");
                offerAlternativeSeat();
            }
        } else {
            System.out.println("Invalid seat selection. Please try again.");
        }
    }

    // Prompts the user to enter the row and column number of the seat they want to cancel, then cancels the reservation if it exists & displays seat arrangement.
    public static void cancelReservation() {
        System.out.println("Enter row and column (1-5) to cancel:");
        int row = scanner.nextInt() - 1;
        int col = scanner.nextInt() - 1;
        
        if (isValidSeat(row, col)) {
            if (seats[row][col] == 1) {
                seats[row][col] = 0;
                System.out.println("Reservation cancelled.");
                displaySeats();
            } else {
                System.out.println("No reservation found for this seat.");
            }
        } else {
            System.out.println("Invalid seat selection. Please try again.");
        }
    }

    // Checks if the row and column number entered by the user is valid
    public static boolean isValidSeat(int row, int col) {
        return row >= 0 && row < ROWS && col >= 0 && col < COLS;
    }

    // Offers an alternative seat to the user if the seat they want to reserve is already reserved
    public static void offerAlternativeSeat() {
        int count = 0;
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (seats[i][j] == 0) {
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