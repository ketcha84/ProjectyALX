package J29_1;

import java.util.ArrayList;

public class DzialKadr {
    ArrayList<Pracownik> pracownikArrayList = new ArrayList<>();

    public void addPracownik(String imie, String nazwisko, String kontrakt, double pensja) {
        pracownikArrayList.add(new Pracownik(imie, nazwisko, kontrakt, pensja));
    }

    public void pokazPracownikow() {
        for (Pracownik p : pracownikArrayList) {
            System.out.println(p);
        }
    }

    public void usunPracownika(String nazwisko) {
        for (Pracownik p : pracownikArrayList) {
            if (p.getNazwisko().equals(nazwisko)) {
                pracownikArrayList.remove(p);
                break;
            }
        }
    }

    public void zmienKontrakt(String nazwisko, String kontrakt, double pensja) {
        for (Pracownik p : pracownikArrayList) {
            if(p.getNazwisko().equals(nazwisko)){
                if(p.getKontrakt().equals("etat")){
                    p.setPensja(pensja);
                }else if(p.getKontrakt().equals("staz")){
                    p.setKontrakt(kontrakt);
                    p.setPensja(pensja);
                }
            }
        }
    }

}
