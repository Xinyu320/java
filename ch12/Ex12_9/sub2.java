package Ex12_9;

class Compute extends MyMath {
    private int ans;

    @Override
    public int add(int a, int b) {
        ans = a + b;
        return ans;
    }

    @Override
    public int sub(int a, int b) {
        ans = a - b;
        return ans;
    }

    @Override
    public int mul(int a, int b) {
        ans = a * b;
        return ans;
    }

    @Override
    public int div(int a, int b) {
        if (b != 0) {
            ans = a / b;
        } else {
            System.out.println("Cannot divide by zero.");
        }
        return ans;
    }

    public void show() {
        System.out.println("ans=" + ans);
    }
}

public class sub2{
    public static void main(String[] args) {
        Compute cmp = new Compute();
        cmp.mul(3, 5);  // Calculate 3 * 5
        cmp.show();     // This line should print "ans=15" to the console
    }
}
