package pl.dawidpalka;

public class Teen {

    final int MINTEEN = 13;
    final int MAXTEEN = 19;

    private int a;
    private int b;

    public Teen(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public boolean isTeen(int x) {
        return x <= MAXTEEN && x >= MINTEEN;
    }

    public void print() {
        if(this.isTeen(this.a) ^ this.isTeen(this.b)) {
            System.out.println("teen");
        }
    }

}
