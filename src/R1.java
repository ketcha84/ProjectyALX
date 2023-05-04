import java.util.Scanner;

public class R1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sok = 2.50;
        double woda = 1.50;
        double chleb = 4.50;
        double sum = 0;
        while (true) {

            System.out.println("1-jaki produkt chcesz kupic, 2-kasa/koniec");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                System.out.println("Podaj nazwe produkt:");
                String produkt = scanner.nextLine();
                switch (produkt) {
                    case "sok" -> sum += sok;
                    case "woda" -> sum += woda;
                    case "chleb" -> sum += chleb;
                    default -> System.out.println("Error");
                }
            } else if (menu == 2) {
                System.out.println("Do zaplaty jest: " + sum);
                break;
            }

        }

    }
}
