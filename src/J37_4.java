import java.util.Scanner;

public class J37_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jaka figura? 1 – prostokąt, 2 – trójkąt 2");
        int wybor = scanner.nextInt();

        if (wybor == 1) {
            System.out.println("Podaj długość boku a: ");
            double a = scanner.nextDouble();
            System.out.println("Podaj długość boku b: ");
            double b = scanner.nextDouble();
            double pole = a * b;
            System.out.println("Pole prostokąta to: " + pole);
        } else if (wybor == 2) {
            System.out.println("Podaj długość podstawy: ");
            double pod = scanner.nextDouble();
            System.out.println("Podaj wysokość trójkąta: ");
            double wys = scanner.nextDouble();
            double pole = pod * wys / 2;
            System.out.println("Pole to: " + pole);
        }else {
            System.out.println("Bląd.");
        }
    }
}
