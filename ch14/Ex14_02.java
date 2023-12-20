import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex14_02{
    public static void main(String[] args) {
        BufferedReader buf;
        String str;

        buf = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("輸入一個字串: ");
            str = buf.readLine();

            String upperCaseStr = str.toUpperCase();

            System.out.println("大寫字串: " + upperCaseStr);
        } catch (IOException e) {
            System.out.println("讀取輸入時發生錯誤: " + e.getMessage());
        }
    }
}
