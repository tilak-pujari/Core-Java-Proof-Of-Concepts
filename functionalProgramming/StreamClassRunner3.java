package functionalProgramming;

import java.util.List;

public class StreamClassRunner3 {

	public static void main(String[] args) {

		List<String> list = List.of("Amar", "Buvan", "Ram", "Rahim", "Om");
		List<Integer> numlist = List.of(101, 54, 83, 45, 13, 97);

		list.stream().map(String::toLowerCase).forEach(System.out::println);

		list.stream().filter(e -> e.length() == 5).map(String::toLowerCase)
				.forEach(System.out::println);

		// print number greater than 50
		numlist.stream().filter(e -> e > 50).forEach(System.out::println);



	}

}
