import java.util.Scanner;

public class J46_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wzrost w cm");
        int x = scanner.nextInt();
        if (x < 0) {
            System.out.println("Bląd");
        } else if (x < 165) {
            System.out.println("Niski wzrost");
        } else if (x >= 165 && x < 175) {
            System.out.println("średni wzrost");
        } else if (x >= 175) {
            System.out.println("wysoki wzrost");
        }
    }
}
