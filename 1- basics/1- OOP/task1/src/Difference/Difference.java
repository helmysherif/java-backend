package Difference;

public class Difference {
    private int a;
    private int b;
    private int c;
    private int d;
    Difference(int a , int b , int c , int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public int result(){
        return (a * b) - (c * d);
    }
}
