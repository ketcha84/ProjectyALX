package J23_1;

import java.util.ArrayList;

public class Uczen {
    private String imie, nazwisko;
    private ArrayList<Integer> oceny = new ArrayList<>();

    public Uczen(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oceny = oceny;
    }

    public void addOcene(int ocena){
        oceny.add(ocena);
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public ArrayList<Integer> getOceny() {
        return oceny;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", oceny=" + oceny +
                '}';
    }
}