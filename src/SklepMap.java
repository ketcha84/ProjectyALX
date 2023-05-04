import java.util.HashMap;
import java.util.Scanner;

public class SklepMap {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> sklep = new HashMap<>();

        HashMap<String, Integer> koszyk2 = new HashMap<>();

        //[sok, woda, sok, cola, woda]

        sklep.put("sok", 2.22);
        sklep.put("woda", 1.22);
        sklep.put("cola", 3.22);

        while (true) {

            System.out.println("1-dodaj do koszyka, 2-wyswietl zawartosc koszyka, 3-kasa/koniec");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                //pytamy o produkt, jezeli produkt nie istnieje w sklepie to go nie dodajemy (komunikat)
                System.out.println("Podaj produkt:");
                String s = scanner.nextLine();
                if (sklep.containsKey(s)) {
                    if (koszyk2.containsKey(s)) {
                        int amount = koszyk2.get(s);
                        amount++;
                        koszyk2.put(s, amount);
                    } else {
                        koszyk2.put(s, 1);
                    }
                } else {
                    System.out.println("Podany produkt nie istnieje");
                }

            } else if (menu == 2) {
                for (String s : koszyk2.keySet()) {
                    System.out.printf("Produkt: %s, ilosc: %d\n", s, koszyk2.get(s));
                }
            } else if (menu == 3) {
                double suma = 0;

                System.out.println("PARAGON:");
                for (String s : koszyk2.keySet()) {
                    double d = sklep.get(s);
                    suma += d * koszyk2.get(s);

                    System.out.printf("Produkt: %s * %d\tCena: %f\n", s, koszyk2.get(s), d);
                }
                System.out.println("Razem do zaplaty " + suma + "PLN");
                break;
            }

        }

    }
}
