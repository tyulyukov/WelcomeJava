package phonebook;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PhoneBook implements Collection<Contact> {
    private ArrayList<Contact> contacts = new ArrayList<>();

    @Override
    public boolean add(Contact contact) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Contact> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }


    @Override
    public int size() {
        return contacts.size();
    }

    @Override
    public boolean isEmpty() {
        return contacts.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return contacts.contains(o);
    }

    @Override
    public Iterator<Contact> iterator() {
        return contacts.iterator();
    }

    @Override
    public Object[] toArray() {
        return contacts.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return contacts.toArray(a);
    }
    @Override
    public boolean containsAll(Collection<?> c) {
        return contacts.containsAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return contacts.retainAll(c);
    }
}
