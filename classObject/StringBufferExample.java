package classObject;

import java.util.Scanner;

public class StringBufferExample {
	static String reverse = "";

	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("Hello");
		// reversing a string
		// s = s.reverse();
		// concat String
		s = s.append("Who");
		System.out.println(s);

		System.out.println("Enter the String tobe Reversed");
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toLowerCase();
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			reverse += ch;
		}
		System.out.println(reverse);
		if (str.equals(reverse)) {
			System.out.println("Given String " + str + " is Palindrome");
		} else {
			System.out.println("Given String " + str + "  is Not a Palindrome");
		}
	}


}
