package RALX;

import java.util.ArrayList;

public class Kurs {
    public String nazwa;
    public ArrayList<Kursant> listaKursantow = new ArrayList<>();

    public Kurs(String nazwa) {
        this.nazwa = nazwa;
    }

}
