import java.util.HashMap;
import java.util.Scanner;

public class J26_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        System.out.println("Podaj zdanie: ");
        String s = scanner.nextLine();

        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                int value = map.get(ch);
                value++;
                map.put(ch, value);
            } else {
                map.put(ch, 1);
            }
        }
        for (char x : map.keySet()) {
            System.out.println("Character " + x + " wystempuje " + map.get(x) + " razy");
        }
    }
}
