package Encapsulation;

import java.util.Scanner;
public class WWEDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("**** Welcome to WWE ****");
		System.out.println("Create Account");
		System.out.println("Enter your User Name:");
		String userName = sc.next();
		System.out.println("Enter your Phone Number:");
		long phoneNo = sc.nextLong();
		System.out.println("Enter your Gender:\nM-Male\nF-Female");
		char gender = sc.next().charAt(0);
		System.out.println("Enter your password:");
		int pwd = sc.nextInt();
		WWE w = new WWE(userName, phoneNo, gender, pwd);
		System.out.println("Account Created Successfully");
		Wrestlers wr = null;
		boolean exit=true;
		while(exit) {
		System.out.println("Enter your Choice\n1.Login\n2.Exit");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("Enter the Phone Number:");
			long phoneNo1=sc.nextLong();
			System.out.println("Enter the Password:");
			int pwd1 = sc.nextInt();
			if (w.getPhoneNo() == phoneNo1 && w.getPwd() == pwd1) {
				boolean logout = true;
				while (logout) {
			System.out.println(
					"Select your Choice\n1.Add Wrestlers\n2.Update Wrestlers\n3.Display Wrestlers\n4.Show Account Details\n5.Logout");
			int choice1=sc.nextInt();
			switch(choice1) {
			case 1: {
				System.out.println("Enter the Wrestler Name:");
				String name = sc.next();
				System.out.println("Enter the Wrestler Roaster:");
				String roaster = sc.next();
				System.out.println("Enter the Wrestler Win Percentage:");
				double winRatio = sc.nextDouble();
				System.out.println("Enter How Many Times the Wrestler Won?");
				int champion = sc.nextInt();
				wr = new Wrestlers(name, roaster, winRatio, champion);
			}
				break;
			case 2: {
				System.out.println("Enter the Wrestler Name to change:");
				String name1 = sc.next();
				System.out.println("Enter the Wrestler Roaster to change:");
				String roaster1 = sc.next();
				System.out.println("Enter the Wrestler Win Percentage to Change:");
				double winRatio1 = sc.nextDouble();
				System.out.println("Enter How Many Times the Wrestler Won? Update");
				int champion1 = sc.nextInt();
				wr.setName(name1);
				wr.setRoaster(roaster1);
				wr.setWinRatio(winRatio1);
				wr.setChampion(champion1);
			}
				break;
			case 3: {
				wr.wrestlerDetails();
			}
				break;
			case 4: {
				w.details();
			}
				break;
			case 5: {
				logout = false;
			}
				break;
			default: {
				System.out.println("Invalid Selection????");
			}
			}
		}
	} else {
		System.out.println("Incorrect Credentials!!!!!");
	}
		}
		break;
			case 2:{
				exit=false;
			}break;
			default:{
				System.out.println("Enter Valid Choice!!! Try Again");
			}
		}
		}
	}
}
