package ch11;

interface ivolume {
    public void showData();// 輸出球體資料

    public double vol();// 計算球體積
}

abstract class Sphere implements ivolume {
    final double PI = 3.14;
    protected int x;
    protected int y;
}

class Circle extends Sphere {
    public int r;

    public Circle(int x1, int y1, int r1) {
        x = x1;
        y = y1;
        r = r1;
    }

    public double vol() {
        return (double) (4 * PI * r * r * r) / 3;
    }

    public void showData() {
        System.out.println("球心：(" + x + "," + y + ")");
        System.out.println("半徑：" + r);
        System.out.printf("球體積：%.2f\n", (vol()));
    }

}

public class class12 {

    public static void main(String[] args) {
        Circle c1 = new Circle(8, 6, 2);
        c1.showData();// 球心(8,6) 半徑2 體積33.49
    } // b題:因為都繼承至Circle類別裡
}