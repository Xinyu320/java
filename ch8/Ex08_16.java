import java.lang.Math;

class CSphere {
    private int x;
    private int y;
    private int z;
    private int radius;

    // 构造函数
    public CSphere() {
        // 默认构造一个半径为1的球，位置为(0, 0, 0)
        x = 0;
        y = 0;
        z = 0;
        radius = 1;
    }

    // 设置圆心位置的函数
    public void setLocation(int newX, int newY, int newZ) {
        x = newX;
        y = newY;
        z = newZ;
    }

    // 设置半径的函数
    public void setRadius(int newRadius) {
        radius = newRadius;
    }

    // 计算球的表面积
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // 计算球的体积
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // 显示圆心座标的函数
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
