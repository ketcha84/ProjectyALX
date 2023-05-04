package J29_4;

import java.util.Scanner;

public class Run {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        NFZ nfz = new NFZ();
        while (true) {
            System.out.println("Witam w NFZ");
            System.out.println("Wybierz menu:");
            System.out.println("1 - Przychodnia, 2 - Pacjent, 3 - Koniec");
            switch (readMenu()) {
                case 1 -> {
                    //qweqwfdfas
                    System.out.println("1 - Dodaj przychodnie, 2 - Dodaj pacjenta, " +
                            "3 - Lista przychodni, 4 - Lista pacjentow w przychodni, ");
                    switch (readMenu()) {
                        case 1 -> {
                            nfz.addPrzychodnia();
                        }
                        case 2 -> {
                            nfz.addPacjent();
                        }
                        case 3 -> {
                            nfz.listPrzychodna();
                        }
                        case 4 -> {
                            System.out.println(nfz.listPacjetow());
                        }
                        default -> System.out.println("Wybierz poprawny punkt menu");
                    }
                }
                case 2 -> {
                    System.out.println("1 - Dodaj chorobe, 2 - Lista chorob pacjenta");
                    switch (readMenu()) {
                        case 1 -> {
                            System.out.println("Podaj nazwe chorobe");
                            nfz.addChorobe(scanner.nextLine());
                        }
                        case 2 -> System.out.println(nfz.listaChorob());
                        default -> System.out.println("Wybierz poprawny punkt menu");
                    }
                }
                case 3 -> {
                    return;
                }
                default -> {
                    System.out.println("Wybierz poprawny punkt menu");
                }
            }
        }
    }

    private static int readMenu() {
        int menu = scanner.nextInt();
        scanner.nextLine();
        return menu;
    }
}
