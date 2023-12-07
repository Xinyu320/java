public class Ex13_7 {
    public static void main(String[] args) {
        int[] arr = {4, 12, 87, 21, 6, 18};
        int[] den = {2, 0, 7, 0, 61, 0};
        double sum = 0.0;

        for (int i = 0; i < arr.length; i++) {
            try {
                sum += (double) arr[i] / den[i];
            } catch (ArithmeticException e) {
                System.out.println("捕捉到算術例外：" + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("捕捉到陣列越界例外：" + e.getMessage());
            } catch (Exception e) {
                System.out.println("捕捉到例外：" + e.getMessage());
            }
        }

        System.out.println("sum=" + sum);
    }
}
