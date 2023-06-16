package classString;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.next();
		String s1 = s.toLowerCase();
		String s2 = s1.substring(0, 1).toUpperCase();
		String s3 = s1.substring(1, s1.length());
		System.out.println(s2.concat(s3));

		// get the length of String
		System.out.println(s.length());
		// to Lowercase the String
		System.out.println(s.toLowerCase());
		// to uppercase the String
		System.out.println(s.toUpperCase());
		// to compare to Strings
		String a = "Hello";
		String b = "Hello";
		System.out.println(a.equals(b));
		// to get each individual character from string
		System.out.println(a.charAt(0));
		// to get part of String or more character from String
		System.out.println(a.substring(0, 3));
		System.out.println(a.substring(2, 5));

	}

}
