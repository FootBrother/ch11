package ch11;

interface Data10 {
    public void best(); // 計算成績較高

    public void failed();// 計算哪科低於60
}

interface Test10 extends Data10 {
    public void showData();// 學生資料、平均成績

    public double average();// 數學、英文平均成績
}

class Stu10 implements Test10 {
    protected String name;
    protected int math;
    protected int english;

    public Stu10(String a, int b, int c) {
        name = a;
        math = b;
        english = c;
    }

    public void best() {
        if (math > english) {
            System.out.println("Judy英文比數學好");
        } else {
            System.out.println("Judy數學比英文好");
        }
    } // 計算成績較高

    public void failed() {
        if (math < 60) {
            System.out.println("Judy數學被當");
        }
        if (english < 60) {
            System.out.println("Judy英文被當");
        }
    }// 計算哪科低於60

    public void showData() {
        System.out.println("name: " + name);
        System.out.println("math = " + math);
        System.out.println("english = " + english);
        System.out.println("average = " + average());
    }// 學生資料、平均成績

    public double average() {
        return (double)(math + english) / 2;
    }// 數學、英文平均成績

    public void show(){
        showData();
        best();
        failed();
    }
}

public class class10 {
    public static void main(String[] args) {
        Stu10 st1 = new Stu10("Judy", 58, 91);
        st1.show();

    }
}