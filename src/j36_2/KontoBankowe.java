package j36_2;

public abstract class KontoBankowe {
    public String nrKonta;
    public double saldo, debet;

    public void wplata(double ile) {
        this.saldo += ile;
    }

    public void wyplata(double ile) {
        if (this.saldo + this.debet >= ile) {
            this.saldo -= ile;
        } else {
            System.out.println("Ilosc srodkow na koncie jest nie wystarczajaca");
        }
    }

    public abstract void dodajDebet(double ile);

    public abstract void odsetki();
}
