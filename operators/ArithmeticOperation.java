package operators;

import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Calculator");
		System.out.println("Enter the First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number");
		int num2 = sc.nextInt();

		boolean exit = true;
		while (exit) {
			System.out.println("Please Select Operation you want to Perform");
			System.out.println("1.Add 2.Subtract 3.Multiply \n4.Divide 5.Remainder\n6.All Operations 7.Exit");
			int choice = sc.nextInt();

			switch (choice) {
			case 1: {
				System.out.println("Addition of Given numbers is: " + (num1 + num2));
			}
				break;
			case 2: {
				System.out.println("Subtraction of Given numbers is: " + (num1 - num2));
			}
				break;
			case 3: {
				System.out.println("Multiplication of Given numbers is: " + (num1 * num2));
			}
				break;
			case 4: {
				System.out.println("Division of Given numbers is: " + (num1 / num2));
			}
				break;
			case 5: {
				System.out.println("Remainder of Given numbers is: " + (num1 % num2));
			}
				break;
			case 6: {
				System.out.println("Addition of Given numbers is: " + (num1 + num2));
				System.out.println("Subtraction of Given numbers is: " + (num1 - num2));
				System.out.println("Multiplication of Given numbers is: " + (num1 * num2));
				System.out.println("Division of Given numbers is: " + (num1 / num2));
				System.out.println("Remainder of Given numbers is: " + (num1 % num2));
			}
				break;
			case 7: {
				exit = false;
			}
				break;

			default: {
				System.out.println("Please Select Valid Operation");
			}
			}
		}
		System.out.println("Thanks for Using Calculator");
	}
}