import models.Contact;

public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact("maks", "+38088005553535");
        System.out.println(contact);

        System.out.println("\n---------------\n");

        MyArray arr = new MyArray();
        arr.run();
    }
}