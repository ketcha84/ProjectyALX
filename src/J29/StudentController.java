package J29;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    ArrayList<Student> studentArrayList = new ArrayList<>();

    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie");
        String imie = scanner.nextLine();

        System.out.println("Podaj nazwisko");
        String nazwisko = scanner.nextLine();

        System.out.println("Podaj index");
        int index = scanner.nextInt();
        scanner.nextLine();

        studentArrayList.add(new Student(imie, nazwisko, index));
    }

    public void listStudenst() {
        for (Student student : studentArrayList) {
            System.out.println(student);
        }
    }

    public void deleteStudent(int index) {
        for (Student s : studentArrayList) {
            if (s.getIndex() == index) {
                studentArrayList.remove(s);
                Student.count--;
                break;
            }
        }
    }

    public void editStudent(int index) {
        for (Student s : studentArrayList) {
            if (s.getIndex() == index) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Podaj nowe imie");
                s.setImie(scanner.nextLine());
                System.out.println("Podaj nowe nazwisko");
                s.setNazwisko(scanner.nextLine());
                break;
            }
        }
    }

    public void amountOfStudents(){
        System.out.println("Ilosc studentow = " + Student.count);
    }
    public void exit(){
        System.exit(0);
    }
}
