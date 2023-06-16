package MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIteratorEx {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Batman");
		hm.put(1, "Superman");
		hm.put(2, "Arrow");
		hm.put(3, "Robin");
		hm.put(4, "Hex");
		hm.put(5, "Robin");

		System.out.println(hm);
		Set sn = hm.entrySet();
		System.out.println(sn);
		Iterator i = sn.iterator();

		while (i.hasNext()) {
			Map.Entry mp = (Map.Entry) i.next();

			System.out.println(mp.getKey());
			System.out.println(mp.getValue());

		}

	}
}
