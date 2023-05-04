package J30_1v2;

public class Motocykl extends PojazdKolowy{
    String bagaznikNaKask;

    public Motocykl(int waga, int mocSilnika, int liczbapasazerow, double cena, String color, int liczbaKol, String bagaznikNaKask) {
        super(waga, mocSilnika, liczbapasazerow, cena, color, liczbaKol);
        this.bagaznikNaKask = bagaznikNaKask;
    }

    @Override
    public String toString() {
        return "Motocykl{" +
                "bagaznikNaKask='" + bagaznikNaKask + '\'' +
                ", waga=" + waga +
                ", mocSilnika=" + mocSilnika +
                ", liczbapasazerow=" + liczbapasazerow +
                ", cena=" + cena +
                ", color='" + color + '\'' +
                ", liczbaKol=" + liczbaKol +
                '}';
    }
}
