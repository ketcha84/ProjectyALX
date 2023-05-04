package RALX;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Kurs> listaKursow = new ArrayList<>();


        while (true) {

            System.out.println("Witaj w system ALX");
            System.out.println("1-dodaj kurs, 2-wyswietl kursy, 3-dodaj kursanta do kursu, 4-wyswietl kursantow z danego kursu, 5-koniec");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                //pytania: nazwa kursu
                System.out.println("Podaj nazwe kursu");
                String nazwa = scanner.nextLine();
                listaKursow.add(new Kurs(nazwa));
            } else if (menu == 2) {
                for (Kurs kurs : listaKursow) {
                    System.out.println("Kurs: " + kurs.nazwa);
                }
                //Nazwa: ....
                //Nazwa: ....
                //Nazwa: ....
                //Nazwa: ....
            } else if (menu == 3) {
                //pytania: nazwa kursu
                // o imie, nazwisko pytamy wtedy kiedy kurs istnieje, jezeli kurs nie istnieje to informacja
                System.out.println("Podaj nazwe kursu");
                String nazwa = scanner.nextLine();
                boolean contains = false;

                for (Kurs kurs : listaKursow) {
                    if (kurs.nazwa.equals(nazwa)) {
                        contains = true;
                        System.out.println("Podaj imie");
                        String imie = scanner.nextLine();

                        System.out.println("Pdaj nazwisko");
                        String nazwisko = scanner.nextLine();
                        kurs.listaKursantow.add(new Kursant(imie, nazwisko));
                    }
                }
                if (!contains) {
                    System.out.println("Brakuje kursa");
                }
            } else if (menu == 4) {
                //pytania: nazwa kursu
                //Imię: .... Nazwsko: ....
                //Imię: .... Nazwsko: ....
                //Imię: .... Nazwsko: ....
                //Imię: .... Nazwsko: ....
                //Imię: .... Nazwsko: ....

                System.out.println("Podaj nazwe kursu");
                String nazwa = scanner.nextLine();
                for (Kurs kurs : listaKursow) {
                    if (kurs.nazwa.equals(nazwa)) {
                        System.out.println("Kurs: " + kurs.nazwa);
                        for (Kursant kursant : kurs.listaKursantow) {
                            System.out.println("Imie: " + kursant.imie + " Nazwisko: " + kursant.nazwisko);
                        }
                    }
                }
            } else if (menu == 5) {
                break;
            }
        }


    }
}
