package MapInterface;

import java.util.Hashtable;

public class HashTableEx {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(1, "A");
		ht.put(2, "B");
		ht.put(3, "C");
		ht.put(4, "D");
		ht.put(5, "E");
		ht.put(5, "F");
		ht.put(6, "F");
		System.out.println(ht);

	}

}
