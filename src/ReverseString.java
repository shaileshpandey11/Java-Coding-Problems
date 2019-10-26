/**
 * Created by Shailesh on 12/26/2016.
 */
public class ReverseString {
	
	public static void main(String args[]) {
		String input = "Inception";
		char[] tempChar = input.toCharArray();
		char[] result = new char[tempChar.length];

		for (int i = 0; i < tempChar.length; i++) {
			result[i] = tempChar[tempChar.length - i - 1];
		}
		System.out.println("Reverse String: " + new String(result));
		System.out.println("Reverse String: " + reverse(input));
	}
	
	private static String reverse(String str) {
    	return new StringBuilder(str).reverse().toString();
    }

}
