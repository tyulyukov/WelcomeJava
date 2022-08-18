import models.Contact;

public class MyArray implements Runnable {
    @Override
    public void run() {
        var contact1 = new Contact("maks", "+38088005553535");
        var contact2 = new Contact("sereja", "+38088005553535");

        var contacts = new Contact[] { contact1, contact2 };

        printContacts(contacts);

        contact1.setName("maksik");

        printContacts(contacts);
    }

    private void printContacts(Contact[] contacts) {
        for (int i = 0; i < contacts.length; i++) {
            System.out.println(contacts[i]);
        }
    }
}
