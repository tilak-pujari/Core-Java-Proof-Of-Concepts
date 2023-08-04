package ListInterface;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Ram");
		al.add(23565);
		al.add('a');
		al.add(false);
		al.add(36.57);

		System.out.println(al);
		System.out.println(al.get(1));// get value by index
		System.out.println(al.contains("Ram"));// check value in arraylist

		ArrayList<String> als = new ArrayList<String>();
		als.add("String");
		als.add("Kiran");
		als.add("String");
		// als.add(25); only String literals allowed
		System.out.println(als);


	}

}
