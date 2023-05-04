package J29;

import java.util.Scanner;

public class StudentRun {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentController controller = new StudentController();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Witam w students");
            System.out.println("Wybierz menu:");
            System.out.println("1 - Dodaj studenta, 2 - Wyswietl studentow, 3 - Usun studenta, 4 - Edytuj studenta, 5 - Ilosc studentow, 6 - exit");
            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1 -> {
                    controller.addStudent();
                    break;
                }
                case 2 -> {
                    controller.listStudenst();
                    break;
                }
                case 3 -> {
                    System.out.println("Podaj index");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    controller.deleteStudent(index);
                    break;
                }
                case 4 -> {
                    System.out.println("Podaj index");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    controller.editStudent(index);
                    break;
                }
                case 5 -> {
                    controller.amountOfStudents();
                    break;
                }
                case 6 -> {
                    controller.exit();
                    break;
                }
                default -> {
                    System.out.println("Wyberz poprawny punkt menu");
                    break;
                }
            }
        }
    }
}
