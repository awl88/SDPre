public class ArrayIntro {
  public static void main(String[]args) {
    String[] planets = { "Mercury", "Venus", "Earth", "Mars",
                         "Jupiter", "Saturn", "Uranus", "Neptune"};

    for (String p : planets) {
      System.out.println(p + "\t" + p.toUpperCase());
    }
    String[] dbz = {"Goku", "Gohan", "Goten", "Vegeta", "Trunks"};

    for (String d : dbz) {
      System.out.println(d + "'s power level is over 9000!!!");
    }
  }
}
