class Rectangle{
    double x;
    double y;
}
public class cbbb{
    public static void main(String[]args){
        Rectangle obj1;
        obj1= new Rectangle();

        obj1.x=5.2;
        obj1.y=3.9;

        Rectangle obj2;
        obj2= new Rectangle();

        obj2.x=6.5;
        obj2.y=4.6;

        Rectangle avg;
        avg = new Rectangle();
        avg.x = ((obj1.x+obj2.x)/2);
        avg.y = ((obj1.y+obj2.y)/2);
        System.out.println("obj1.x="+obj1.x + " , obj1.y="+obj1.y);
        System.out.println("obj2.x="+obj2.x + " , obj2.y="+obj2.y);
        System.out.println("avg.x="+avg.x+ " , avg.y="+avg.y);
    }
}