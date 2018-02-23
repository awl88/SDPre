import java.io.PrintWriter;
import java.util.Scanner;

public class ReceiptRevisited {
  public static void main(String[]args) throws Exception {
    PrintWriter fileout = new PrintWriter("receipt.txt");
    Scanner kb = new Scanner(System.in);
    double a, b;

    System.out.println("Gas cost $2.089 per gallon.");
    System.out.print("How many gallons would you like? ");
    a = kb.nextDouble();
    b = a*2.089;
    System.out.println();
    System.out.println("Total cost: $" + b);

    System.out.println("Writing receipt...")
    
    fileout.println( "+----------------------+");
    fileout.println( "|                      |");
    fileout.println( "|     Corner Store     |");
    fileout.println( "|                      |");
    fileout.println( "| 2018-02-14  11:52AM  |");
    fileout.println( "|                      |");
    fileout.println( "| Gallons:      " + a + "    |");
    fileout.println( "| Price/Gallon: $2.089 |");
    fileout.println( "|                      |");
    fileout.println( "| Fuel Total:   $" + b +" |");
    fileout.println( "|                      |");
    fileout.println( "+----------------------+");
    fileout.close();


  }
}
