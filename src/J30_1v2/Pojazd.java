package J30_1v2;

public class Pojazd {
    int waga, mocSilnika, liczbapasazerow;
    double cena;
    String color;

    public Pojazd(int waga, int mocSilnika, int liczbapasazerow, double cena, String color) {
        this.waga = waga;
        this.mocSilnika = mocSilnika;
        this.liczbapasazerow = liczbapasazerow;
        this.cena = cena;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "waga=" + waga +
                ", mocSilnika=" + mocSilnika +
                ", liczbapasazerow=" + liczbapasazerow +
                ", cena=" + cena +
                ", color='" + color + '\'' +
                '}';
    }
}
