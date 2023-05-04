package J30_1v2;

public class Lodz extends Pojazd{
    int zanurzenie;

    public Lodz(int waga, int mocSilnika, int liczbapasazerow, double cena, String color, int zanurzenie) {
        super(waga, mocSilnika, liczbapasazerow, cena, color);
        this.zanurzenie = zanurzenie;
    }

    @Override
    public String toString() {
        return "Lodz{" +
                "zanurzenie=" + zanurzenie +
                ", waga=" + waga +
                ", mocSilnika=" + mocSilnika +
                ", liczbapasazerow=" + liczbapasazerow +
                ", cena=" + cena +
                ", color='" + color + '\'' +
                '}';
    }
}
