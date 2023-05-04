package J30_1v2;

public class PojazdKolowy extends Pojazd{
    int liczbaKol;

    public PojazdKolowy(int waga, int mocSilnika, int liczbapasazerow, double cena, String color, int liczbaKol) {
        super(waga, mocSilnika, liczbapasazerow, cena, color);
        this.liczbaKol = liczbaKol;
    }

    @Override
    public String toString() {
        return "PojazdKolowy{" +
                "waga=" + waga +
                ", mocSilnika=" + mocSilnika +
                ", liczbapasazerow=" + liczbapasazerow +
                ", cena=" + cena +
                ", color='" + color + '\'' +
                ", liczbaKol=" + liczbaKol +
                '}';
    }
}
