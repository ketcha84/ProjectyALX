import java.util.HashMap;
import java.util.Scanner;

public class J22_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, String> map = new HashMap<>();

        map.put('0', "zero");
        map.put('1', "jeden");
        map.put('2', "dwa");
        map.put('3', "try");
        map.put('4', "cztery");
        map.put('5', "piec");
        map.put('6', "sziesc");
        map.put('7', "siedem");
        map.put('8', "osiem");
        map.put('9', "dziewienc");

        while (true) {
            System.out.println("Enter number:");
            String s = scanner.nextLine();
            for (char ch : s.toCharArray()) {
                System.out.print(map.get(ch) + " ");
            }
            System.out.println("");
        }
    }
}
