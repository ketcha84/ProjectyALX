import java.util.Scanner;

public class J11_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight :");
        double waga = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("enter height");
        double wzrost = scanner.nextDouble();

        double bmi = waga / (wzrost * wzrost);

        if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("waga prawidlowa");
        } else if (bmi < 18.5) {
            System.out.println("niedowaga");
        } else if (bmi > 24.9) {
            System.out.println("nadwaga");
        }
    }
}
