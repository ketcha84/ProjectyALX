package J51_5;

public class Znajomy {

    public String imie;
    public String nazwisko;
    public String telefon;
    public String email;

    public Znajomy(String imie, String nazwisko, String telefon, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.telefon = telefon;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Imie: " + imie + " Nazwisko: " + nazwisko + " telefon: " + telefon + " email: " + email;
    }
}
