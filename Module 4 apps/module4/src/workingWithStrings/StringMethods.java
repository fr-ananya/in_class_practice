package workingWithStrings;


public class StringMethods {

	public static void main(String[] args) {
		String str = "Hello";
		int length = str.length();
		System.out.println("Length " + length);
		
		char ch = str.charAt(1);
		System.out.println("Character : " +ch);
		
		String sub = str.substring(1, 4);
		System.out.println(sub);//ell
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.replace('l', 'p'));
		
		String trimmed = "	Hello	".trim(); // Hello
		System.out.println(trimmed);
	}

}
