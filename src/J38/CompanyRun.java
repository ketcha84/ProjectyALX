package J38;

import java.util.Scanner;

public class CompanyRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CompanyController companyController = new CompanyController();


        while (true) {
            System.out.println("1-dodaj, 2-wyswietl, 3-usun, 4-zmien, 5*-wyszukaj, 6-koniec");
            String menu = scanner.nextLine();

            if (menu.equals("1")) {
                //pytania: imie, nazwisko, pensja (String)
                System.out.println("Podaj imie");
                String imie = scanner.nextLine();

                System.out.println("Podaj nazwisko");
                String nazwisko = scanner.nextLine();

                System.out.println("Podaj wyplate");
                String wyplata = scanner.nextLine();

                companyController.dodaj(imie, nazwisko, wyplata);


            } else if (menu.equals("2")) {
                companyController.odczytaj();
            } else if (menu.equals("3")) {
                System.out.println("Podaj nazwisko");
                String nazwisko = scanner.nextLine();
                companyController.usun(nazwisko);

            } else if (menu.equals("4")) {
                //pytania: nazwisko, noweImie, noweNazwisko
                System.out.println("Podaj nazwisko");
                String nazwisko = scanner.nextLine();

                System.out.println("Podaj nowe imie");
                String noweImie = scanner.nextLine();

                System.out.println("Podaj nowe nazwisko");
                String noweNazwisko = scanner.nextLine();

                companyController.zmien(nazwisko, noweImie, noweNazwisko);

            } else if (menu.equals("5")) {
                //pytania: fraza, ktora jest szukana w imieniu i nazwisku
                System.out.println("Podaj fraze");
                String s = scanner.nextLine();
                companyController.wyszukaj(s);
            } else if (menu.equals("6")) {
                break;
            }

        }
    }
}
