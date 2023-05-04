import java.util.Scanner;

public class J17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, min, max, amountEven, amountOdd, sum;
        double average = 0;

        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        sum = 0;
        amountEven = 0;
        amountOdd = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter " + i + " number:");
            x = scanner.nextInt();
            if (x < min) {
                min = x;
            }
            if (x > max) {
                max = x;
            }
            sum += x;

            if (x % 2 == 0) {
                amountEven++;
            }
            if (x % 2 != 0) {
                amountOdd++;
            }

        }
        average = sum / 10;
        System.out.println("Suma: " + sum);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Amount even numbers: " + amountEven);
        System.out.println("Amount odd numbers: " + amountOdd);
        System.out.println("Average: " + average);
    }
}
