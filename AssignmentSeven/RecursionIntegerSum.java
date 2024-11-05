// Purpose: Calculate the sum of the digits of an integer using recursion.
package AssignmentSeven;

public class RecursionIntegerSum {
	public static int sumOfDigits(int n) {
		if (n < 10) {
			return n;
		} else {
			return n % 10 + sumOfDigits(n / 10);
		}
	}

	public static void main(String[] args) {
		System.out.println("");
		System.out.println("Sum of digits in 10 = " + sumOfDigits(10));  // Output: 1
		System.out.println("");
		System.out.println("Sum of digits in 13 = " + sumOfDigits(13));  // Output: 4
		System.out.println("");
		System.out.println("Sum of digits in 123 = " + sumOfDigits(123)); // Output: 6
		System.out.println("");
	}
}