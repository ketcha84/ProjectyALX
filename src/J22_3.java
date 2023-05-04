import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class J22_3 {
    private static String pass;
    private static HashSet<Character> userCharacters = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> charactersFromUser = new ArrayList<>();
        HashSet<Character> rightCharacters = new HashSet<>();


        char ch;
        int count = 5;
        System.out.println("Enter password:");
        pass = scanner.nextLine();
        for (int i = 0; i <50 ; i++) {
            System.out.println("");

        }
        for (char x : pass.toCharArray()) {
            rightCharacters.add(x);
        }

        System.out.println("Try to guess the password by symbols:");

        while (count > 0) {

            if (charactersFromUser.size() == rightCharacters.size()) {
                System.out.println("You won!!!");
                break;
            }
            System.out.println("You have " + count + " tries.");
            printPassword();

            ch = scanner.nextLine().charAt(0);
            userCharacters.add(ch);

            if (pass.contains(ch + "")) {
                if (!charactersFromUser.contains(ch)) {
                    charactersFromUser.add(ch);
                } else {
                    System.out.println("That was.");
                    count--;
                }
            } else {
                count--;
                System.out.println("You are wrong! Try again.");
            }
        }
        if(count==0 && charactersFromUser.size()!= rightCharacters.size()){
            System.out.println("You lose!");
        }

    }

    private static void printPassword() {
        for (int i = 0; i < pass.length(); i++) {
            if (userCharacters.contains(pass.charAt(i))) {
                System.out.print(pass.charAt(i) + " ");

            } else {
                System.out.print("- ");
            }
        }
        System.out.println("");
    }
}
