package functionalProgramming;

import java.util.List;

public class StreamClassRunner1 {

	public static void main(String[] args) {
		List<String> list = List.of("Amar", "Buvan", "Ram", "Rahim", "Om");
		List<Integer> numlist = List.of(101, 54, 83, 45, 13, 97);

		list.stream()
				.map(String::toLowerCase)
		.forEach(System.out::println);

		list.stream()
				.map(p -> p.endsWith("ar")).forEach(System.out::println);
		System.out.println("Length of String");
		list.stream()
				.map(String::length).forEach(System.out::println);

		System.out.println("List Numbers");
		numlist.stream().forEach(System.out::println);

		System.out.println("Square Numbers");
		numlist.stream().map(e -> e * e)
				.forEach(System.out::println);

		System.out.println("Even Numbers");
		numlist.stream().map(e -> e % 2 == 0)
				.forEach(System.out::println);

		System.out.println("Odd Numbers");
		numlist.stream().map(e -> e % 2 == 1)
				.forEach(e -> System.out.println(e));
	}

}