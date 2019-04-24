package repository;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Robert Burek
 */
public class Finder {
    Set<String> findContact(Set<String> contacts, String input) {
        return new HashSet<String>(contacts.stream()
                .filter(contact -> contact.toLowerCase().contains(input.toLowerCase()))
                .collect(Collectors.toList()));
    }
}

