import java.io.FileWriter;
import java.io.IOException;

public class Ex14_06{
    public static void main(String[] args) {
        char[] hi = {'H', 'e', 'l', 'l', 'o', ' ', 'J', 'a', 'v', 'a', '!', '\r', '\n'};
        String fileName = "/Users/xinyu8985/Desktop/java2/Ex14._4/hello.txt"; 

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(hi);
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
