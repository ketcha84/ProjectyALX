import java.io.*;

public class PlikiTXT {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("src/dane.txt");
        FileWriter fileWriter = new FileWriter(file,false);
        fileWriter.append("asdasd\n");
        fileWriter.flush();
        fileWriter.close();
    }
}
