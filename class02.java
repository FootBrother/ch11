package ch11;

abstract class MyMath{
    protected int ans;

    public void show(){
        System.out.println("ans = " + ans);
    }

    public abstract void add(int a,int b);  //a+b
    public abstract void sub(int a,int b);  //a-b
    public abstract void mul(int a,int b);  //a*b
    public abstract void div(int a,int b);  //a/b
}

class Compute extends MyMath{
    public void add(int a, int b){
        ans = a + b;
    }
    public void sub(int a, int b) {
        ans = a - b;
    }
    public void mul(int a, int b) {
        ans = a * b;
    }
    public void div(int a, int b) {
        if (b != 0) {
            ans = a / b;
        } else {
            System.out.println("不能除0");
        }
    }

}
public class class02 {
    public static void main(String[] args) {
        Compute cp = new Compute();
        cp.mul(10, 6);
        cp.show();
    }
}
