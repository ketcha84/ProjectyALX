package J25_4;

import java.util.HashMap;
import java.util.Map;

public class Koszyk {
    Map<String, Integer> koszyk = new HashMap<>();

    public void addProduct(String nazwa, int ilosc) {
        if (koszyk.containsKey(nazwa)) {
            int amountInKosz = koszyk.get(nazwa);
            amountInKosz += ilosc;
            koszyk.put(nazwa, amountInKosz);
        } else {
            koszyk.put(nazwa, ilosc);
        }
    }

    public void remove(String nazwa, int ilosc) {
        if (!koszyk.containsKey(nazwa)) {
            System.out.println("No such product!");
            return;
        }
        int amountInKosz = koszyk.get(nazwa);
        if (ilosc > amountInKosz) {
            System.out.println("You have no enough  products");
            return;
        } else if (ilosc < amountInKosz) {
            {
                amountInKosz -= ilosc;
                koszyk.put(nazwa, amountInKosz);
            }
        } else {
            remove(nazwa);
        }
    }

    private void remove(String nazwa) {
        koszyk.remove(nazwa);
    }
}
