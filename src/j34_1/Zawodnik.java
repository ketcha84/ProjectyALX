package j34_1;

public class Zawodnik implements Zawody{
    private String imie;
    private int wiek, waga;

    public Zawodnik(String imie, int wiek, int waga) {
        this.imie = imie;
        this.wiek = wiek;
        this.waga = waga;
    }

    @Override
    public void plywanie() {
        System.out.println("Zawodnik " + this.imie + " plywa.");
    }

    @Override
    public void skakanie() {
        System.out.println("Zawodnik " + this.imie + " skacze.");

    }

    @Override
    public void bieganie() {
        System.out.println("Zawodnik " + this.imie + " biega.");

    }

    @Override
    public String toString() {
        return "Zawodnik{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", waga=" + waga +
                '}';
    }
}
