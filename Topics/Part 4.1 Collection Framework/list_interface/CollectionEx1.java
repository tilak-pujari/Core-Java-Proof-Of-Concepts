package list_interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionEx1 {

	public static void main(String[] args) {
		List<String> words = List.of("Apple", "Bat");
		System.out.println(words);

		System.out.println("-----------ArrayList---------------");
		ArrayList<String> wordsal = new ArrayList(words);
		System.out.println(wordsal);

		wordsal.add("Cat");
		System.out.println(wordsal);

		wordsal.add(3, "Crow");
		System.out.println(wordsal);

		wordsal.addAll(words);
		System.out.println(wordsal);

		wordsal.addAll(2, words);
		System.out.println(wordsal);
		System.out.println("-------------LinkedList--------------");
		LinkedList<String> wordsll = new LinkedList(words);
		System.out.println(wordsll);

		wordsll.add("Cat");
		System.out.println(wordsll);

		wordsll.add(3, "Crow");
		System.out.println(wordsll);

		wordsll.addAll(words);
		System.out.println(wordsll);

		wordsll.addAll(2, words);
		System.out.println(wordsll);

		System.out.println("-------------Vector--------------");
		Vector<String> wordsvector = new Vector(words);
		System.out.println(wordsvector);

		wordsvector.add("Cat");
		System.out.println(wordsvector);

		wordsvector.add(3, "Crow");
		System.out.println(wordsvector);

		wordsvector.addAll(words);
		System.out.println(wordsvector);

		wordsvector.addAll(2, words);
		System.out.println(wordsvector);

	}

}
