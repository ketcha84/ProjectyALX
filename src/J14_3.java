import java.util.Scanner;

public class J14_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, min, max;
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;

        System.out.println("Enter number:");
        while ((x = scanner.nextInt()) != 0) {
            if (x < min) {
                min = x;
            }
            if (x > max) {
                max = x;
            }
        }
        
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}