import java.util.Scanner;

// 自訂 IntegerLessThanZero 例外
class IntegerLessThanZero extends Exception {
    public IntegerLessThanZero(String message) {
        super(message);
    }
}

// 自訂 IntegerGreaterThanZero 例外
class IntegerGreaterThanZero extends Exception {
    public IntegerGreaterThanZero(String message) {
        super(message);
    }
}

// 自訂 IntegerEqualToZero 例外
class IntegerEqualToZero extends Exception {
    public IntegerEqualToZero(String message) {
        super(message);
    }
}

public class Ex13_17{
    public static void main(String[] args) {
        try {
            int userInput = getUserInput();
            checkInteger(userInput);
        } catch (IntegerLessThanZero e) {
            System.out.println(e.getMessage());
        } catch (IntegerGreaterThanZero e) {
            System.out.println(e.getMessage());
        } catch (IntegerEqualToZero e) {
            System.out.println(e.getMessage());
        }
    }

    // 使用 Scanner 獲取用戶輸入的整數
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入一個整數：");
        return scanner.nextInt();
    }

    // 檢查整數並拋出相應的例外
    public static void checkInteger(int num) throws IntegerLessThanZero, IntegerGreaterThanZero, IntegerEqualToZero {
        if (num < 0) {
            throw new IntegerLessThanZero("您輸入的整數的值小於0");
        } else if (num > 0) {
            throw new IntegerGreaterThanZero("您輸入的整數的值大於0");
        } else {
            throw new IntegerEqualToZero("您輸入的整數的值為0");
        }
    }
}