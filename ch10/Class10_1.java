class Caaa{
    public int num1;
    public int num2;
}
class Cbbb extends Caaa{
    public void set_num(int t1, int t2){
        num1 = t1;
        num2 = t2;
    }
    public void show(){
        System.out.println("num1="+num1+" "+"num2="+num2);
    }
}
public class Class10_1
{
    public static void main(String args[])
    {
        Cbbb bb= new Cbbb();
        bb.set_num(5,10);
        bb.show();
    }
}
