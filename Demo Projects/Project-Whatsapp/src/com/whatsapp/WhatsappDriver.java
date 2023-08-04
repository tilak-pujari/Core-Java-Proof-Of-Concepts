package com.whatsapp;

import java.util.Scanner;

public class WhatsappDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = true;
		WhatsappHelper w = new WhatsappHelper();
		while (exit) {
			System.out.println(
					"Enter the Choice:\n1:Create Account\n2.Delete Account\n3.Add Status\n4.Delete Status\n5.Show Account Details\n6.Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter the User Name:");
				String userName = sc.next();
				System.out.println("Enter the Password:");
				String pwd = sc.next();
				w.createAccount(new User(userName, pwd));
			}
				break;
			case 2: {
				w.deleteAccount();
			}
				break;
			case 3: {
				System.out.println("Enter the Status:");
				String status = sc.next();
				w.addStatus(new Status(status));
			}
				break;
			case 4: {
				w.deleteStatus();
			}
				break;
			case 5: {
				w.showAccDetails();
			}
				break;
			case 6: {
				exit = false;
			}
				break;
			default: {
				System.out.println("Invalid Selection Try Again");
			}
			}
		}

	}
}