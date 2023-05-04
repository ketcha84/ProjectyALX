import java.util.HashMap;
import java.util.Scanner;

public class J21_3 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        map.put("jeden", 1);
        map.put("dwa", 2);
        map.put("trzy", 3);
        map.put("cztery", 4);
        map.put("piec", 5);
        System.out.println("Podaj liczbe 1:");
        int a = map.get(scanner.nextLine());
        System.out.println("Podaj liczbe 2:");
        int b = map.get(scanner.nextLine());
        System.out.println(a + b);
    }
}
