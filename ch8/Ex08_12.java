// hw8_12，視窗類別
class CWin {
    int width;
    int height;
    String name;

    void setW(int w) // 設定寬度的函數
    {
        width = w;
    }

    void setH(int h) // 設定高度的函數
    {
        height = h;
    }

    void setName(String s) // 設定視窗名稱的函數
    {
        name = s;
    }

    void show() {
        System.out.println("Name=" + name);
        System.out.println("w=" + width + ", H=" + height);
    }
    
    // 加入 setWindows 函數用于同时设置 width 和 height
    void setWindows(int w, int h) {
        width = w;
        height = h;
    }
    
    // 多載 setWindows 函數用于同时设置 width、height 和 name
    void setWindows(int w, int h, String s) {
        width = w;
        height = h;
        name = s;
    }
}

public class Ex08_12 {
    public static void main(String args[]) {
        CWin cw = new CWin();
        cw.setName("My Windows");
        cw.setW(5);
        cw.setH(3);
        cw.show();
        
        // 使用 setWindows 函數同时设置 width 和 height
        cw.setWindows(8, 6);
        cw.show();
        
        // 使用多載的 setWindows 函數同时设置 width、height 和 name
        cw.setWindows(10, 4, "New Window");
        cw.show();
    }
}
