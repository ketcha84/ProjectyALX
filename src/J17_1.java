import java.util.Scanner;

public class J17_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int a = scanner.nextInt();
        System.out.println("Enter pow");
        int b = scanner.nextInt();
        if (b == 0) {
            System.out.println(1);
            return;
        }
        int res = a;
        for (int i = 1; i < b; i++) {
            res = res * a;
        }
        System.out.println(res);
    }
}
