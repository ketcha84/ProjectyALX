package J39;

import java.util.InputMismatchException;
import java.util.Scanner;

public class J39 {
    final private static int[] tab = new int[]{1, 2, 3, 4, 5};

    public static void main(String[] args) {
        komunikat("Podaj dowolna index 0 - 4:");
        enterNum();

    }

    private static void enterNum() {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                int index = scanner.nextInt();
                scanner.nextLine();
                komunikat(tab[index] + "");
                break;
            } catch (InputMismatchException e) {
                komunikat("Musisz podac tylko liczby");
            } catch (ArrayIndexOutOfBoundsException e) {
                komunikat("Index muszi byc w zakresie 0-4");
            }
        }
    }

    private static void komunikat(String message) {
        System.out.println(message);
    }
}
