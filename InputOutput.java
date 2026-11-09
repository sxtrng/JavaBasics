//  InputOutput.java

import java.util.Scanner;

public class InputOutput {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int integerNumber;

		System.out.print("Enter an integer: ");
		integerNumber = scanner.nextInt();
		System.out.println("You Entered: " + integerNumber);

		scanner.close();

	}
}