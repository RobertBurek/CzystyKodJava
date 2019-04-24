package repository;

import repository.model.ContactItem;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Robert Burek
 */
public class Finder {
    Set<ContactItem> findContact(Set<ContactItem> contacts, String input) {
        return new HashSet<ContactItem>(contacts.stream()
                .filter(contact -> contact.toString().toLowerCase().contains(input.toLowerCase()))
                .collect(Collectors.toList()));
    }
}

