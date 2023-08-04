package BankingApp;

import java.util.Scanner;

public class AccountDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountHelper ah = new AccountHelper();
		boolean exit = true;
		while (exit) {
			System.out.println("Welcome to Bank!");
			System.out.println(
					"Enter your Choice \n1.Create Account\n2.Delete Account\n3.Withdraw amount\n4.Deposit Amount\n5.Show Balance\n6.Show Account Details\n7.Exit");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: {
				System.out.println("Enter the user name:");
				String userName = sc.next();
				System.out.println("Enter the Balance:");
				double balance = sc.nextDouble();
				System.out.println("Enter your password:");
				int pwd = sc.nextInt();
				ah.createAccount(new Account(userName, balance, pwd));
			}
				break;
			case 2: {
				ah.removeAccount();
			}
				break;
			case 3: {
				System.out.println("Enter AMount to WithDraw!");
				double withAmount = sc.nextDouble();
				ah.withdraw(withAmount);
			}
				break;
			case 4: {
				System.out.println("Enter the Amount to Deposit:");
				double dipAmount = sc.nextDouble();
				ah.deposit(dipAmount);
			}
				break;
			case 5: {
				ah.showBalance();
			}
				break;
			case 6: {
				ah.showAccountDetails();
			}
				break;
			case 7: {
				exit = false;
			}
				break;
			default: {
				System.out.println("Invalid Selection!!! Please Try Again!!");
			}
			}
		}

	}

}
