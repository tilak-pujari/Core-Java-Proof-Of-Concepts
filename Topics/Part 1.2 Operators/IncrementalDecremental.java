package operators;

public class IncrementalDecremental {

	public static void main(String[] args) {
		int a = 5;
		a++;
		System.out.println(a);

		int b = 5;
		b = b++;
		System.out.println(b);
		int b1 = 5;
		b1 = ++b1;
		System.out.println(b1);

		int c = 4;
		c = --c;
		System.out.println(c);
	}

}
