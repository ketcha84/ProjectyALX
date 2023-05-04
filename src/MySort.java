import java.util.Arrays;

public class MySort {
    /**
     * Size of array
     */
    private static final int LENGTH = 10;

    public static void main(String[] args) {
        int[] mass = new int[LENGTH];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println(Arrays.toString(mass));
        System.out.println("*************************");
        for (int i = 0; i < mass.length - 1; i++) {
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[i] > mass[j]) {
                    int temp = mass[i];
                    mass[i] = mass[j];
                    mass[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}