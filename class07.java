package ch11;

interface MyMath {
    void show();

    void add(int a, int b); // a+b

    void sub(int a, int b); // a-b

    void mul(int a, int b); // a*b

    void div(int a, int b); // a/b
}

interface AdvancedMath {
    void mod(int a, int b); // a%b

    void fac(int a); // a!

    void pow(int a, int b); // a^b

}

class Compute implements MyMath, AdvancedMath {
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

    public void mod(int a, int b) {
        ans = a % b;
    }

    public void fac(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        ans = result;
    }

    public void pow(int a, int b) {
        ans = (int) Math.pow(a, b);
    }

    public void show() {
        System.out.println("ans = " + ans);
    }
}

public class class07 {
    public static void main(String[] args) {

        Compute cp = new Compute();
        cp.mul(3, 5);
        cp.show(); // ans = 15

        cp.mod(14, 5);
        cp.show(); // ans = 4

        cp.fac(5);
        cp.show(); // ans = 120
    }
}
