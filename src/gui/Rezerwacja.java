package gui;

import java.util.ArrayList;

public class Rezerwacja {
    public String imie, nazwisko, wylot, przylot, uwagi;
    public ArrayList<String> posilek;
    public boolean vip;

    public Rezerwacja(String imie, String nazwisko, String wylot, String przylot, boolean vip, ArrayList<String> posilek, String uwagi) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wylot = wylot;
        this.przylot = przylot;
        this.uwagi = uwagi;
        this.posilek = posilek;
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Rezerwacja{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wylot='" + wylot + '\'' +
                ", przylot='" + przylot + '\'' +
                ", uwagi='" + uwagi + '\'' +
                ", posilek=" + posilek +
                ", vip=" + vip +
                '}';
    }
}
