package exceptionHandling;

public class Bank {

	private String currency;
	private int amount;

	Bank(String currency, int amount) {
		this.currency = currency;
		this.amount = amount;
	}

	// Unchecked Exception
	/*
	 * public void add(Bank that) { if (!this.currency.equals(that.currency)) {
	 * throw new RuntimeException("Currency Don't Match " + this.currency + " & " +
	 * that.currency); } this.amount = this.amount + that.amount; }
	 */
	// Checked Exception
	/*
	 * public void add(Bank that) throws Exception { if
	 * (!this.currency.equals(that.currency)) { throw new
	 * Exception("Currency Don't Match " + this.currency + " & " + that.currency); }
	 * this.amount = this.amount + that.amount; }
	 */

	public void add(Bank that) {
		if (!this.currency.equals(that.currency)) {
			throw new CurrenciesDoNotMatchException("Currency Don't Match " + this.currency + " & " + that.currency);
		}
		this.amount = this.amount + that.amount;
	}

	@Override
	public String toString() {
		return currency + " " + amount;
	}

}
