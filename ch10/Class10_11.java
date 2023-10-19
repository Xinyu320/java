class CShape
{
    public double area()
    {
        return 0.0;
    }
}
class CCircle extends CShape{
    private double radius;

    public CCircle(double r){
        radius = r;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
}
class CSquare extends CShape{
    private double side;

    public CSquare(double s){
        side = s;
    }
    public double area(){
        return side * side;
    }
}
class CTriangle extends CShape{
    private double base;
    private double height;

    public CTriangle(double b,double h){
        base = b;
        height = h;
    }
    public double area(){
        return 0.5 * base * height;
    }
}
public class Class10_11 {
    public static void main(String[] args) {
        CShape[] shapes = new CShape[3];
        shapes[0] = new CCircle(5.0);
        shapes[1] = new CSquare(4.0);
        shapes[2] = new CTriangle(3.0, 6.0);

        CShape largestShape = largest(shapes);
        System.out.println("最大面積是：" + largestShape.area());
    }

    public static CShape largest(CShape[] shapes) {
        if (shapes == null || shapes.length == 0) {
            return null;
        }

        CShape largest = shapes[0];
        double largestArea = shapes[0].area();

        for (CShape shape : shapes) {
            double area = shape.area();
            if (area > largestArea) {
                largest = shape;
                largestArea = area;
            }
        }

        return largest;
    }
}
