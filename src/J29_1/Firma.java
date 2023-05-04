package J29_1;

import java.util.Scanner;

public class Firma extends DzialKadr {
    public String nazwaFirmy;
    Scanner scanner = new Scanner(System.in);

    public Firma(String nazwaFirmy) {
        this.nazwaFirmy = nazwaFirmy;
        this.menu();
    }

    public void menu(){

        while(true) {
            System.out.println("Witaj w firmie " + this.nazwaFirmy);
            System.out.println("1-dodaj, 2-pokaz, 3-usun, 4-zmien kontrakt (staz,etat), 5-koniec");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                //pytania: imie, nazwisko, kontrakt (staz, etat), pensja
                System.out.println("Podaj imie: ");
                String imie = scanner.nextLine();
                System.out.println("Podaj nazwisko: ");
                String nazwisko = scanner.nextLine();
                System.out.println("Podaj kontrakt (staz, etat): ");
                String kontrakt = scanner.nextLine();
                System.out.println("Podaj pensję: ");
                double pensja = scanner.nextDouble();
                scanner.nextLine();

                this.addPracownik(imie, nazwisko, kontrakt, pensja);

            } else if (menu == 2) {
                pokazPracownikow();

            } else if (menu == 3) {
                //pytania: nazwisko

                System.out.println("Podaj Nazwisko");
                String nazwisko = scanner.nextLine();
                usunPracownika(nazwisko);

            } else if (menu == 4) {
                //pytania: nazwisko, kontrakt, pensja
                //kontrakt: staz->etat      etat-> NIE WOLNO staz
                System.out.println("Podaj Nazwisko");
                String nazwisko = scanner.nextLine();
                System.out.println("Podaj kontrakt");
                String kontrakt = scanner.nextLine();
                System.out.println("Podaj pensje");
                double pensje  = scanner.nextDouble();
                zmienKontrakt(nazwisko,kontrakt,pensje);
            } else if (menu == 5) {
                break;
            }
        }
    }
}
