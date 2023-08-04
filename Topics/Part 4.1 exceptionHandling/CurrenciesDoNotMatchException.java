package exceptionHandling;

public class CurrenciesDoNotMatchException extends RuntimeException {
	public CurrenciesDoNotMatchException(String msg) {
		super(msg);
	}
}
