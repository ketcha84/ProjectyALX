package J37_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/J37_1/imiona.txt");
        Scanner scanner = new Scanner(file);
        ArrayList<Imiona> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            list.add(new Imiona(scanner.nextLine()));
        }
        int count = 1;
        for (Imiona i : list) {
            System.out.println("Imie" + "(" + count++ + ") " + i.getImie());
        }
    }
}
