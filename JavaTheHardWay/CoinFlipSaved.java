import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CoinFlipSaved {
  public static void main(String[]args) throws Exception {
    Scanner keyboard = new Scanner(System.in);
    String coin, again, bestName,saveFileName = "coin-flip-score.txt";
    int streak = 0, best;
    boolean gotHeads;

    System.out.println();

    File f = new File(saveFileName);
    if (f.exists() && f.length() > 0) {
      Scanner input = new Scanner(f);
        bestName = input.next();
        best = input.nextInt();
      input.close();
      System.out.println("|   -High score is " + best + " in a row by " + bestName + "-");
    }
    else {
      System.out.println("|   Save game file doesn't exist or is empty.");
      best = -1;
      bestName = "";
    }
    do {
      gotHeads = Math.random() < 0.5;

      if (gotHeads)
        coin = " HEADS";
      else
        coin = " TAILS";

      System.out.println("|   You flip a coin and it is..." + coin);

      if (gotHeads) {
        streak++;
        System.out.println("|   \t\tTHat's " + streak + " in a row...");
        System.out.print("|   \t\tWould you like to flip again? (y/n) ");
        again = keyboard.next();
      }
      else {
          streak = 0;
          again = "n";
      }
    } while (again.equals("y"));

    System.out.println("|   Final score: " + streak);

    if (streak > best) {
      System.out.println("|   That's a new high score!");
      System.out.print("|   Your name: ");
      bestName = keyboard.next();
      best = streak;
    }
    else if (streak == best) {
      System.out.println("|   You tied the high score. Keep at it!");
    }
    else {
      System.out.println("|   You'll have to do better than " + streak + " if you want a high score.");
    }
    PrintWriter out = new PrintWriter(f);
      out.println(bestName);
      out.println(best);
    out.close();

    System.out.println();
  }
}
