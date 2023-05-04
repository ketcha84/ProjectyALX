package J38;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CompanyController {
    private final String FILE_NAME = "C:\\Users\\PC\\Desktop\\Projekty ALX\\src\\J38\\J38.txt";
    private final File f = new File(FILE_NAME);

    public void dodaj(String imie, String nazwisko, String wyplata) {
        try {
            FileWriter fileWriter = new FileWriter(f, true);
            String data = imie + ";" + nazwisko + ";" + wyplata;
            fileWriter.append(data + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void odczytaj() {

        try (Scanner scanner = new Scanner(f)) {
            while (scanner.hasNextLine()) {
                String[] array = scanner.nextLine().split(";");
                System.out.println("Imie: " + array[0] + "\tNazwisko: " + array[1] + "\tWyplata: " + array[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void usun(String nazwisko) {
        ArrayList<String> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(f)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] array = line.split(";");

                if (!array[1].equals(nazwisko)) {
                    list.add(line);
                }
            }
            scanner.close();
            try (FileWriter fileWriter = new FileWriter(f)) {
                for (String line : list) {
                    fileWriter.append(line + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void zmien(String nazwisko, String noweImie, String noweNazw) {
        ArrayList<String> arrayList = new ArrayList<>();
        try (Scanner scanner = new Scanner(f)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] array = line.split(";");

                if (array[1].equals(nazwisko)) {
                    String newLine;
                    newLine = noweImie + ";" + noweNazw + ";" + array[2];
                    arrayList.add(newLine);
                } else {
                    arrayList.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fileWriter = new FileWriter(f)) {
            for (String s : arrayList) {
                fileWriter.append(s + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void wyszukaj(String fraza) { //*
        ArrayList<String> arrayList = new ArrayList<>();
        try (Scanner scanner = new Scanner(f)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(fraza)) {
                    arrayList.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s : arrayList) {
            String[] array = s.split(";");
            System.out.println("Imie: " + array[0] + "\tNazwisko: " + array[1] + "\tWyplata: " + array[2]);
        }
    }

}
