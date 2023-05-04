package J37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Ksiazka> list = new ArrayList<>();
        File file = new File("src/J37/ksiazki.txt");
        Scanner scanner = new Scanner(file);
        String[] tab = null;
        while (scanner.hasNextLine()) {
            tab = scanner.nextLine().split(";");
            list.add(new Ksiazka(tab[1], tab[0], tab[2]));
        }
        for (Ksiazka k : list) {
            System.out.println(k);
        }
    }
}
