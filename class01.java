///#1,#2,#4,#5,#7,#8,#10,11,12
package ch11;

abstract class Caaa {
    protected int num;

    Caaa(int n){
        num = n;
    }

    public abstract void show();
}

class Cbbb extends Caaa {
    Cbbb(int n) {
        super(n);
    }

    public void show() {
        System.out.println("num = " + num);
    }
}

public class class01 {
    public static void main(String[] args) {
        Cbbb bb = new Cbbb(5);
        bb.show();
    }
}