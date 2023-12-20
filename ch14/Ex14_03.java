import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex14_03{
    public static void main(String[] args) {
        BufferedReader buf;
        String inputStr;
        int n;

        buf = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("請輸入一個數字 n: ");
            inputStr = buf.readLine();

            // 將輸入的字串轉換為整數
            n = Integer.parseInt(inputStr);

            // 計算 1+2+...+n 的總和
            int sum = calculateSum(n);

            System.out.println("1+2+...+" + n + " 的總和為: " + sum);
        } catch (IOException | NumberFormatException e) {
            System.out.println("發生錯誤: " + e.getMessage());
        }
    }

    // 計算 1+2+...+n 的總和的函數
    private static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
