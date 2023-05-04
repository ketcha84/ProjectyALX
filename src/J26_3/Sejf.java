package J26_3;

public class Sejf {
    private int tainaLiczba = (int) (Math.random() * 100 + 1);

    public Sejf() {
    }

    public int odczyt(int kod) {
        if (kod == 1234) {
            return tainaLiczba;
        } else {
            return -100;
        }
    }
}
