package SetInterface;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String args[]) {

		TreeSet<String> al = new TreeSet<String>();
		al.add("ABC");
		al.add("000");
		al.add("ABC");
		al.add("XYZ");
		al.add("AAA");
		System.out.println(al);
//By Default Ascending Order
		for (String s : al) {
			System.out.print(s + " ");
		}
//checking the Values
		System.out.println("\n" + al.contains("ABC"));
		System.out.println(al.contains("Abc"));
//Ascending Order
		Iterator i1 = al.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
//Descending Order
		Iterator i = al.descendingIterator();
		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}
	}
}
//ascending order
//unique value