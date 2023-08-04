package com.whatsapp;

public interface Whatsapp {
	public abstract void createAccount(User u);

	public abstract void deleteAccount();

	public abstract void addStatus(Status s);

	public abstract void deleteStatus();

	public abstract void showAccDetails();
}
