package J25_4;

import java.util.HashMap;
import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> sklep = new HashMap<>();
        sklep.put("sok", 2.50);
        sklep.put("woda", 1.50);
        sklep.put("cola", 3.50);

        Koszyk koszyk = new Koszyk();

        while (true) {

            System.out.println("Witaj w sklepie");
            System.out.println("1-dodaj do koszyka, 2-pokaz zawartosc koszyka, 3-usun z koszyka, 4-kasa/koniec");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                //pytania: nazwa produktu, ilosc (o ilosc pytamy wtedy kiedy produkt jest w sklepie)
                System.out.println("Podaj nazwe produktu");
                String nazwa = scanner.nextLine();
                if (!sklep.containsKey(nazwa)) {
                    System.out.println("No such product");
                    continue;
                }
                System.out.println("Podaj ilosc");
                int iloscc = scanner.nextInt();
                scanner.nextLine();
                koszyk.addProduct(nazwa, iloscc);
            } else if (menu == 2) {
                for (String key : koszyk.koszyk.keySet()) {
                    System.out.println("Produkt: " + key + " Ilosc: " + koszyk.koszyk.get(key));
                }
            } else if (menu == 3) {
                //pytania: nazwa produktu, ilosc (o ilosc pytamy wtedy kiedy produkt jest w koszyku)
                System.out.println("Podaj nazwe produktu do usuniecia");
                String nazwa = scanner.nextLine();
                System.out.println("Podaj ilosc");
                int ilosc = scanner.nextInt();
                scanner.nextLine();
                koszyk.remove(nazwa, ilosc);
            } else if (menu == 4) {

                double suma = 0;
                String info = "PARAGON\n";
                for (String key : koszyk.koszyk.keySet()) {
                    String line;
                    line = "Produkt: " + key + " Ilosc: " + koszyk.koszyk.get(key) + " Cena: " + sklep.get(key) + " Wartosc: " + (koszyk.koszyk.get(key) * sklep.get(key)) + "\n";
                    info += line;
                    suma += koszyk.koszyk.get(key) * sklep.get(key);
                }
                String line = "RAZEM DO ZAPLATY: " + suma + "PLN\n";
                info += line;
                System.out.println(info);

                break;
            } else {
                System.out.println("Nierozpoznana opcja menu");
            }
        }
    }
}
