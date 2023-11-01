package ch11;

interface iAaa {
    void show();
}

class Bbb {
    public int num = 10;

    public void set(int n) {
        num = n;
    }
}

class Ccc extends Bbb implements iAaa {

    public void show() {
        System.out.println(num);
    }
}

public class class05 {
    public static void main(String[] args) {
        Ccc obj = new Ccc();
        obj.set(5);
        obj.show(); // 輸出5
    }
}
