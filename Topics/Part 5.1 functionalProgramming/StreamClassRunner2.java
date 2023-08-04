package functionalProgramming;

import java.util.List;

public class StreamClassRunner2 {

	public static void main(String[] args) {

		List<String> list = List.of("Amar", "Buvan", "Ram", "Rahim", "Om");
		List<Integer> numlist = List.of(101, 54, 83, 45, 16, 97);
//Uppercase
		list.stream().map(String::toUpperCase).forEach(System.out::println);
//LowerCase
		list.stream().map(String::toLowerCase).forEach(System.out::println);
//filter ends with a
		list.stream().filter(e -> e.endsWith("m")).forEach(System.out::println);

		System.out.println("Even Numbers from numlist divide by 2");
		numlist.stream().filter(e -> e % 2 == 0)
				.map(e -> e / 2)
				.forEach(System.out::println);

		System.out.println("Odd Numbers from numlist add one");
		numlist.stream().filter(e -> e % 2 == 1)
				.map(e -> e + 1)
				.forEach(System.out::println);

		System.out.println("Number list");
		numlist.stream().forEach(System.out::println);

	}

}
