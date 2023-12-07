public class Ex13_3 {
    public static void main(String[] args) {
        int num = 12, den = 0;

        try {
            int ans = num / den;
            System.out.println("Result of division: " + ans);
        } catch (ArithmeticException e) {
            System.out.println("除數為0，捕捉 ArithmeticException：" + e.getMessage());
        } finally {
            System.out.println("This is finally block.");
        }

        System.out.println("end of main() !!");
    }
}
