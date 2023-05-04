package J30_1v2;

public class Samolot extends Pojazd{
    int pulap;

    public Samolot(int waga, int mocSilnika, int liczbapasazerow, double cena, String color, int pulap) {
        super(waga, mocSilnika, liczbapasazerow, cena, color);
        this.pulap = pulap;
    }
}
