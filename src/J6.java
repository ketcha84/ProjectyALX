import java.util.Scanner;

public class J6 {
    public static void main(String[] args) {
        int x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        x = scanner.nextInt();

        System.out.println("Enter y: ");
        y = scanner.nextInt();
        boolean r = x > y;
        System.out.println("x > y:" + r);

        int x2 = x * 2;
        r = x2 > y;
        System.out.println("X*2 > y: " + r);


        r = (y < x + 2 && y > x - 2);
        System.out.println("y < x + 2 && y > x - 2 " + r);

        r = (y * x) % 2 == 0;
        System.out.println("parzysty " + r);
    }
}
