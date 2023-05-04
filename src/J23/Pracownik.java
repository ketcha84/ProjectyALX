package J23;

public class Pracownik {
    private String name;
    private String nazwisko;
    private int telefon;
    private String email;

    public Pracownik(String name, String nazwisko, int telefon, String email) {
        this.name = name;
        this.nazwisko = nazwisko;
        this.telefon = telefon;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getTelefon() {
        return telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "name='" + name + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", telefon=" + telefon +
                ", email='" + email + '\'' +
                '}';
    }
}
