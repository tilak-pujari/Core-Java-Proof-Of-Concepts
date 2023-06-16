package ListInterface;

import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList al = new LinkedList();
		al.add("Ram");
		al.add(23565);
		al.add('a');
		al.add(false);
		al.add(36.57);

		System.out.println(al);
		System.out.println(al.get(1));// get value by index
		System.out.println(al.contains("Ram"));// check value in arraylist

		LinkedList<String> als = new LinkedList<String>();
		als.add("String");
		als.add("Kiran");
		als.add("String");
		// als.add(25); only String literals allowed
		System.out.println(als);

	}

}
