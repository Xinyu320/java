class CBox {
    int length;
    int width;
    int height;

    public CBox(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int volume() {
        return length * width * height;
    }

    public int surfaceArea() {
        return (length * width + width * height + height * length)*2;
    }
    void showData(){
        System.out.println("length= "+length);
        System.out.println("width= "+width);
        System.out.println("height= "+height);
    }
    void showAll() {
        showData();
        System.out.println("volume: " + volume());
        System.out.println("surface area: " + surfaceArea());
    }
}

public class Ex08_5 {
    public static void main(String[] args) {
        CBox box =new CBox(1,1,1);
        box.showAll();
    }
}
