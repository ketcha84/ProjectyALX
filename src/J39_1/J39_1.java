package J39_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class J39_1 {
    private static Character[] znak = new Character[]{'+', '-', '*', '/'};
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double l1 = getLiczbe(1);
        char c = getZnak();
        double l2 = getLiczbe(2);

        switch (c) {
            case '+' -> {
                kommunicat(l1 + l2 + "");
                break;
            }
            case '-' -> {
                kommunicat(l1 - l2 + "");
                break;
            }
            case '*' -> {
                kommunicat(l1 * l2 + "");
                break;
            }
            case '/' -> {
                if (l2 == 0) {
                    while (l2 == 0) {
                        kommunicat("druga liczba musi byc rożna od 0");
                        l2 = getLiczbe(2);
                    }
                }
                kommunicat(l1 / l2 + "");
            }
        }
    }

    private static void kommunicat(String message) {
        System.out.println(message);
    }

    private static char getZnak() {
        while (true) {
            kommunicat("Podaj Znak dzialania:");
            String line = scanner.nextLine();
            if (checkChar(line)) {
                return line.charAt(0);
            }
        }
    }

    private static boolean checkChar(String s) {
        if (s.length() == 0 || s.length() > 1) {
            kommunicat("Podaj jeden znak!");
            return false;
        } else {
            for (Character c : znak) {
                if (c == s.charAt(0)) {
                    return true;
                }
            }
            kommunicat("Podaj znak '+' , '-' , '*' , '/'");
            return false;
        }
    }

    private static double getLiczbe(int num) {

        while (true) {
            kommunicat("Podaj liczbe " + num + ":");
            try {
                double l = scanner.nextDouble();
                scanner.nextLine();
                return l;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                kommunicat("Podaj tylko liczbe!");
            }
        }
    }
}
