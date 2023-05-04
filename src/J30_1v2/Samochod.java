package J30_1v2;

public class Samochod extends PojazdKolowy {
    String typFelg;

    public Samochod(int waga, int mocSilnika, int liczbapasazerow, double cena, String color, int liczbaKol, String typFelg) {
        super(waga, mocSilnika, liczbapasazerow, cena, color, liczbaKol);
        this.typFelg = typFelg;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "waga=" + waga +
                ", mocSilnika=" + mocSilnika +
                ", liczbapasazerow=" + liczbapasazerow +
                ", cena=" + cena +
                ", color='" + color + '\'' +
                ", liczbaKol=" + liczbaKol +
                ", typFelg='" + typFelg + '\'' +
                '}';
    }
}
