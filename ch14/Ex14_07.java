import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class Ex14_07 {
    public static void main(String[] args) {
        char[] hi = {'H', 'e', 'l', 'l', 'o', ' ', 'J', 'a', 'v', 'a', '!', '\r', '\n'};
        String welcome = "Welcome!";
        String fileName = "/Users/xinyu8985/Desktop/java2/Ex14._4/hello.txt";  // 請替換為實際的路徑

        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(welcome);
            System.out.println("Data has been appended to the file.");

            // 讀取整個檔案內容並印出
            char[] buffer = new char[1024];
            int charsRead;
            try (FileReader reader = new FileReader(fileName)) {
                while ((charsRead = reader.read(buffer)) != -1) {
                    System.out.print(new String(buffer, 0, charsRead));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}