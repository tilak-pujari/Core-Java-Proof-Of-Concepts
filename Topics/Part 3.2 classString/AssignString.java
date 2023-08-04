package classString;

public class AssignString {
	public static void main(String[] args) {
		String name = "b12@c$";
		String s1 = "";
		String s2 = "";
		String s3 = "";
		String s = name.toLowerCase();
		for (int i = 0; i < name.length(); i++) {
			char ch2 = name.charAt(i);
			for (int ch = 'a'; ch <= 'z'; ch++) {
				if (ch2 == ch) {
					s1 += ch2;
				}
			}
		}
		for (int j = 0; j < name.length(); j++) {
				char ch3 = name.charAt(j);

			for (int k =0; k <=9; k++) {
				int ch = ch3;
				if (ch == k) {
					s2 += ch;
				}
			}
		}
		System.out.println(s1);
		System.out.println(s2);
	}
}