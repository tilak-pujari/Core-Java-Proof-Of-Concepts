package functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FPRange {

	public static void main(String[] args) {
		List<Integer> list = List.of(10, 25, 35, 68, 41);

		ArrayList<Integer> listal = new ArrayList<Integer>(list);

		System.out.println("Square of Number 1-10");
		IntStream.range(1, 11).map(e -> e * e).forEach(e -> System.out.println(e));

		System.out.println("Cube of Number 1-10");
		IntStream.range(1, 11).map(e -> e * e * e).forEach(e -> System.out.println(e));
	}

}
