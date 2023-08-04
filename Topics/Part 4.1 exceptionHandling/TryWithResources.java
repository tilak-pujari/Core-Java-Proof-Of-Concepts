package exceptionHandling;

import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) {
//Auto closes the Scanner class
		try (Scanner sc = new Scanner(System.in)) {
		int[] a = { 5, 10, 15, 20 };
		int b = a[4];
		System.out.println("Method end");
	}
}
}
