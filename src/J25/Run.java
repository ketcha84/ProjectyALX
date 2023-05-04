package J25;

public class Run {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("int, int " + calc.suma(12, 12));
        System.out.println("int, int, int " + calc.suma(12, 12, 12));
        System.out.println("double, double " + calc.suma(10.1, 23.4));
        System.out.println("double, double, double " + calc.suma(10.1, 4, 34.5));

    }
}
