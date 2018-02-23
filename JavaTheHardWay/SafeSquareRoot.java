import java.util.Scanner;

public class SafeSquareRoot {
  public static void main(String[]args) {
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String z;

    System.out.print("Are you ready?!? ");
    z = keyboard.next();

    while (! z.equalsIgnoreCase("Yes")) {
      System.out.println("I guess we'll just wait until you are ready...");
      System.out.println("...");
      System.out.println("...");
      System.out.println("...");
      System.out.print("Are you ready now...? ");
      z = keyboard.next();
    }

    System.out.print("Great! Give me a number, and I'll find the square root. ");
    System.out.print("(No negatives, please.)  ");
    x = keyboard.nextDouble();

    while (x < 0 ) {
      System.out.println("I told you no negative numbers!");
      System.out.print("\nNew number: ");
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);

    System.out.println("The square root of " + x + " is " + y);
  }
}
