public class J3_2 {
    public static void main(String[] args) {
        String string = "asd dfsd wer .";
        System.out.println("Length: " + string.length());
        String str2 = string.replace(" ", "");
        System.out.println("Spacje: " + (string.length() - str2.length()));

//        long spacjes = string.chars().filter(c -> c == (int) ' ').count();


    }
}
