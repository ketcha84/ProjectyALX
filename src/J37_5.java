import java.util.Scanner;

public class J37_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = (int) (Math.random() * 10 + 1);
        int b = (int) (Math.random() * 10 + 1);

        System.out.printf("Ile to jest %d * %d?\n", a, b);
        int x = scanner.nextInt();
        if (x == a * b) {
            System.out.println("wynik jest poprawny");
        }else {
            System.out.println("wynik jest błędny");
        }

    }
}
