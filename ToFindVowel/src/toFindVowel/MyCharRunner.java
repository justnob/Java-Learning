package toFindVowel;

public class MyCharRunner {

	public static void main(String[] args) {
		
		MyChar myChar = new MyChar('x');
		
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isDigit());
		System.out.println(myChar.isAlphabet());
		System.out.println(myChar.isConsonant());
		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();

	}

}
