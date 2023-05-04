package j36_2;

public class BankPKO extends KontoBankowe {

    @Override
    public void dodajDebet(double ile) {
        this.debet = ile;
    }

    @Override
    public void odsetki() {
        this.saldo *= 1.1;

    }

    @Override
    public String toString() {
        return "BankPKO{" +
                "nrKonta='" + nrKonta + '\'' +
                ", saldo=" + saldo +
                ", debet=" + debet +
                '}';
    }
}
