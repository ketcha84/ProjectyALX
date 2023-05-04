import java.util.Scanner;

public class J12_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, min, max;
        System.out.println("Enter 1 number: ");
        x = scanner.nextInt();
        min = x;
        max = x;

        for (int i = 2; i <= 5; i++) {
            System.out.println("Enter " + i + " number:");
            x=scanner.nextInt();
            if (x < min) {
                min = x;
            }
            if (x > max) {
                max = x;
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " +min);
    }
}
