package kt;

import java.sql.SQLException;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();
        while(true){
            System.out.println("Witaj w systemie");
            System.out.println("1-dodaj, 2-pokaz, 3-usun, 4-zmien, 5*-szukaj, 6-koniec");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if(menu == 1){
                //imie,nazwisko,telefon
                System.out.println("Podaj imie");
                String imie = scanner.nextLine();

                System.out.println("Podaj nazwisko");
                String nazwisko = scanner.nextLine();

                System.out.println("Podaj telefon");
                String telefon = scanner.nextLine();

                controller.dodaj(imie, nazwisko, telefon);
            }
            else if(menu == 2){
                controller.pokaz();
            }
            else if(menu == 3){
                System.out.println("Podaj nazwisko:");
                String nazwisko = scanner.nextLine();
                controller.usun(nazwisko);

            }
            else if(menu == 4){
                String nazwisko, noweNazwisko, noweImie, nowyTelefon;

                System.out.println("Podaj nazwisko");
                nazwisko = scanner.nextLine();

                System.out.println("Podaj nowe imie");
                noweImie = scanner.nextLine();

                System.out.println("Podaj nowe nazwisko");
                noweNazwisko = scanner.nextLine();

                System.out.println("Podaj nowy telefon");
                nowyTelefon = scanner.nextLine();

                controller.zmien(nazwisko, noweImie, noweNazwisko, nowyTelefon);
            }
            else if(menu == 5){
                System.out.println("Podaj fraze");
                String f= scanner.nextLine();
                controller.find(f);
            }
            else if(menu == 6){
                break;
            }
            else{
                System.out.println("Nierozpoznana opcja menu:");
            }
        }
    }
}
