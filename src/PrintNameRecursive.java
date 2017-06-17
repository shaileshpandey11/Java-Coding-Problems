/** Created by Shailesh on 1/28/2017. */
public class PrintNameRecursive {

  public String printName(String name) {
    System.out.println(name);
    if (name.isEmpty()) {
      return null;
    }
    return printName(name);
  }

  public static void main(String abc[]) {
    PrintNameRecursive printNameRecursive = new PrintNameRecursive();
    printNameRecursive.printName("Shailesh");
  }
}
