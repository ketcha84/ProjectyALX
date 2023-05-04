package J37;

public class Ksiazka {
    public String nazwa, autor, rokWydania;


    public Ksiazka(String nazwa, String autor, String rokWydania) {
        this.nazwa = nazwa;
        this.autor = autor;
        this.rokWydania = rokWydania;
    }

    @Override
    public String toString() {
        return "Ksiazka \t" +
                "nazwa='" + nazwa + "'\t" +
                "autor='" + autor + "'\t" +
                "rokWydania='" + rokWydania + "'\n";
    }
}
