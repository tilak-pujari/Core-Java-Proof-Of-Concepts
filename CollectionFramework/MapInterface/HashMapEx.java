package MapInterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapEx {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("AA", 32);
		hm.put("ABC", 35);
		hm.put("DEFG", 85);
		hm.put("GIF", 75);
		hm.put("LKJFGD", 75);
		hm.put("TESTING", 35);
		hm.put("AA", 65);
		System.out.println(hm);
		Map<String, Integer> hm1 = new LinkedHashMap<String, Integer>();
		hm1.put("AA", 32);
		hm1.put("ABC", 35);
		hm1.put("YEFG", 85);
		hm1.put("GIF", 75);
		hm1.put("LKJFGD", 75);
		hm1.put("TESTING", 35);
		hm1.put("AA", 65);
		System.out.println(hm1);

		Map<String, Integer> hm2 = new TreeMap<String, Integer>();
		hm2.put("AA", 32);
		hm2.put("ABC", 35);
		hm2.put("YEFG", 85);
		hm2.put("GIF", 75);
		hm2.put("LKJFGD", 75);
		hm2.put("TESTING", 35);
		hm2.put("AA", 65);
		System.out.println(hm2);

		/*
		 * iterator for (Map.Entry map : hm2.entrySet()) { System.out.println(map); }
		 */

		Map<String, Map<String, Integer>> genre = new TreeMap<>();
		genre.put("Book", hm2);
		System.out.println(genre);

	}

}
