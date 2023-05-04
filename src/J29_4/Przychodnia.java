package J29_4;

import java.util.ArrayList;

public class Przychodnia {
    private String nazwa, miasto;
    private ArrayList<Pacjent> listPacjentow = new ArrayList<>();

    public Przychodnia(String nazwa, String miasto) {
        this.nazwa = nazwa;
        this.miasto = miasto;
    }

    public void addPacjent(String imie, String nazwisko) {
        listPacjentow.add(new Pacjent(imie, nazwisko));
    }

    public void addPacjent(Pacjent pacjent){
        listPacjentow.add(pacjent);
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getMiasto() {
        return miasto;
    }

    public ArrayList<Pacjent> getListPacjentow() {
        return listPacjentow;
    }

    @Override
    public String toString() {
        return "Przychodnia{" +
                "nazwa='" + nazwa + '\'' +
                ", miasto='" + miasto + '\'' +
                '}';
    }
}
