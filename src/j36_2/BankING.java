package j36_2;

public class BankING extends KontoBankowe {

    @Override
    public void dodajDebet(double ile) {
        this.debet = ile;
    }

    @Override
    public void odsetki() {
        this.saldo *= 1.05;
    }

    @Override
    public String toString() {
        return "BankING{" +
                "nrKonta='" + nrKonta + '\'' +
                ", saldo=" + saldo +
                ", debet=" + debet +
                '}';
    }
}
