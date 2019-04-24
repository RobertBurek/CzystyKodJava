import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Zachłannego importu należy unikać w aplikacjach webowych
//import java.util.*;

/**
 * Created by Robert Burek
 */
public class Main {

//    zamiast stałej możemy dodać je do enumy gdy jest ich więcej
//    public static final String EXIT = "EXIT";

    public static void main(String[] args) throws Exception {

        // wygenerowanie danych
        Set<String> contacts = new HashSet<String>(Arrays.asList(
                "Anna Janicka a.janicka@mail.pl",
                "Jan Janicka j.jan@wp.pl",
                "Paweł Borek pawelpawelek@mmail.pl"
        ));

        // pobrać dane do wyszukiwania
        System.out.print("Podaj hasło do szukiwania, lub EXIT by zakończyć: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // wykonanie wyszukiwania
        do {
            for (String string : contacts) {
                if (string.contains(input)) {
                    // wypisanie wyników
                    System.out.println(string);
                }
            }
            System.out.print("Podaj hasło do szukiwania, lub EXIT by zakończyć: ");
            input = scanner.nextLine();
        } while (!input.contains(MenuOptions.EXIT.name()));

    }
}
