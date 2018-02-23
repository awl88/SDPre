import java.util.Scanner;

public class DictionaryOrder {
  public static void main(String[]args){
    Scanner keyboard = new Scanner(System.in);
    String name;

    System.out.print("Make up the name of a programming language! ");
    name = keyboard.nextLine();

    if (name.compareToIgnoreCase("C++") < 0)
      System.out.println(name + " comes BEFORE C++");
    if (name.compareToIgnoreCase("C++") == 0)
      System.out.println("C++ isn't a made-up language!");
    if (name.compareToIgnoreCase("C++") > 0)
      System.out.println(name + " comes AFTER C++");

    if (name.compareToIgnoreCase("go") < 0)
      System.out.println(name + " comes BEFORE go");
    if (name.compareToIgnoreCase("go") == 0)
      System.out.println("go isn't a made-up language!");
    if (name.compareToIgnoreCase("go") > 0)
      System.out.println(name + " comes AFTER go");

    if (name.compareToIgnoreCase("java") < 0)
      System.out.println(name + " comes BEFORE java");
    if (name.compareToIgnoreCase("java") == 0)
      System.out.println("java isn't a made-up language!");
    if (name.compareToIgnoreCase("java") > 0)
      System.out.println(name + " comes AFTER java");

    if (name.compareToIgnoreCase("lisp") < 0)
      System.out.println(name + " comes BEFORE lisp");
    if (name.compareToIgnoreCase("lisp") == 0)
      System.out.println("lisp isn't a made-up language!");
    if (name.compareToIgnoreCase("lisp") > 0)
      System.out.println(name + " comes AFTER lisp");

    if (name.compareToIgnoreCase("python") < 0)
      System.out.println(name + " comes BEFORE python");
    if (name.compareToIgnoreCase("python") == 0)
      System.out.println("python isn't a made-up language!");
    if (name.compareToIgnoreCase("python") > 0)
      System.out.println(name + " comes AFTER python");

    if (name.compareToIgnoreCase("ruby") < 0)
      System.out.println(name + " comes BEFORE ruby");
    if (name.compareToIgnoreCase("ruby") == 0)
      System.out.println("ruby isn't a made-up language!");
    if (name.compareToIgnoreCase("ruby") > 0)
      System.out.println(name + " comes AFTER ruby");

    if (name.compareToIgnoreCase("visual basic") < 0)
      System.out.println(name + " comes BEFORE visual basic");
    if (name.compareToIgnoreCase("visual basic") == 0)
      System.out.println("visual basic isn't a made-up language!");
    if (name.compareToIgnoreCase("visual basic") > 0)
      System.out.println(name + " comes AFTER visual basic");
  }
}
