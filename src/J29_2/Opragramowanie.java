package J29_2;

public class Opragramowanie extends Produkt {
    public String jezyk, system;

    public Opragramowanie(String nazwa, double cena, String jezyk, String system) {
        super(nazwa, cena);
        this.jezyk = jezyk;
        this.system = system;
    }


}
