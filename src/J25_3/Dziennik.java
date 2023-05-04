package J25_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Dziennik {
    ArrayList<Uczen> listUczen = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Dziennik() {
        menu();
    }

    private void menu() {
        while (true) {
            System.out.println("Witam.");
            System.out.println("D-dodaj ucznia, P-pokaz uczniow, O – dodaj ocene, U – usun ucznia, M – modyfikuj, K - koniec");
            String s = scanner.nextLine();
            switch (s) {
                case "D" -> {
                    //--------------------- dodaj ucznia
                    String[] arr = readData();
                    listUczen.add(new Uczen(arr[0], arr[1]));
                }
                case "P" -> {
                    //--------------------- pokaz ucznow
                    for (Uczen u : listUczen) {
                        System.out.println(u);
                    }
                }
                case "O" -> {
                    //------------------ dodaj ocene
                    Uczen u = findUczen();
                    if (u != null) {
                        System.out.println("Podaj ocene");
                        int x = scanner.nextInt();
                        scanner.nextLine();
                        u.dodajOcene(x);
                    } else {
                        System.out.println("Nie istniee ucznia");
                    }
                }
                case "U" -> {
                    //_____________usun
                    Uczen u = findUczen();
                    if (u != null) {
                        listUczen.remove(u);
                    } else {
                        System.out.println("Uczen nie istniee");
                    }
                }
                case "M" -> {
                    //---------------------modyfikuj
                    Uczen u = findUczen();
                    if (u != null) {
                        String[] arr = readData();
                        u.setImie(arr[0]);
                        u.setNazwisko(arr[1]);
                    } else {
                        System.out.println("Uczen nie istniee");
                    }
                }
                case "K" -> {
                    return; // -------konec
                }
                default -> {
                    System.out.println("Podaj poprawny punkt menu");
                }
            }
        }
    }

    private Uczen findUczen() {
        System.out.println("Podaj nazwisko");
        String nazwisko = scanner.nextLine();
        for (Uczen uczen : listUczen) {
            if (uczen.getNazwisko().equals(nazwisko)) {
                return uczen;
            }
        }
        return null;
    }

    private String[] readData() {
        System.out.println("Podaj imie");
        String imie = scanner.nextLine();
        System.out.println("Podaj nazwisko");
        String nazwisko = scanner.nextLine();

        return new String[]{imie, nazwisko};
    }

}
