package J29;

public class Student {
    private String imie, nazwisko;
    private int index;
    public static int count = 0;

    public Student(String imie, String nazwisko, int index) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.index = index;
        count++;
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

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", index=" + index +
                '}';
    }
}
