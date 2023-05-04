import java.util.Scanner;

public class J11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        String ch;
        System.out.println("Enter first number: ");
        num1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter symbol:\n+\n-\n*\n/");
        ch = scanner.nextLine();
        System.out.println("Enter next number:");
        num2 = scanner.nextDouble();

        switch (ch) {
            case "+" -> {
                result = num1 + num2;
                System.out.println(result);
            }
            case "-" -> {
                result = num1 - num2;
                System.out.println(result);
            }
            case "*" -> {
                result = num1 * num2;
                System.out.println(result);
            }
            case "/" -> {
                result = num1 / num2;
                System.out.println(result);
            }
        }
    }
}
