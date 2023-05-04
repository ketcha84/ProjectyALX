package j34_1;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        ArrayList<Zawodnik> list = new ArrayList<>();

        list.add(new Zawodnik("qqq", 23, 60));
        list.add(new Zawodnik("www", 33, 70));
        list.add(new Zawodnik("eee", 43, 61));

        for (Zawodnik z : list) {
            System.out.println(z);
        }

        for (Zawodnik z : list) {
            z.bieganie();
            z.plywanie();
            z.skakanie();
        }
    }
}
