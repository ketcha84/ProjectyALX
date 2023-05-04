import java.util.Scanner;

public class J61_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int x = scanner.nextInt();
            if (x % 2 == 0) {
                sum += x;
            }
        }
        System.out.println(sum);
    }
}
