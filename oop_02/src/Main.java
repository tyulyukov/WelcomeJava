import basics.Human;
import basics.Turtle;
import phoneBook.Contact;
import phoneBook.PhoneBook;

public class Main {
    public static void main2(String[] args) {
        var turtle = new Turtle();
        turtle.swim();

        var turtleMotya = new Turtle("Motya");
        turtleMotya.swim();

        var human = new Human("tyulyukov", 16);
        System.out.println(human);
        System.gc();

        var turtle1 = new Turtle("fucking bitch");
        var turtle2 = turtle1;

        turtle1.name = "pretty girl";

        System.out.println(turtle1.name + " " + turtle2.name);
    }

    public static void main(String[] args) {
        var contact = new Contact();
        contact.phoneNumber = "+380505090407";
        contact.fullName = "Maks";

        var phoneBook = new PhoneBook();
        phoneBook.add(contact);
        phoneBook.print();
    }
}