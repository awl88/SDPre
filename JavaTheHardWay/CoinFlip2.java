import java.util.Scanner;

public class CoinFlip2 {
  public static void main(String[]args) {
    Scanner keyboard = new Scanner(System.in);
    String coin, again;
    int streak = 0;
    boolean gotHeads;

    again = "y"
    
    while (again.equalsIgnoreCase("y")) {
      gotHeads = Math.random() < 0.5;

      if (gotHeads)
        coin = "HEADS";
      else
        coin = "TAILS";

      System.out.println("You flip a coin... and it is " + coin);

      if (gotHeads) {
        streak++;
        System.out.println("\tThat's " + streak + " in a row...");
        System.out.println("\tWould you like to flip again? (y/n) ");
        again = keyboard.next();
      }

      else {
        System.out.println("\tYou flip a coin... and it is " + coin);
        System.out.println("\tLooks like you lose :(");
        streak = 0;
        again = "n";
      }
    }

    while (again.equalsIgnoreCase("y"));

    System.out.println("Final Score: " + streak);
  }
}
