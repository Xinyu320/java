import java.lang.Math;

class CSphere {
    private int x;
    private int y;
    private int z;
    private int radius;

    // 構造函数
    public CSphere() {
        // 默认构造一个半径为1的球，位置为(0, 0, 0)
        x = 0;
        y = 0;
        z = 0;
        radius = 1;
    }

    // 設置圆心位置的函数
    public void setLocation(int newX, int newY, int newZ) {
        x = newX;
        y = newY;
        z = newZ;
    }

    // 設置半徑的函数
    public void setRadius(int newRadius) {
        radius = newRadius;
    }

    // 計算球的表面積
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // 計算球的體積
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // 顯示圆心座標的函数
    public void showCenter() {
        System.out.println("圓心座標：(" + x + ", " + y + ", " + z + ")");
    }
}

public class Ex08_16 {
    public static void main(String[] args) {
        CSphere sphere = new CSphere();
        sphere.setLocation(3, 4, 5);
        sphere.setRadius(1);

        System.out.println("表面積: " + sphere.surfaceArea());
        System.out.println("體積: " + sphere.volume());
        sphere.showCenter();
    }
}
