package AssignmentOne;
import java.util.Scanner;


public class AverageTemp {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("You will give the temperature for how many days?");
		int numberOfDays = input.nextInt();
		int[] temp = new int[numberOfDays];
		double sum = 0;
		double average = 0;
		int count = 0;
		for (int i = 0; i < numberOfDays; i++) {
			System.out.println("Enter temperature for day " + (i+1) + ": ");
			temp[i] = input.nextInt();
			sum += temp[i];
		}
		average = sum / numberOfDays;
		System.out.println();
		System.out.println("Average temperature is: " + average + " degrees.");

		for (int i = 0; i < numberOfDays; i++) {
			if (temp[i] > average) {
				count++;
			}
		}
		System.out.println();
		System.out.println("Number of days with above average temperature: " + count);
		System.out.println();
		input.close();
	}

}