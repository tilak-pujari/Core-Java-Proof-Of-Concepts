package classString;

public class ReverseString {

	public static void main(String[] args) {
		String x = "Malayalam".toLowerCase();
		String reverse = "";

		for (int i = x.length() - 1; i >= 0; i--) {
			char ch = x.charAt(i);
			reverse += ch;
		}
		System.out.println(x);
		System.out.println(reverse);
		if (x.equals(reverse)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

	}
}
