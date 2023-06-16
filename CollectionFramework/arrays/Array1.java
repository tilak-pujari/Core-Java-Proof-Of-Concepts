package arrays;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size = sc.nextInt();
		System.out.println("Enter the array Elements");
		int d[] = new int[size];
		for (int i = 0; i < d.length; i++) {
			d[i] = sc.nextInt();
		}
		double sum = 0;
		for (int i = 0; i < d.length; i++) {
			sum += d[i];
		}
		System.out.println("The sum of Given Array is :" + sum);
	}

}
