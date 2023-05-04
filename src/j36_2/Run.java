package j36_2;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("W ktorym banku chcesz utworzyc konto?");
        System.out.println("1 - ING 5%");
        System.out.println("2 - PKO 10%");
        String wybor = scanner.nextLine();

        KontoBankowe kontoBankowe = null;

        if (wybor.equals("1")) {
            kontoBankowe = new BankING();
        } else if (wybor.equals("2")) {
            kontoBankowe = new BankPKO();
        }
        System.out.println("Podaj nr konta");
        kontoBankowe.nrKonta= scanner.nextLine();

        System.out.println("Podaj Saldo poczatkowe");
        kontoBankowe.saldo = scanner.nextDouble();
        System.out.println(kontoBankowe);

        System.out.println("Podaj debet");
        kontoBankowe.dodajDebet(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("ile dodac do konta");
        double dane  = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(kontoBankowe + " saldo do operacji = " + kontoBankowe.saldo);
        kontoBankowe.wplata(dane);
        System.out.println(kontoBankowe);

        System.out.println("ile wyplacic z konta");
        dane  = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(kontoBankowe + " saldo do operacji = " + kontoBankowe.saldo);
        kontoBankowe.wyplata(dane);
        System.out.println(kontoBankowe);

        kontoBankowe.odsetki();
        System.out.println(kontoBankowe);

    }

}

