import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex14_04 {
    public static void main(String[] args) {
        File file = new File("/Users/xinyu8985/Desktop/java2/Ex14._4/donkey.txt");

        try (FileReader reader = new FileReader(file)) {
            int charCount = 0;
            int data;
            while ((data = reader.read()) != -1) {
                charCount++;
                System.out.print((char) data); // 將每個字元印出來
            }
            System.out.println("\nTotal characters read: " + charCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
