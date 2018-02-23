import java.util.Scanner;

public class EnterPIN {
  public static void main(String[]args) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String pwentry, pw;

    System.out.println("WELCOME TO THE BANK OF JAVA.");
    System.out.print("PLEASE ENTER YOUR PASSWORD: ");
    pwentry = keyboard.next();

    while (!pwentry.equals("hello")) {
      System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
      System.out.print("PLEASE ENTER YOUR PASSWORD: ");
      pwentry = keyboard.next();
    }
      System.out.println("\nPASSWORD ACCEPTED.");

      pin = 12345;

      System.out.print("PLEASE ENTER YOUR PIN: ");
      entry = keyboard.nextInt();

    while(entry != pin) {
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.print("PLEASE ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }
      System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
  }
}
