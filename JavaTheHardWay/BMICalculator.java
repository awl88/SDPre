import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double f, i, a, b, lb, bmi;

    System.out.print("Your (feet only): ");
    f = keyboard.nextDouble();

    System.out.print("Your (inches only): ");
    i = keyboard.nextDouble();

    System.out.print("Your weight in pounds: ");
    lb = keyboard.nextDouble();

    a = f*12;
    b = a+i;
    bmi = (lb*703)/(b*b);

    System.out.println("Your BMI is " + bmi);
  }
}
