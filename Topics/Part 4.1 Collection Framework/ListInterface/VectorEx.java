package ListInterface;

import java.util.List;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {

		List<Object> st = new Vector<Object>();
		int n = 5;
		for (int i = 0; i < n; i++) {
			st.add(i);
		}

		st.add("Amar");
		st.add("Kira");
		st.add("Kira");
		st.add("Ball");
		st.add("King");
		System.out.println(st);

		st.remove(0);
		System.out.println(st);

		st.set(0, "Finish");
		System.out.println(st);

		System.out.println(st.get(0));

		st.set(5, "Rock");
		System.out.println(st);

	}
}