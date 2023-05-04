package kt;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Controller {
    DBConnect dbConnect = new DBConnect();

    public void dodaj(String imie, String nazwisko, String telefon) throws SQLException {
        String sqlQuery = "INSERT INTO kontakty(imie, nazwisko, telefon) VALUES (?,?,?)";
        PreparedStatement statement = dbConnect.getCon().prepareStatement(sqlQuery);
        statement.setString(1, imie);
        statement.setString(2, nazwisko);
        statement.setString(3, telefon);

        statement.execute();
        statement.close();
        System.out.println("Czy zatwierdzasz wprowaddzenie nowych danych T/N:");
        Scanner scanner = new Scanner(System.in);
        String dec = scanner.nextLine().toUpperCase();
        if (dec.equals("T")) {
            dbConnect.getCon().commit();
            System.out.println("Dane zostały utrwalone w bazie");
        } else {
            dbConnect.getCon().rollback();
            System.out.println("Dane zostały wycofane z bazy");
        }
    }

    public void pokaz() throws SQLException {
        String sqlQuery = "Select * FROM kontakty";
        Statement statement = dbConnect.getCon().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("ID")
                    + "\tImie: " + rs.getString("imie")
                    + "\tNazwisko: " + rs.getString("nazwisko")
                    + "\tTelefon: " + rs.getString("telefon"));
        }
        statement.close();
    }

    public void usun(String nazwisko) throws SQLException {
        String sqlQuery = "DELETE from kontakty where nazwisko=?";
        PreparedStatement statement = dbConnect.getCon().prepareStatement(sqlQuery);
        statement.setString(1, nazwisko);
        statement.execute();
        statement.close();

        System.out.println("Czy chcesz usunac dane T/N");
        Scanner scanner = new Scanner(System.in);
        String dec = scanner.nextLine().toUpperCase();
        if (dec.equals("T")) {
            dbConnect.getCon().commit();
        } else {
            dbConnect.getCon().rollback();
            System.out.println("Dane usuniete");
        }
    }

    public void zmien(String nazwisko, String noweImie, String noweNazwisko, String nowyTelefon) throws SQLException {
        String sqlQuery = "UPDATE kontakty SET imie=?, nazwisko=?, telefon=? WHERE nazwisko=?";

        PreparedStatement statement = dbConnect.getCon().prepareStatement(sqlQuery);
        statement.setString(1, noweImie);
        statement.setString(2, noweNazwisko);
        statement.setString(3, nowyTelefon);
        statement.setString(4, nazwisko);
        statement.execute();
        statement.close();

        System.out.println("Czy chcesz zmienic dane T/N");
        Scanner scanner = new Scanner(System.in);
        String dec = scanner.nextLine().toUpperCase();
        if (dec.equals("T")) {
            dbConnect.getCon().commit();
        } else {
            dbConnect.getCon().rollback();
            System.out.println("Dane zmienjony");
        }
    }

    public void find(String fraza) throws SQLException {
        String sqlQuery = "SELECT * FROM kontakty WHERE imie LIKE \"%" + fraza + "%\" OR nazwisko LIKE \"%" + fraza + "%\"";
        Statement statement = dbConnect.getCon().createStatement();
        ResultSet set = statement.executeQuery(sqlQuery);
        while (set.next()) {
            System.out.println("ID: " + set.getInt("ID")
                    + "\tImie: " + set.getString("imie")
                    + "\tNazwisko: " + set.getString("nazwisko")
                    + "\tTelefon: " + set.getString("telefon"));
        }
    }
}
