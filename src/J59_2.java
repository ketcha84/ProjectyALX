import java.util.Scanner;

public class J59_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, answer;

        for (int i = 0; i < 5; i++) {
            num1 = (int) (Math.random() * 10 + 1);
            num2 = (int) (Math.random() * 10 + 1);
            answer = num1 * num2;
            System.out.printf("Ile bedzie %d * %d = ?\n", num1, num2);
            while ((scanner.nextInt()) != answer) {
                System.out.println("Bledna odpowedz, sproboj ponowne:");
            }
            System.out.println("Masz racje, kolejne pytanne:");
        }
    }
}