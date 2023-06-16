package classString;

import java.util.Scanner;

public class NumberOfCharName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String name = sc.nextLine();
		String s = name.toLowerCase();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			count++;
		}
		System.out.println("Number of letters in name " + name + " is" + count);

	}
}
