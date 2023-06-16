package exceptionHandling;

public class BankRunner {

	public static void main(String[] args) {
		Bank bank1 = new Bank("USD", 40);
		Bank bank2 = new Bank("EUR", 10);
		bank1.add(bank2);
		System.out.println(bank1);

	}

}
