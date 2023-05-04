package J29_2;

public class Szkolenia extends Opragramowanie{
    public String termin;

    public Szkolenia(String nazwa, double cena, String jezyk, String system, String termin) {
        super(nazwa, cena, jezyk, system);
        this.termin = termin;
    }

    @Override
    public String toString() {
        return "Szkolenia{" +
                "nazwa='" + nazwa + '\'' +
                ", cena='" + cena + '\'' +
                ", jezyk='" + jezyk + '\'' +
                ", system=" + system +
                ", termin='" + termin + '\'' +
                '}';
    }
}
