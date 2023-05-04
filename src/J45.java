import java.util.Locale;
import java.util.Scanner;

public class J45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        String line;
        System.out.println("Podaj pole lub obwod (\"P\" lub \"O\"): ");
        line = scanner.nextLine();
        System.out.println("Podaj promien kola:");

        double p = scanner.nextDouble();
        switch (line){
            case "P" -> System.out.println("Pole kola: " + Math.PI*p*p);
            case "O" -> System.out.println("Obwod kola: " + 2*Math.PI*p);
            default -> System.out.println("Blad");
        }
    }
}
