package J38_1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Controller {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";


    ArrayList<Student> studentArrayList = new ArrayList<>();
    File fileData = new File("src\\J38_1\\studentsData.txt");
    Gson json = new Gson();

    public Controller() {
        init();
    }

    private void init() {
        try {
            Scanner scanner = new Scanner(fileData);
            String data = scanner.nextLine();
            Type typeData = new TypeToken<ArrayList<Student>>() {
            }.getType();
            studentArrayList = json.fromJson(data, typeData);
            scanner.close();
        } catch (Exception e) {
            saveData();
        }
    }

    private void saveData() {
        try (PrintWriter writer = new PrintWriter(fileData)) {
            writer.println(json.toJson(this.studentArrayList));
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    private int readGrade() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            communication("Enter grade");
            try {
                int grade = scanner.nextInt();
                scanner.nextLine();
                if (grade > 0 || grade <= 5) {
                    return grade;
                } else {
                    communication(ANSI_RED + "Grade must be in between 0 - 5");
                }
            } catch (InputMismatchException e) {
                communication(ANSI_RED + "Must be a number");
                scanner.nextLine();
            }
        }
    }

    private String readString(String data) {
        String line;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            communication("Enter " + data + ":");
            line = scanner.nextLine();
            if (line != null && line.length() > 0) {
                return line;
            } else {
                communication(ANSI_RED + data + " must be longer than 0");
            }
        }
    }

    public void communication(String message) {
        System.out.println(ANSI_YELLOW + message + ANSI_RESET);
    }

    public void addStudent() {
        String name, lastName;
        name = readString("name");
        lastName = readString("last name");

        studentArrayList.add(new Student(name, lastName));
        saveData();
    }

    public void printListOfStudents() {
        communication("========== Students List ==========");
        for (Student s : studentArrayList) {
            communication("Student Name: " + s.getName() + "\t Last name: " + s.getLastname());
        }
        communication("===================================");
    }

    public void deleteStudent() {
        String lastName = readString("last name");
        boolean find = false;
        for (Student s : studentArrayList) {
            if (s.getLastname().equals(lastName)) {
                studentArrayList.remove(s);
                find = true;
                break;
            }
        }
        if (!find) {
            communication(ANSI_RED + "Student not found");
        }
        saveData();
    }

    public void addGrade() {
        boolean find = false;
        String line = readString("last name");
        for (Student s : studentArrayList) {
            if (s.getLastname().equals(line)) {
                find = true;
                int grade = readGrade();
                s.addGrade(grade);
                break;
            }
        }
        if (!find) {
            communication(ANSI_RED + "Student not found");
        }
        saveData();
    }

    public void printStudent() {
        boolean find = false;
        String line = readString("last name");
        for (Student s : studentArrayList) {
            if (s.getLastname().equals(line)) {
                find = true;
                communication("========== Student Info ==========");

                communication("Student Name: " + s.getName()
                        + "\t\tLast name: " + s.getLastname()
                        + "\t\tGrades: " + s.getGrades());
                communication("==================================");
            }
        }
        if (!find) {
            communication(ANSI_RED + "Student not found");
        }
    }

    public void exit() {
        saveData();
        System.exit(0);
    }
}
