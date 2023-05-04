package J23;

import java.util.ArrayList;
import java.util.Scanner;

public class Run2 {
    public static void main(String[] args) {
        ArrayList<Pracownik> listaPracownikow = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w systemi ezarzadzania pracownika");
        while (true) {

            System.out.println("1-dodaj pracownika, 2-wysiwtel pracownikow, 3-usun pracownika, 4-zmien pracownika, 5-koniec");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                System.out.println("Podaj imie");
                String name = scanner.nextLine();

                System.out.println("Podaj nazwisko");
                String nazwisko = scanner.nextLine();

                System.out.println("Podaj nr telefonu");
                int tel = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Podaj email");
                String email = scanner.nextLine();

                listaPracownikow.add(new Pracownik(name, nazwisko, tel, email));

            } else if (menu == 2) {
                for (Pracownik pracownik : listaPracownikow) {
                    System.out.println(pracownik);
                }

            } else if (menu == 3) {
                System.out.println("Podaj nazwisko");
                String nazwisko = scanner.nextLine();
                Pracownik pr = null;
                for (Pracownik pracownik : listaPracownikow) {
                    if (pracownik.getNazwisko().equals(nazwisko)) {
                        pr = pracownik;
                    }
                }
                listaPracownikow.remove(pr);
            } else if (menu == 4) {

                System.out.println("Podaj nazwisko");
                String currNazw = scanner.nextLine();
                Pracownik current = null;

                for (Pracownik pracownik : listaPracownikow) {
                    if (pracownik.getNazwisko().equals(currNazw)) {
                        current = pracownik;
                    }
                }
                System.out.println("Podaj imie");
                String name = scanner.nextLine();

                System.out.println("Podaj nazwisko");
                String nazwisko = scanner.nextLine();

                System.out.println("Podaj nr telefonu");
                int tel = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Podaj email");
                String email = scanner.nextLine();

                current.setName(name);
                current.setNazwisko(nazwisko);
                current.setTelefon(tel);
                current.setEmail(email);

            } else if (menu == 5) {
                break;
            }

        }


    }
}
