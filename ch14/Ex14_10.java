import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Data {
    private String name;
    private int english;
    private int math;

    // 有引數的建構子
    public Data(String str, int e, int m) {
        this.name = str;
        this.english = e;
        this.math = m;
    }

    // 將資料寫入 student.txt
    public void writeData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("student.txt", true))) {
            writer.write(name + " " + english + " " + math);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 計算並顯示平均分數
    public void show() {
        System.out.println("Name: " + name);
        System.out.println("English Score: " + english);
        System.out.println("Math Score: " + math);

        double average = (english + math) / 2.0;
        System.out.println("Average Score: " + average);
    }
}

public class Ex14_10 {
    public static void main(String[] args) {
        // 建立學生資料物件
        Data stu1 = new Data("John", 80, 90);
        Data stu2 = new Data("Alice", 75, 88);

        // 將學生資料寫入 student.txt
        stu1.writeData();
        stu2.writeData();

        // 讀取並顯示學生資料
        readData();
    }

    // 讀取 student.txt 的資料並顯示
    public static void readData() {
        try (BufferedReader reader = new BufferedReader(new FileReader("student.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(" ");
                String name = data[0];
                int english = Integer.parseInt(data[1]);
                int math = Integer.parseInt(data[2]);

                // 建立學生資料物件
                Data student = new Data(name, english, math);

                // 顯示學生資料
                student.show();
                System.out.println("---------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
