import java.util.Arrays;
import java.util.StringJoiner;

/** Created by Shailesh on 12/26/2016. */
public class ReverseSentence {

  public static void main(String args[]) {
    String input = "My name is Shailesh Pandey";
    String[] temp = input.split(" ");
    String[] result = new String[temp.length];

    for (int i = 0; i < temp.length; i++) {
      result[i] = temp[temp.length - i - 1];
    }
    System.out.println("String after Reverse :" + Arrays.toString(result));
    System.out.println("String after Reverse :" + reverse(input));
  }
  
  private static String reverse(String str) {
	  String[] words = str.split("\\s");
	  StringJoiner reverse = new StringJoiner(" ", "[", "]");
	  for (int i = words.length - 1; i >= 0; i--)
		  reverse.add(words[i]);
	  return reverse.toString();
  }
}