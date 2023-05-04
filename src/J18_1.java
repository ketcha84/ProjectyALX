import java.util.Scanner;

public class J18_1 {
    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter name:");
            names[i] = scanner.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Czesc to ja " + names[i]);
        }
    }
}
