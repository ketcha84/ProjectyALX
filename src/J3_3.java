import java.util.Scanner;

public class J3_3 {
    public static void main(String[] args) {
        double chleb = 1.99;
        double mleko = 2.5;
        double cukierki = 12.99;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ille chcesz kupic chleba:");
        int chlebCount = scanner.nextInt();

        System.out.println("Ille chcesz kupic mleko:");
        int mlekoCount = scanner.nextInt();

        System.out.println("Ille chcesz kupic cukierkow:");
        int cukCount = scanner.nextInt();

        int plata = (int) (mleko * mlekoCount + chleb * chlebCount + cukierki * cukCount);
        System.out.println(plata);

    }
}
