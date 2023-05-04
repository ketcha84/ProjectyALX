import java.util.Scanner;

public class J12_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("parzysta");
        } else {
            System.out.println("nieparzysta");
        }

    }
}
