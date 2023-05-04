import java.util.Scanner;

public class J17_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int res = 1;
        for (int i = 1; i <= x; i++) {
            res *= i;
        }
        System.out.println(res);
    }
}
