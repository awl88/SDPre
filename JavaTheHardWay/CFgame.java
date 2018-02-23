import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CFgame {
  public static void main(String[]args) throws Exception {
    Scanner keyboard = new Scanner(System.in);
    String coin, again, play, bestName,saveFileName = "coin-flip-score.txt";
    int streak = 0, best;
    boolean gotHeads;

    do {
      System.out.println("| -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- ");

      File f = new File(saveFileName);
      if (f.exists() && f.length() > 0) {
        Scanner input = new Scanner(f);
          bestName = input.next();
          best = input.nextInt();
        input.close();
        System.out.println("|  -High score is " + best + " in a row by " + bestName + "-");
        System.out.println("| ");
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
          System.out.println("|   \tThat's " + streak + " in a row...");
          System.out.print("|   \tWould you like to flip again? (y/n) ");
          again = keyboard.next();
        }
        else {
            streak = 0;
            again = "n";
        }
      } while (again.equals("y"));

      System.out.println("|   Final score: " + streak);
      System.out.println("|");

      if (streak > best) {
        System.out.println("|   That's a new high score!");
        System.out.print("|   Your name: ");
        bestName = keyboard.next();
        best = streak;

        play = "n";

        System.out.print("|   Would you like to play again? (y/n) ");
        play = keyboard.next();

        PrintWriter out = new PrintWriter(f);
          out.println(bestName);
          out.println(best);
        out.close();
      }
      else if (streak == best) {
        System.out.println("|   You tied the high score. Keep at it!");

        System.out.print("|   Would you like to play again? (y/n) ");
        play = keyboard.next();
      }
      else {
        System.out.println("|   You'll have to do better than " + streak + " if you want a high score.");

        System.out.println("|   ");

        System.out.print("|   Would you like to play again? (y/n) ");
        play = keyboard.next();
      }

      System.out.println("|   ");
    } while (play.equals("y"));

    System.out.println("|        Oh, okay, fine, I see how it is...");
    System.out.println("|        I'll just flip coins by myself then I guess...");
    System.out.println();
  }
}
