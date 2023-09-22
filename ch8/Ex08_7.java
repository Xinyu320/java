class CTest {
    public void test(int num) {
        if (num == 0) {
            System.out.println("此數為 0");
        } else if (num % 2 == 0) {
            System.out.println("此數為偶數");
        } else {
            System.out.println("此數為奇數");
        }
    }
}

public class Ex08_7 {
    public static void main(String[] args) {
        CTest c1 = new CTest();
        CTest c2 = new CTest();
        CTest c3 = new CTest();

        int num1 = 3;
        int num2 = 8;
        int num3 = 0;

        System.out.print("c1=" + num1 + " ,");
        c1.test(num1);

        System.out.print("c2=" + num2 + " ,");
        c2.test(num2);

        System.out.print("c3=" + num3 + " ,");
        c3.test(num3);
    }
}
