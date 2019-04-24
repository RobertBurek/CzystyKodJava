import java.util.Scanner;
import java.util.Set;

//Zachłannego importu należy unikać w aplikacjach webowych
//import java.util.*;

/**
 * Created by Robert Burek
 */
public class Main {
    public static final String WELCOME_MESSAGE = "Podaj hasło do szukiwania, lub EXIT by zakończyć: ";
    public static final String GOODBYE_MESSAGE = "Zapraszamy ponownie!!!";

    private static Set<String> contacts;
    private static Scanner scanner;
    private static String input;

//    zamiast stałej możemy dodać je do enumy gdy jest ich więcej
//    public static final String EXIT = "EXIT";

    public static void main(String[] args) throws Exception {

        // wygenerowanie danych - wczytanie danych
        contacts = ContactGenerator.createContacts();

        // pobrać dane do wyszukiwania - przygotowanie terminalu
        setUpTerminal();

        // wykonanie wyszukiwania
        runSearchEngine();
        System.out.println(GOODBYE_MESSAGE);

    }

    private static void runSearchEngine() {
        while (!input.contains(MenuOptions.EXIT.name())) {
            Finder.findContact(contacts, input);
            System.out.print(WELCOME_MESSAGE);
            input = scanner.nextLine();
        }
    }

    private static void setUpTerminal() {
        System.out.print(WELCOME_MESSAGE);
        scanner = new Scanner(System.in);
        input = scanner.nextLine();
    }

}
