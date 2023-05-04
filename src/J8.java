import java.util.Scanner;

public class J8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double d = (a * 1.0 + b + c) / 3;
        System.out.println(d);
    }
}
