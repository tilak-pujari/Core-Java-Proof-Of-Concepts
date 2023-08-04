package com.whatsapp;

public class WhatsappHelper implements Whatsapp {
	User u;
	Status s;

	WhatsappHelper() {

	}

	public WhatsappHelper(User u) {
		this.u = u;
	}

	public WhatsappHelper(Status s) {
		this.s = s;
	}

	@Override
	public void createAccount(User u) {
		if (this.u == null) {
			this.u = u;
			System.out.println("Account Created Successfully!");
		} else {
			System.out.println("Cannot Create Account it is already Exists!");
		}
	}

	@Override
	public void deleteAccount() {
		if (this.u != null) {
			this.u = null;
			System.out.println("Account Deleted Successfully!");
		} else {
			System.out.println("Cannot delete Account Bcoz Account Not Created!");
		}
	}

	@Override
	public void addStatus(Status s) {
		if (this.s == null) {
			this.s = s;
			System.out.println("Status added Successfully!");
		} else {
			System.out.println("Cannot Add Status since it already exists!");
		}
	}

	@Override
	public void deleteStatus() {
		if (this.s != null) {
			this.s = null;
			System.out.println("Status removed Successfully");
		} else {
			System.out.println("Cannot remove Status BCoz Status not Added yet");
		}
	}

	@Override
	public void showAccDetails() {
		System.out.println("User Name: " + u.userName);
		System.out.println("Password : " + u.pwd);
		System.out.println("Status: " + s.status);
	}

}
