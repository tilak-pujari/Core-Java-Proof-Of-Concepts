package ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLVsLinkedL {

	public static void main(String[] args) {
		ArrayList<String> marvel = new ArrayList<String>();

		marvel.add("Avengers");
		marvel.add("Avengers:Agen of Ultron");
		marvel.add("Avengers:Infinity War");
		marvel.add("Avengers:EndGame");
		System.out.println(marvel);
		marvel.add(2, "Captain America");
		System.out.println(marvel);

		LinkedList marvel2 = new LinkedList();
		marvel2.add("Avengers");
		marvel2.add("Avengers:Agen of Ultron");
		marvel2.add("Avengers:Infinity War");
		marvel2.add("Avengers:EndGame");
		System.out.println(marvel2);
		marvel2.add(2, "Captain America");
		marvel2.add(4, "Captain America:Civil War");
		marvel2.add(3, "Captain America:Winter Soldier");
		System.out.println(marvel2);

	}

}
