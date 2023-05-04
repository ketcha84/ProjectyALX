import java.util.Scanner;

public class J3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String wynik = String.valueOf((a > b) ? a : b);
        System.out.println(wynik);
    }
}
