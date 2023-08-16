package SetInterface;

import java.util.TreeSet;

public class TreeSetNumber {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(24);
		set.add(66);
		set.add(12);
		set.add(15);
		set.add(24);
		System.out.println(set);
		System.out.println("Lowest Value: " + set.pollFirst());
		System.out.println("Highest Value: " + set.pollLast());
	}

}
