package repository;

import java.util.Set;

/**
 * Created by Robert Burek
 */
public class ContactsRepo {

    private Set<String> contacts;
    private Finder finder = new Finder();

    public static ContactsRepo init() {
        ContactsRepo contactsRepo = new ContactsRepo();
        contactsRepo.contacts = ContactGenerator.createContacts();
        return contactsRepo;
    }

    public Set<String> findContact(String input) {
        return finder.findContact(contacts, input);
    }
}
