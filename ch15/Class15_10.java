class HiBye implements Runnable {
    private String message;
    private int interval;

    public HiBye(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(message + " " + i);

            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Class15_10 {
    public static void main(String[] args) {
        Thread hiThread = new Thread(new HiBye("Hello", 1000)); // 1000 milliseconds = 1 second
        Thread byeThread = new Thread(new HiBye("Good bye", 2500)); // 2500 milliseconds = 2.5 seconds

        hiThread.start();
        byeThread.start();
    }
}