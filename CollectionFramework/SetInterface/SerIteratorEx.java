package SetInterface;

import java.util.HashSet;
import java.util.Iterator;

public class SerIteratorEx {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();

		hs.add("Superman");
		hs.add("Batman");
		hs.add("Flash");
		hs.add("Green Lantern");
		hs.add("Arrow");
		hs.add("Robin");

		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("Superman"));
		System.out.println(hs.remove("Green Lantern"));
		System.out.println(hs);

		Iterator<String> i = hs.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());

		}
	}
}