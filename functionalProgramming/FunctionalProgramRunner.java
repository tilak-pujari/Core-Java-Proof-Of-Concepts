package functionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class FunctionalProgramRunner {

	public static void main(String[] args) {

		List<Integer> list = List.of(10, 25, 35, 68, 41);

		ArrayList<Integer> listal = new ArrayList<Integer>(list);

		listal.stream().forEach(e -> System.out.println("List Numbers:" + e));

		listal.stream().filter(e -> e % 2 == 0)
				.forEach(e -> System.out.println("Even Number :" + e));
		
		listal.stream().filter(e -> e % 2 == 1)
				.forEach(e -> System.out.println("Odd Number :" + e));
	}

}
