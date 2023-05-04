package J29_4;

import java.util.ArrayList;

public class Pacjent {
    private String imie, nazwisko;
    private ArrayList<String> listachorob = new ArrayList<>();

    public Pacjent(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void addChorobe(String choroba){
        listachorob.add(choroba);
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public ArrayList<String> getListachorob() {
        return listachorob;
    }

    @Override
    public String toString() {
        return "Pacjent{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", listachorob=" + listachorob +
                '}';
    }
}
