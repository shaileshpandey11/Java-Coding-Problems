import java.util.Arrays;

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
  }
}
