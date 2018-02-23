import java.util.Scanner;

public class ItemNotFound2 {
  public static void main(String[]args) {
    Scanner keyboard = new Scanner(System.in);

    String[] heroes = {
      "Abderus", "Achilles", "Aeneas", " Ajax", "Amphitryon",
      "Bellerophon", "Castor", "Chrysippus", "Daedalus", "Diomedes",
      "Eleusis", "Eunostus", "Ganymede", "Hector", "Iolaus", "Jason",
      "Meleager", "Odysseus", "Orpheus", "Perseus", " Theseus"
    };
    String guess;
    int numFound;

    System.out.println("Pop Quiz!");
    System.out.print("Name any *mortal* hero from Greek mythology: ");
    guess = keyboard.next();
    numFound = 0;
    for (String hero : heroes) {
      if (guess.trim().toUpperCase().equals(hero.trim().toUpperCase())) {
        System.out.println("That's one of them!");
        numFound++;
      }
    }
    if (numFound == 0) {
      System.out.println("No, " + guess + " wasn't a Greek mortal hero.");
    }
  }
}
