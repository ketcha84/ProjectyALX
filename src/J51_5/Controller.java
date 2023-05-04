package J51_5;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    ArrayList<Znajomy> listZnaiomy = new ArrayList<>();
    Gson json = new Gson();
    File file = new File("C:\\Users\\PC\\Desktop\\Projekty ALX\\src\\J51_5\\J51_5.txt");

    public Controller() throws FileNotFoundException {

        try {
            Scanner scanner = new Scanner(file);
            String dane = scanner.nextLine();

            Type typeDannych = new TypeToken<ArrayList<Znajomy>>() {}.getType();
            listZnaiomy = json.fromJson(dane, typeDannych);
            scanner.close();
        } catch (Exception e) {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(json.toJson(this.listZnaiomy));
            printWriter.close();
        }
    }

    public void dodaj(String imie, String nazwisko, String telefon, String email) throws FileNotFoundException {
        Znajomy znajomy = new Znajomy(imie, nazwisko, telefon, email);
        listZnaiomy.add(znajomy);

        PrintWriter writer = new PrintWriter(file);
        writer.println(json.toJson(this.listZnaiomy));
        writer.close();
    }

    public void pokaz() {
        for (Znajomy z : listZnaiomy) {
            System.out.println(z);
        }
    }

    public void usun(String nazwisko) throws FileNotFoundException {
        for (Znajomy z : listZnaiomy) {
            if (z.nazwisko.equals(nazwisko)) {
                listZnaiomy.remove(z);
                break;
            }
        }
        PrintWriter writer = new PrintWriter(file);
        writer.println(json.toJson(this.listZnaiomy));
        writer.close();
    }

    public void zmien(String nazwisko, String noweImie, String noweNazwisko) throws FileNotFoundException {
        for (Znajomy z : listZnaiomy) {
            if (z.nazwisko.equals(nazwisko)) {
                z.imie = noweImie;
                z.nazwisko = noweNazwisko;
                break;
            }
        }
        PrintWriter writer = new PrintWriter(file);
        writer.println(json.toJson(this.listZnaiomy));
        writer.close();
    }
}
