package phoneBook;

import java.util.ArrayList;

public class PhoneBook {
    public ArrayList<Contact> contacts;

    public PhoneBook() {
        contacts = new ArrayList<Contact>();
    }

    public void add(Contact contact) {
        contacts.add(contact);
    }
    
    public void print() {
        for (int i = 0; i < contacts.size(); i++) {
            var contact = contacts.get(i);
            System.out.println(contact.fullName + " (" + contact.phoneNumber + ")");
        }
    }
}
