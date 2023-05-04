public class J1_1 {
    public static void main(String[] args) {
        String zm1 = "ciekawe";
        String zm2 = "programowanie";
        String zm3 = "jest";
        String zm4 = "wciagajace";
        String zm5 = "i";
        String pomoc;

        pomoc = zm1;
        zm1 = zm2;
        zm2 = pomoc;
        pomoc = zm4;
        zm4 = zm5;
        zm5 = pomoc;
        pomoc = zm2;
        zm2 = zm3;
        zm3 = pomoc;


        System.out.print(zm1);
        System.out.print(" ");
        System.out.print(zm2);
        System.out.print(" ");
        System.out.print(zm3);
        System.out.print(" ");
        System.out.print(zm4);
        System.out.print(" ");
        System.out.print(zm5);
        //programowanie jest ciekawe i wciagajace

    }
}
