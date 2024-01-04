class Sub implements Runnable {
    private int n;
    private long result = 1;

    public Sub(int a) {
        n = a;
    }

    public void run() {
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("n = " + n + ": " + result);
    }
}

public class Class15_06{
    public static void main(String[] args) {
        Thread t1 = new Thread(new Sub(5));
        Thread t2 = new Thread(new Sub(10));

        t1.start();
        t2.start();
    }
}
