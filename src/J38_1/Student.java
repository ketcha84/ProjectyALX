package J38_1;

import java.util.ArrayList;

public class Student {
    private String name, lastname;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public void addGrade(int value) {
        grades.add(value);
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public String getName() {
        return this.name;
    }

    public String getLastname() {
        return this.lastname;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", oceny=" + grades +
                '}';
    }
}
