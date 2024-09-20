package AssignmentTwo;
import java.util.Arrays;
// import java.util.Scanner;

public class DoubleDimension {
	// Declare th e2D array
	int[][] arr = null;

	// Constructor
	public DoubleDimension(int rows, int cols) {
		arr = new int[rows][cols];
		// Initialize the array with a default value
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.MIN_VALUE;
			}
		}
	}

	// Method to convert the array to a deep string
	public String toDeepString(int[][] arr) {
		return Arrays.deepToString(arr);
	}

	// Display array as rows and columns
	public void displayArray() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

	// Insert method
	public void insert(int row, int column, int valueToBeInserted) {
		try {
			if (arr[row][column] == Integer.MIN_VALUE) {
				arr[row][column] = valueToBeInserted;
				System.out.println("Successfully inserted " + valueToBeInserted + " at location (" + row + ", " + column + ").");
			} else {
				System.out.println("This cell is already occupied by another value.");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access array!");
		}
	}

	// Traverse method
	public void traverse() {
		try {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.println(arr[i][j] + " ");
				}
			}
		} catch (Exception e) {
			System.out.println("An error occurred!");
		}
	}

	// Search method
	public void search(int valueToBeSearched) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == valueToBeSearched) {
					System.out.println("Value " + valueToBeSearched + " found at index: (" + i + ", " + j + ").");
					return;
				}
			}
		}
		System.out.println("Value " + valueToBeSearched + " is not found in the array!");
	}

	// Delete method
	public void delete(int valueToBeDeleted) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == valueToBeDeleted) {
					arr[i][j] = 0;
					System.out.println("Value " + valueToBeDeleted + " has been deleted.");
					System.out.println("Updated array: " + Arrays.deepToString(arr));
					return;
				}
			}
		}
		System.out.println("Value " + valueToBeDeleted + " is not found in the array!");
	}

	public static void main(String[] args) {
		// Create an object of DoubleDimension
		DoubleDimension doubleDimension = new DoubleDimension(3, 3);
		System.out.println();
		System.out.println("Array Object created: ");
		System.out.println(doubleDimension.toDeepString(doubleDimension.arr));
		System.out.println();
		System.out.println("Array: ");
		doubleDimension.displayArray();
		System.out.println();
		System.out.println("Insert method:");
		doubleDimension.insert(0, 0, 11);
		doubleDimension.insert(0, 1, 22);
		doubleDimension.insert(0, 2, 33);
		doubleDimension.insert(1, 0, 44);
		doubleDimension.insert(1, 1, 55);
		doubleDimension.insert(1, 2, 66);
		doubleDimension.insert(2, 0, 77);
		doubleDimension.insert(2, 1, 88);
		doubleDimension.insert(2, 2, 99);
		System.out.println();
		System.out.println("Display array as string:");
		System.out.println(doubleDimension.toDeepString(doubleDimension.arr));
		System.out.println();
		System.out.println("Traverse method:");
		doubleDimension.traverse();
		System.out.println();
		System.out.println("Search method:");
		doubleDimension.search(88);
		System.out.println();
		doubleDimension.displayArray();
		System.out.println();
		System.out.println("Delete method:");
		doubleDimension.delete(55);
		System.out.println();
		doubleDimension.displayArray();
		System.out.println();
		System.out.println("-----------------------");
	}
}