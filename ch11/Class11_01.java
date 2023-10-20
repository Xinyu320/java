abstract class Caaa {
    protected int num;

    public abstract void show();
}

class Cbbb extends Caaa {
    int num;

    public Cbbb(int n) {
        num = n;
    }

    public void name() {
        
    }

    public void show() {
        System.out.println("num = " + num);
    }
}

public class Class11_01 {
    public static void main(String[] args) {
        Cbbb bb = new Cbbb(2);
        bb.show();
    }
}
