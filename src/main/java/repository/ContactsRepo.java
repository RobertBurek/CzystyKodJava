package repository;

import repository.model.ContactItem;

import java.util.Set;

/**
 * Created by Robert Burek
 */
public class ContactsRepo {

    private Set<ContactItem> contacts;
    private Finder finder = new Finder();

    public static ContactsRepo init() {
        ContactsRepo contactsRepo = new ContactsRepo();
        contactsRepo.contacts = ContactsData.getContactsFromCSV();
        return contactsRepo;
    }

    public Set<ContactItem> findContact(String input) {
        return finder.findContact(contacts, input);
    }
}
