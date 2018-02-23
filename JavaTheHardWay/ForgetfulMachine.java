import java.util.Scanner;

public class ForgetfulMachine {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println( "What city is the capitol of France?");
    keyboard.next();

    System.out.println("What is 6 multiplied by 7?");
    keyboard.nextInt();

    System.out.println("Enter a number betweek 0.0 and 1.0");
    keyboard.nextDouble();

    System.out.println("Is there anything else you would like to say?");
    keyboard.next();

    //The 2nd question blows up when you type anything but an integer
    //The 3rd question blows up when you type anything but a double
  }
}
