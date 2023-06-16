package ListInterface;

import java.util.List;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		List<String> st = new Stack<String>();
//		int n = 5;
//		for (int i = 0; i < n; i++) {
//			st.add(i);
//		}
		st.add("Amar");
		st.add("Kira");
		st.add("Kira");
		st.add("Ball");
		st.add("King");
		System.out.println(st);
		st.remove(0);
		System.out.println(st);
		st.set(0, "10");
		System.out.println(st);

	}

}
