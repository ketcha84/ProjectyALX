import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class J21_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String[]> listaZnajomych = new ArrayList<>();
        String nazwisko;

        System.out.println("Witaj w programie");
        while (true) {

            System.out.println("1-Dodaj, 2-Pokaz, 3-Usun, 4-Edytuj, 5-Koniec, 6-Szukanie");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                String[] record = new String[4];

                System.out.println("Podaj imie:");
                record[0] = scanner.nextLine();

                System.out.println("Podaj nazwisko:");
                record[1] = scanner.nextLine();

                System.out.println("Podaj telefon:");
                record[2] = scanner.nextLine();

                System.out.println("Podaj email:");
                record[3] = scanner.nextLine();
                listaZnajomych.add(record);

                System.out.println("Dodany nowy kontakt.");
            } else if (menu == 2) {
                for (String[] array : listaZnajomych) {
                    System.out.printf("Imie: %s Nazwisko: %s Telefon: %s Email: %s\n", array[0], array[1], array[2], array[3]);
                }

            } else if (menu == 3) {

                System.out.println("Podaj nazwisko:");
                boolean usunieto = false;
                nazwisko = scanner.nextLine();
                for (String[] array : listaZnajomych) {
                    if (array[1].equals(nazwisko)) {
                        listaZnajomych.remove(array);
                        System.out.println("Usunieto nazwisko.");
                        usunieto = true;
                        break;
                    }
                }
                if (!usunieto) {
                    System.out.println("Nie odnaleziono osoby o podanym nazwisku");
                }

            } else if (menu == 4) {

                System.out.println("Podaj nazwisko");
                nazwisko = scanner.nextLine();
                boolean found = false;
                for (int i = 0; i < listaZnajomych.size(); i++) {
                    String[] arr = listaZnajomych.get(i);
                    if (arr[1].equals(nazwisko)) {
                        found = true;
                        System.out.println("Podaj nowe imie:");
                        arr[0] = scanner.nextLine();
                        System.out.println("Podaj nowe nazwisko:");
                        arr[1] = scanner.nextLine();
                        System.out.println("Podaj nowy telefon:");
                        arr[2] = scanner.nextLine();
                        System.out.println("Podaj nowy email:");
                        arr[3] = scanner.nextLine();
                        listaZnajomych.set(i, arr);
                        System.out.println("Zmieniono.");
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Nie odnaleziono osoby o podanym nazwisku");
                }

            } else if (menu == 5) {
                System.out.println("Koniec programu");
                break;
            } else if (menu == 6) {
                System.out.println("Podaj fraze do szukania:");
                String f = scanner.nextLine();
                boolean found = false;
                for (String[] array : listaZnajomych) {
                    if (array[0].contains(f) || array[1].contains(f)) {
                        found = true;
                        System.out.printf("Imie: %s Nazwisko: %s Telefon: %s Email: %s\n", array[0], array[1], array[2], array[3]);
                    }
                }
                if (!found) {
                    System.out.println("Nie odnaleziono");
                }
            } else {
                System.out.println("Nierozpoznana opcja menu");
            }
        }
    }
}
