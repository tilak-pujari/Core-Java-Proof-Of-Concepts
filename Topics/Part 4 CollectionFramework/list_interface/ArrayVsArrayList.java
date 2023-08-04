package list_interface;

import java.util.ArrayList;

public class ArrayVsArrayList {
	public static void main(String[] args) {

		// Initializing an Array
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;

		for (int i : arr) {
			System.out.print(i + " ");
		}
		// Initializing an ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);

		System.out.println("\n" + list);
		// Accessing an element
		int element1 = arr[0];
		int element2 = list.get(0);

		System.out.println("Element 1 value :" + element1);
		System.out.println("Element 2 value :" + element2);
		// Inserting an element
		// arr[3] = 4; // This will give an error because the size of the array is
		// fixed.
		list.add(4); // This will add an element to the ArrayList.

		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\n" + list);

		// Deleting an element
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 2) {
				list.remove(i);
			}
		}
	}
}