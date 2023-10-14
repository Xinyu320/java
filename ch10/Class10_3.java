class Caaa{
    public int num1;
    public int num2;
    public Caaa(){
        num1 = 1;
        num2 = 1;
    }
    public Caaa(int a,int b){
        num1 = a;
        num2 = b;
    }
    public void show(){
        System.out.println("num1="+num1+" "+"num2="+num2);
    }
}
class Cbbb extends Caaa{
    public void set_num(int t1, int t2){
        num1 = t1;
        num2 = t2;
    }
    public Cbbb(int a,int b){
        super(a, b);
    }
    public void show(){
        System.out.println("num1="+num1+" "+"num2="+num2);
    }
}
public class Class10_3
{
    public static void main(String args[])
    {
        Caaa caa1= new Caaa();
        Caaa caa2= new Caaa();
        Cbbb cbbb= new Cbbb(0, 0);
        
        caa1.show();
        caa2.show();
        cbbb.show();

    }
}
