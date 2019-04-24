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
    public static void main(String[] args) throws Exception {

        // wygenerowanie danych
        Set<String> daneKontaktowe = new HashSet<String>(Arrays.asList(
                "Anna Janicka a.janicka@mail.pl",
                "Jan Janicka j.jan@wp.pl",
                "Paweł Borek pawelpawelek@mmail.pl"
        ));

        // pobrać dane do wyszukiwania
        Scanner scanner = new Scanner(System.in);
        String query = scanner.nextLine();

        // wykonanie wyszukiwania
        for (String string : daneKontaktowe) {
            if (string.contains(query)) {
                // wypisanie wyników
                System.out.println(string);
            }
        }

    }
}
