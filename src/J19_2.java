import java.util.Scanner;

public class J19_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] gra = new int[3][3];
        int gracz = 1;
        boolean play = true;

        while (play) {
            for (int[] x : gra) {
                System.out.println(x[0] + " " + x[1] + " " + x[2]);
            }

            System.out.println("Gracz " + gracz + " podaj wsp. X:");
            int x = scanner.nextInt(); //2
            System.out.println("Gracz " + gracz + " podaj wsp. Y:");
            int y = scanner.nextInt(); //0

            if (gra[x][y] == 0) {
                gra[x][y] = gracz;
            }

            if (gracz == 1) {
                gracz = 2;
            } else {
                gracz = 1;
            }

//check horizontal
            for (int i = 0; i < 3; i++) {
                if (gra[i][0] == 1 && gra[i][1] == 1 && gra[i][2] == 1) {
                    System.out.println("Gracz 1 wygral");
                    play = false;
                    break;
                } else if (gra[i][0] == 2 && gra[i][1] == 2 && gra[i][2] == 2) {
                    System.out.println("Gracz 2 wygral");
                    play = false;
                    break;
                }
            }
//check vertical
            for (int i = 0; i < 3; i++) {
                if (gra[0][i] == 1 && gra[1][i] == 1 && gra[2][i] == 1) {
                    System.out.println("Gracz 1 wygral");
                    play = false;
                    break;
                } else if (gra[0][i] == 2 && gra[1][i] == 2 && gra[2][i] == 2) {
                    System.out.println("Gracz 2 wygral");
                    play = false;
                    break;
                }
            }

//check diagonal 1
            if (gra[0][0] == 1 && gra[1][1] == 1 && gra[2][2] == 1) {
                System.out.println("Gracz 1 wygral");
                play = false;
            } else if (gra[0][0] == 2 && gra[1][1] == 2 && gra[2][2] == 2) {
                System.out.println("Gracz 1 wygral");
                play = false;
            }
//check diagonal 2
            if (gra[2][0] == 1 && gra[1][1] == 1 && gra[0][2] == 1) {
                System.out.println("Gracz 1 wygral");
                play = false;
            } else if (gra[2][0] == 2 && gra[1][1] == 2 && gra[0][2] == 2) {
                System.out.println("Gracz 1 wygral");
                play = false;
            }
//check dead heat
            boolean deadHeat = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (gra[i][j] == 0) {
                        deadHeat = false;
                        break;
                    }
                }
            }
            if (deadHeat) {
                System.out.println("Remis");
                play = false;
            }

        }

    }
}