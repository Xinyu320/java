class CTriangle{
    protected int base;
    protected int height;

    protected void show(){
        System.out.println("base="+base+", height="+height);
    }
}
class CData extends CTriangle{
    double area;

    public CData(int base , int height){
        this.base = base;
        this.height = height;
        this.area = (base*height/2);
    }
    protected void show(){
        System.out.println("base="+base+", height="+height);
        System.out.printf("area="+area);
        System.out.println();
    }
    }
public class Class10_6 {
    public static void main(String[] args){
        CData obj = new CData(3,8);
        obj.show();
     }
}
