import java.util.Set;

/**
 * Created by Robert Burek
 */
public class Finder {
    static void findContact(Set<String> contacts, String input) {
        for (String string : contacts) {
            if (string.contains(input)) {
                // wypisanie wyników
                System.out.println(string);
            }
        }
    }
}
