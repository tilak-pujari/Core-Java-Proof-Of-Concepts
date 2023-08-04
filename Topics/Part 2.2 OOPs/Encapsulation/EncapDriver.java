package Encapsulation;

import java.util.Scanner;
public class EncapDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name:");
		String name = sc.next();
		System.out.println("Enter the Pincode of Area:");
		int pin = sc.nextInt();
		System.out.println("Enter the Phone Number:");
		long phoneNo = sc.nextLong();
		Encap e = new Encap(name, pin, phoneNo);
		boolean exit = true;
		while (exit) {
			System.out.println("Select your Choice \n1.See Details\n2.Edit Details\n3.Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				e.Details();
			}
				break;
			case 2: {
				System.out.println("Enter the Name to change:");
				String name1 = sc.next();
				System.out.println("Enter the Pincode of Area to Change:");
				int pin1 = sc.nextInt();
				System.out.println("Enter the Phone Number to change:");
				long phoneNo1 = sc.nextLong();
				e.setName(name1);
				e.setPin(pin1);
				e.setPhoneNo(phoneNo1);
			}
				break;
			case 3: {
				exit = false;
			}
				break;
			default: {
				System.out.println("Enter Valid Selection");
			}
			}
		}

	}

}
