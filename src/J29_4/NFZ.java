package J29_4;

import java.util.ArrayList;
import java.util.Scanner;

public class NFZ {
    private ArrayList<Przychodnia> przychodniaArrayList = new ArrayList<>();

    public void addPacjent() {
        Przychodnia przychodnia = findPrzychodnia();
        if (przychodnia != null) {
            String[] data = readData(" imie", " nazwisko");
            Pacjent pacjent = new Pacjent(data[0], data[1]);
            przychodnia.addPacjent(pacjent);
        } else {
            sout("Przychodnia nie istniee");
        }
    }

    public void addPrzychodnia() {
        String[] data = readData("nazwe", "miasto");
        przychodniaArrayList.add(new Przychodnia(data[0], data[1]));
    }

    private String[] readData(String... input) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;//1
        String[] data = new String[input.length];
        for (String s : input) {
            sout("Podaj " + s);
            data[i++] = scanner.nextLine();
        }
        return data;
    }

    private void sout(String message) {
        System.out.println(message);
    }

    private Przychodnia findPrzychodnia() {
        String[] data = readData("nazwe przychodni.", " miasto.");
        for (Przychodnia p : przychodniaArrayList) {
            if (p.getNazwa().equals(data[0])
                    && p.getMiasto().equals(data[1])) {
                return p;
            }
        }
        return null;
    }

    private Pacjent findPacjent(Przychodnia przychodnia, String nazwisko) {
        for (Pacjent p : przychodnia.getListPacjentow()) {
            if (p.getNazwisko().equals(nazwisko)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "NFZ{" +
                "przychodniaArrayList=" + przychodniaArrayList +
                '}';
    }

    public void listPrzychodna() {
        for (Przychodnia p : przychodniaArrayList) {
            sout("Przychodnia: " + p.getNazwa()
                    + " Miasto: " + p.getMiasto());
        }
    }

    public String listPacjetow() {
        Przychodnia p = findPrzychodnia();
        if (p != null) {
            String result = "";
            for (Pacjent pacjent : p.getListPacjentow()) {
                result += "Imie: " + pacjent.getImie()
                        + " Nazwisko: " + pacjent.getNazwisko() + "\n";
            }
            return result;
        } else {
            return "Przychodnia nie istniee";
        }
    }

    public void addChorobe(String choroba) {
        Przychodnia p = findPrzychodnia();
        if (p != null) {
            String[] data = readData(" nazwisko");
            Pacjent pacjent = findPacjent(p, data[0]);
            if (pacjent != null) {
                pacjent.addChorobe(choroba);
            } else {
                sout("Pacjent nie istniee");
            }
        } else {
            sout("Przychodnia nie istniee");
        }
    }

    public String listaChorob() {
        Przychodnia p = findPrzychodnia();
        if (p != null) {
            String[] data = readData(" nazwisko");
            Pacjent pacjent = findPacjent(p, data[0]);
            if (pacjent != null) {
                return pacjent.getListachorob().toString();
            } else {
                return "Pacjent nie istniee";
            }
        } else {
            return "Przychodnia nie istniee";
        }
    }
}