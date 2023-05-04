package J23_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        ArrayList<Uczen> listaUczniow = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w systemie zarzadzania uczniami");
        while (true) {

            System.out.println("1-dodaj ucznia, 2-pokaz uczniow, 3-dodaj ocene uczniowu, 4-wyswietl ucznia wraz z ocenami, 5-koniec");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                //pytania: imie, nazwisko
                System.out.println("Podaj imie");
                String name = scanner.nextLine();

                System.out.println("Podaj nazwisko");
                String nazwisko = scanner.nextLine();

                listaUczniow.add(new Uczen(name, nazwisko));

            } else if (menu == 2) {
                //wypisanie wszystkich uczniow (pętlą)
                for (Uczen uczen : listaUczniow) {
                    System.out.println(uczen);
                }
            } else if (menu == 3) {
                //pytania: nazwisko, ocena
                System.out.println("Podaj nazwisko");
                String nazwisko = scanner.nextLine();
                System.out.println("Podaj ocene");
                int o = scanner.nextInt();
                scanner.nextLine();
                for (Uczen uczen : listaUczniow) {
                    if (uczen.getNazwisko().equals(nazwisko)) {
                        uczen.addOcene(o);
                        break;
                    }
                }
            } else if (menu == 4) {
                //pytania:  nazwisko
                System.out.println("Podaj nazwisko");
                String nazwisko = scanner.nextLine();
                for (Uczen uczen : listaUczniow) {
                    if (uczen.getNazwisko().equals(nazwisko)) {
                        System.out.println(uczen.getOceny());
                    }
                }
            } else if (menu == 5) {
                break;
            }
        }
    }

}