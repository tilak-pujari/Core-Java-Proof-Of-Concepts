package conditionalStatements;

import java.util.Scanner;

public class MenuBar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number1: ");
		int number1 = scanner.nextInt();
		System.out.print("Enter Number2: ");
		int number2 = scanner.nextInt();
		System.out.println("The available Choices are ");
		System.out.println("1 - Addition ");
		System.out.println("2 - Subtraction ");
		System.out.println("3 -Divide ");
		System.out.println("4 - Multiply ");
		System.out.print("Select a Choice ");
		int choice = scanner.nextInt();
		// System.out.println("Selected Choice is " + choice);
		if (choice == 1) {
			System.out.println("Result: " + (number1 + number2));
		} else if (choice == 2) {
			System.out.println("Result: " + (number1 - number2));
		} else if (choice == 3) {
			System.out.println("Result: " + (number1 / number2));
		} else if (choice == 4) {
			System.out.println("Result: " + (number1 * number2));
		} else {
			System.out.println("Invalid Operation");
		}
	}
}
