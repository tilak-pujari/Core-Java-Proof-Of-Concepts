package operators;

import java.util.Scanner;

public class Operations2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		boolean exit = true;
		while (exit) {
			System.out.println("1.Square \n2.Cube \n3.SquareRoot \n4.Factorial \n5.Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Square of Number " + num + " is:" + num * num);
			}
				break;
			case 2: {
				System.out.println("Cube of Number " + num + " is:" + num * num * num);
			}
				break;
			case 3: {
				System.out.println("SquareRoot of Number " + num + " is:" + Math.sqrt(num));
			}
				break;
			case 4: {
				int fact = 1;
				for (int i = 1; i <= num; i++) {
					fact = fact * i;
				}
				System.out.println("Factorial of Number " + num + " is:" + fact);
			}
				break;
			case 5: {
				exit = false;
			}
				break;

			default: {
				System.out.println("Enter valid Credentials");
			}
			}

		}
	}

}