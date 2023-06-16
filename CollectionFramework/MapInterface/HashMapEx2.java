package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx2 {

	public static void main(String[] args) {
		// Creating HashMap
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		// Put elements in Map
		m.put(1, "Mango");
		m.put(2, "Apple");
		m.put(3, "Banana");
		m.put(4, "Grapes");
		// overwrite key 4 // m.put(4, "Mangoes");
		m.put(5, "Grapes");
		m.put(null, "hello");// Only once null declared
		m.put(6, null);
		m.put(7, null);
		System.out.println(m);

		System.out.println("Iterating Hashmap...");
		System.out.println(m.entrySet());

		for (Map.Entry m1 : m.entrySet()) {
			System.out.println(m1.getKey() + " " + m1.getValue());

		}

	}
}
