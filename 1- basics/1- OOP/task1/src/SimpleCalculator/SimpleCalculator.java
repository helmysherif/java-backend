package SimpleCalculator;
public class SimpleCalculator {
    private int x;
    private int y;
    SimpleCalculator(int x , int y){
        this.x = x;
        this.y = y;
    }
    public String add(){
        int sum = x + y;
        return x + " + " + y + " = " + sum;
    }
    public String subtract(){
        int sub = x - y;
        return x + " - " + y + " = " + sub;
    }
    public String multiply(){
        int mult = x - y;
        return x + " * " + y + " = " + mult;
    }
}
