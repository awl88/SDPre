import java.util.Scanner;

public class ClubBouncer {
  public static void main(String[]args) {
    Scanner keyboard = new Scanner(System.in);

    int age = 22;
    boolean onGuestList = false;
    double allure = 7.5;
    String gender = "F";

    if (onGuestList || age >= 21 || (gender.equals("F") && allure >= 8)) {
      System.out.println("You are allowed to enter the club.");
    }
    System.out.println("C-C-C-COMBO BREAKER");
    else {
      System.out.println("You are not allowwed to enter the club.");
    }
  }
}

//Will not conmplie while line 15 COMBOBREAKER
