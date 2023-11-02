// #1,#2,#4,#5,#7,#8,#10,11,12

package ch11;

interface Data08 {
    public void showData();
}

interface Test {
    public void showScore();

    public double calcu();
        
}

class Stu implements Data08, Test {
    protected String id; // 學號
    protected String name; // 姓名
    protected int mid; // 期中考成績
    protected int finals; // 期末考成績
    protected int common; // 平時成績

    public Stu(String a,String b, int c, int d, int e){
        id = a;
        name = b;
        mid = c;
        finals = d;
        common = e;
    }

    public void showScore(){
        System.out.println("mid = " + mid);
        System.out.println("finals = " + finals);
        System.out.println("common = " + common);
    }

    public void showData(){
        System.out.println("id = " + id);
        System.out.println("name = " + name);
    }
    
    public double calcu(){
        return mid * 0.3 + finals * 0.3 + common * 0.4;
    }
}

public class class08 {

    public static void main(String[] args) {
        Stu student1 = new Stu("940001", "Fiona", 90, 92, 85);
        student1.showData();
        student1.showScore();
    }
}