package J25_3;

import java.util.ArrayList;

public class Uczen {
    private String imie, nazwisko;
    private int sum;
    private double srednia = 0;
    ArrayList<Integer> oceny = new ArrayList<>();

    public Uczen(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void dodajOcene(int ocena) {
        oceny.add(ocena);
        sum += ocena;
        srednia = sum * 1.0 / oceny.size();
    }

    public void wyswietlOceny() {
        for (int x : oceny) {
            System.out.print(x + " ");
        }
    }

    public double srednia() {
       return srednia;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }


    @Override
    public String toString() {
        return "Uczen{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", oceny=" + oceny +
                ", srednia=" + srednia +
                '}';
    }
}
