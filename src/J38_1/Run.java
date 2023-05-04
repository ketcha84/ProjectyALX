package J38_1;

import java.util.Scanner;

public class Run {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            controller.communication("Menu: 1 - add student, 2 - print list of students, 3 - delete student, " +
                    "4 - add grade to student, 5 - print student info, 6 - exit");
            String menu = scanner.nextLine();

            switch (menu) {
                case "1" -> {
                    controller.addStudent();
                    break;
                }
                case "2" -> {
                    controller.printListOfStudents();
                    break;
                }
                case "3" -> {
                    controller.deleteStudent();
                    break;
                }
                case "4" -> {
                    controller.addGrade();
                    break;
                }
                case "5" -> {
                    controller.printStudent();
                }
                case "6" -> {
                    controller.exit();
                }
                default -> {
                    controller.communication(ANSI_RED + "Wrong menu item" + ANSI_RESET);
                }
            }
        }
    }
}
