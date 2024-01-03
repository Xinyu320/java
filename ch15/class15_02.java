class Test extends Thread {
    private String id;

    public Test(String id) {
        this.id = id;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 100000000; j++) ;
            System.out.println(id + " " + i);
        }
    }
}

public class class15_02 {
    public static void main(String[] args) {
        Test hello = new Test("Hello");
        Test goodbye = new Test("Goodbye");

        hello.start();
        goodbye.start();
    }
}
