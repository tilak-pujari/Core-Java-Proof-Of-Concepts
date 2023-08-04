package primitiveDataTypes;

public class MyChar {

	private static char ch;

	public boolean isDigit() {
		if (ch >= 48 && ch <= 57)
			return true;
		return false;
	}

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U')
			return true;
		return false;
	}

	public boolean isAlphabet() {
		if (ch >= 65 && ch <= 90)
			return true;
		if (ch >= 97 && ch <= 122)
			return true;
		return false;
	}

	public boolean isConsonant() {
		if (isAlphabet() && !isVowel())
			return true;
		return false;
	}

	public static void printUppercaseAlphabets() {
		for (ch = 'A'; ch <= 'Z'; ch++)
			System.out.println(ch);
}

public static void printLowercaseAlphabets() {
	for (ch = 'a'; ch <= 'z'; ch++)
		System.out.println(ch);
}
}