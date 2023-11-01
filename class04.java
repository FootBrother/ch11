package ch11;

interface MyMath {
    void show();

    void add(int a, int b); // a+b

    void sub(int a, int b); // a-b

    void mul(int a, int b); // a*b

    void div(int a, int b); // a/b
}

class Compute implements MyMath {
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

public class class04 {
    public static void main(String[] args) {
        Compute cp = new Compute();
        cp.mul(2, 5);
        cp.show(); 
    }
}
