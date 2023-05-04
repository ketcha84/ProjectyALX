import java.util.Scanner;

public class J37_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile wynosi pierwszy bok prostokąta?");
        double a = scanner.nextDouble();
        System.out.println("Ile wynosi drugi bok prostokąta?");
        double b = scanner.nextDouble();
        System.out.println("Co chcesz policzyć? 1 – pole, 2 – obwód 1");
        int wybor = scanner.nextInt();

        if (wybor == 1) {
            System.out.println("Pole prostokąta to: " + a * b);
        } else if (wybor == 2) {
            System.out.println("Obwod prostokąta to: " + (a + b) * 2);
        }else {
            System.out.println("Bląd");
        }
    }
}
