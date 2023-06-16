package primitiveDataTypes;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('D');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isDigit());
		System.out.println(myChar.isAlphabet());
		System.out.println(myChar.isConsonant());

		MyChar.printUppercaseAlphabets();
		MyChar.printLowercaseAlphabets();

	}

}
