import java.util.HashSet;
import java.util.Set;

public class J21_5 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        while (set.size() < 10) {
            set.add((int) (Math.random() * 20 + 1));
        }
        for (int x: set){
            System.out.println(x);
        }
    }
}
