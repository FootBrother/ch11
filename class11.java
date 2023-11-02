package ch11;

interface show_ans {
    public void show();
}

interface Mymath11 extends show_ans {
    void add(int a, int b); // a+b

    void sub(int a, int b); // a-b

    void mul(int a, int b); // a*b

    void div(int a, int b); // a/b
}

class Compute11 implements Mymath11 {
    private int ans;

    public void add(int a, int b) {
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

    public void show() {
        System.out.println("ans = " + ans);
    }
}

public class class11 {

    public static void main(String[] args) {
        Compute11 cp = new Compute11();
        cp.mul(3, 5);
        cp.show(); // 15
    }
}
