package AssignmentSeven;

public class RecursionBinary {
	public static String decimalToBinary(int n) {
		if (n == 0) {
			return "";
		} else {
			return decimalToBinary(n / 2) + (n % 2);
		}
	}

	public static void main(String[] args) {
		int number1 = 10;
		String binaryRepresentation1 = decimalToBinary(number1);
		int number2 = 13;
		String binaryRepresentation2 = decimalToBinary(number2);
		int number3 = 123;
		String binaryRepresentation3 = decimalToBinary(number3);
		
		System.out.println("");
		System.out.println("Decimal number " + number1  + "\nBinary number: " + binaryRepresentation1);  // Output: 1010
		System.out.println("");
		System.out.println("");
		System.out.println("Decimal number " + number2  + "\nBinary number: " + binaryRepresentation2);  // Output: 1010
		System.out.println("");
		System.out.println("");
		System.out.println("Decimal number " + number3  + "\nBinary number: " + binaryRepresentation3); 
		System.out.println("");
	}
}
	
