package kino;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Kino {
    static Scanner scanner = new Scanner(System.in);
    static String[] kina = {"Cinema-City", "Multikino"};
    static String[][] filmy = {{"Matrix", "Avatar", "Shrek"}, {"Piraci z Karaibów", "Król Lew", "Władca Pierścieni"}};
    static Character[] litery = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};

    public static void main(String[] args) {

        double cenaBiletu = 18.00;

        String imie;

        System.out.println(Arrays.toString(kina));
        System.out.println("Podaj index kina");
        int kinaIndex = getIndex(kina);

        System.out.println(Arrays.toString(filmy[kinaIndex]));
        System.out.println("Podaj index filmu");
        int indexFilm = getIndex(filmy[kinaIndex]);

        System.out.println("Podaj ilosc osob");
        int amount = getAmount();
        scanner.nextLine();

        System.out.println("Podaj imie");
        imie = getimie();

        System.out.println(kina[kinaIndex]);
        System.out.println(filmy[kinaIndex][indexFilm]);
        System.out.println("Liczba osob: " + amount);
        System.out.println("Imie: " + imie);
        System.out.println("Cena: " + amount * cenaBiletu);

    }

    public static String getimie() {
        String i = scanner.nextLine();
        if (checkName(i)) {
            return i;
        } else {
            System.out.println("Podaj poprawne imie");
            return getimie();
        }
    }

    private static boolean checkName(String name) {
        boolean contains = false;
        for (Character c : name.toCharArray()) {
            contains = false;

            for (Character l : litery) {
                if (c == l) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                return false;
            }
        }
        return contains;
    }


    public static int getAmount() {
        try {
            int amount = scanner.nextInt();
            if (amount > 0) {
                return amount;
            } else {
                System.out.println("Podaj poprawnej ilosc");
                scanner.nextLine();
                return getAmount();
            }
        } catch (InputMismatchException e) {
            System.out.println("Podaj poprawnej ilosc");
            scanner.nextLine();
            return getAmount();
        }
    }

    public static int getIndex(String[] mass) {
        try {
            int i = scanner.nextInt();
            if (i < 0 || i > mass.length) {
                System.out.println("Podany za duza wartosc indexu");
                scanner.nextLine();
                return getIndex(mass);
            } else {
                return i;
            }
        } catch (InputMismatchException e) {
            System.out.println("Podaj poprawny index");
            scanner.nextLine();
            return getIndex(mass);
        }
    }
}
