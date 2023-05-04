public class J51_2 {
    public static void main(String[] args) {
        String zm1 = "SUKCES";
        String zm2 = "słownik";
        String zm3 = "występuje";
        String zm4 = "jest";
        String zm5 = "WYSIŁKIEM";
        String zm6 = "Jedynym";
        String zm7 = "gdzie";
        String zm8 = "miejscem";
        String zm9 = "przed";
        String buff;

        buff = zm6;
        zm6 = zm1;
        zm1 = buff;

        buff = zm8;
        zm8 = zm2;
        zm2 = buff;

        buff = zm7;
        zm7 = zm3;
        zm3 = buff;

        buff = zm6;
        zm6 = zm4;
        zm4 = buff;

        buff = zm7;
        zm7 = zm5;
        zm5 = buff;

        buff = zm9;
        zm9 = zm6;
        zm6 = buff;

        buff = zm9;
        zm9 = zm8;
        zm8 = buff;

        System.out.printf("%s %s %s %s %s %s %s %s %s", zm1, zm2, zm3, zm4, zm5, zm6, zm7, zm8, zm9);

    }
}
