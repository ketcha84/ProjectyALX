import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J21 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            if (!"end".equals(line)) {
                if (list.contains(line)) {
                    continue;
                } else {
                    list.add(line);
                }
            } else {
                break;
            }
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
