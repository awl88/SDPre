import java.io.File;
import java.util.Scanner;

public class GettingFromFile {
  public static void main(String[]args) throws Exception {
    String name, na;
    int a, b, c, d,  sum;

    System.out.print("Getting name and three numbers from file...");
    Scanner fileIn = new Scanner(new File("name-and-numbers.txt"));
      name = fileIn.nextLine();
      a = fileIn.nextInt();
      b = fileIn.nextInt();
      c = fileIn.nextInt();
      na = fileIn.nextLine();
    fileIn.close();

    System.out.println("done.");
    System.out.println("Your name is " + name);
    System.out.println(na);
    sum = a + b + c;
    System.out.println(a + " + " + b + " + " + c + " = " + sum);
  }
}
