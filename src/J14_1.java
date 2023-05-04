import java.util.Scanner;

public class J14_1 {
    public static void main(String[] args) {
        int los = (int) (Math.random() * 100 + 1);
        Scanner scanner = new Scanner(System.in);
        int liczbe = 0;
        int iterator = 6;
        boolean nextTurn = true;

        while (nextTurn) {
            if (iterator-- > 1) {
                System.out.println("Zgadaj liczbe masz " + iterator + " prob: ");
                liczbe = scanner.nextInt();
                scanner.nextLine();
                if (liczbe == los) {
                    if (checkTurn("Gratulacje.\nCzy chcesz jeszcze raz?\"T\"/\"N\"")) {
                        iterator = 6;
                        los = (int) (Math.random() * 100 + 1);
                    } else {
                        nextTurn = false;
                    }
                } else if (liczbe < los) {
                    System.out.println("Podalesz za malo liczbe");
                } else if (liczbe > los) {
                    System.out.println("Podalesz za duza liczbe");
                }
            } else {
                if (checkTurn("Przegrales.\nCzy chcesz jeszcze raz?\"T\"/\"N\"")) {
                    iterator = 6;
                    los = (int) (Math.random() * 100 + 1);
                } else {
                    nextTurn = false;
                }
            }
        }
    }

    public static boolean checkTurn(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        switch (answer) {
            case "T" -> {
                return true;
            }
            case "N" -> {
                return false;
            }
            default -> {
                System.out.println("Niepoprawna odpowiedz!");
                return false;
            }
        }
    }
}
