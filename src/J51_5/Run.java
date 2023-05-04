package J51_5;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Run {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();

        while (true) {
            System.out.println("1-dodaj, 2-wyswietl, 3-usun, 4-zmien, 5-koniec");
            String menu = scanner.nextLine();

            if (menu.equals("1")) {
                //pytania: imie, nazwisko, telefon, email
                System.out.println("Podaj imie");
                String imie = scanner.nextLine();
                System.out.println("Podaj nazwisko");
                String nazwisko = scanner.nextLine();

                System.out.println("Podaj telefon");
                String telefon = scanner.nextLine();

                System.out.println("Podaj email");
                String email = scanner.nextLine();
                controller.dodaj(imie, nazwisko, telefon, email);


            } else if (menu.equals("2")) {
                controller.pokaz();

            } else if (menu.equals("3")) {
                //pytania: nazwisko
                System.out.println("Podaj nazwisko");
                String nazwisko = scanner.nextLine();
                controller.usun(nazwisko);

            } else if (menu.equals("4")) {
                //pytania: nazwisko, noweImie, noweNazwisko
                System.out.println("Podaj nazwisko");
                String nazwisko = scanner.nextLine();

                System.out.println("Podaj nowe imie");
                String noweImie = scanner.nextLine();

                System.out.println("Podaj nowe nazwisko");
                String noweNazwisko = scanner.nextLine();

                controller.zmien(nazwisko, noweImie, noweNazwisko);

            } else if (menu.equals("5")) {
                break;
            }

        }
    }
}
