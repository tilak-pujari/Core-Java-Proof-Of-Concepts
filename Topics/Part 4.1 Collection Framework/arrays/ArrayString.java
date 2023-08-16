package arrays;

import java.util.Scanner;

public class ArrayString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size = sc.nextInt();
		System.out.println("Enter the array Elements");
		String d[] = new String[size];
		for (int i = 0; i < d.length; i++) {
			d[i] = sc.nextLine();
		}
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
	}

}
