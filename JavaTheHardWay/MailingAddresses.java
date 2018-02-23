class Address {
  String street;
  String city;
  String state;
  int zip;
}

public class MaillingAddresses {
  public static void main(String[]args) {
    Address uno, dos, tres, mine;

    uno = new Address();
    uno.street = "191 Marigold Lane";
    uno.city = "Miami";
    uno.state = "FL";
    uno.zip = 33179;

    dos = new Address();
    dos.street = "3029 Losh Lane";
    dos.city = "Crafton";
    dos.state = "PA";
    dos.zip = 15205;

    tres = new Address();
    tres.street = "2693 Hannah Street";
    tres.city = "Hickory";
    tres.state = "NC";
    tres.zip = 28601;

    mine = new Address();
    mine.street = "11173 W 17th Ave Apt 5-107";
    mine.city = "Lakewood";
    mine.state = "CO";
    mine.zip = 80215;

    System.out.println(uno.street);
    System.out.println(uno.city + ", " + uno.state + " " + uno.zip);
    System.out.println("\n" + dos.street);
    System.out.println(dos.city + ", " + dos.state + " " + dos.zip);
    System.out.println("\n" + tres.street);
    System.out.println(tres.city + ", " + tres.state + " " + tres.zip);
    System.out.println("\n" + mine.street);
    System.out.println(mine.city + ", " + mine.state + " " + mine.zip);
  }
}
