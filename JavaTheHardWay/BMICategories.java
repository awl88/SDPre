import java.util.Scanner;

public class BMICategories {
  public static void main(String[]args) {
    Scanner keyboard = new Scanner(System.in);
    double feet, inches, feet2, height, weight, bmi;

    System.out.print("Please enter your height (feet only): ");
    feet = keyboard.nextDouble();

    System.out.print("Now enter the inches: ");
    inches = keyboard.nextDouble();

    System.out.print("Please enter your weight in pounds: ");
    weight = keyboard.nextDouble();

    System.out.println("-----------------------------------");

    feet2 = feet*12;
    height = feet2+inches;
    bmi = (weight*703)/(height*height);

    System.out.println("Your BMI is: " + bmi);
    System.out.print("BMI category: ");
    if (bmi < 15) {
      System.out.println("very severely underweight");
    }
    else if (bmi <=16) {
      System.out.println("severely underweight");
    }
    else if (bmi < 18.5) {
      System.out.println("underweight");
    }
    else if (bmi < 25) {
      System.out.println("normal weight");
    }
    else if (bmi < 30) {
      System.out.println("overweight");
    }
    else if (bmi < 35) {
      System.out.println("moderately overweight");
    }
    else if (bmi < 40) {
      System.out.println("severely obese");
    }
    else {
      System.out.println("very severely/\"morbidly\" obese");
    }
  }
}
