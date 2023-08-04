package BankingApp;

public class AccountHelper {
	Account a;

	public void createAccount(Account a) {
		if (this.a == null) {
			this.a = a;
			System.out.println("Account Created Successfully!");
		} else {
			System.out.println("Account is already Created");
		}
	}

	public void removeAccount() {
		if (this.a != null) {
			this.a = null;
		} else {
			System.out.println("Account not found!!");
		}
	}
	public void withdraw(double withAmount) {
		if (this.a != null) {
			a.balance = a.balance - withAmount;
			System.out.println("Amount of " + withAmount + " Rupees Withdrawn Successfully\nRemaining Balance :"
					+ a.balance + "Rupees");
		} else {
			System.out.println("Account not found to Withdraw Amount");
		}
	}
	public void deposit(double dipAmount) {
		if (this.a != null) {
			a.balance = a.balance + dipAmount;
			System.out.println("Amount of " + dipAmount + " Rupees Deposited Successfully\nRemaining Balance :"
					+ a.balance + "Rupees");
		} else {
			System.out.println("Account not found to Deposit Amount");
		}
	}

	public void showBalance() {
		if (this.a != null) {
			System.out.println("Amount in Bank Account is " + a.balance + " Rupees");
		}
		else {
			System.out.println("Account not found!!");
		}
	}

	public void showAccountDetails() {
		if (this.a != null) {
		System.out.println("User Name is: " + a.userName);
		System.out.println("Amount in Bank Account is " + a.balance + " Rupees");
		System.out.println("Password :" + a.pwd);
	}
	else {
		System.out.println("Account not found!!");
	}
}
}
