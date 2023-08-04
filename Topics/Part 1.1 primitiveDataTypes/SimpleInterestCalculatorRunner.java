package primitiveDataTypes;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {
		SimpleInterestCalculator calculator = new SimpleInterestCalculator("10000.00", "8.0");
		BigDecimal totalValue = calculator.calculateTotalValue(10);
		System.out.println(totalValue);
	}
}
