package calculator;
public class Calculator {
    int number1;
    int number2;
    Calculator(int number1 , int number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    public int add(){
        return number2 + number1;
    }
    public int subtract(){
        return number1 - number2;
    }
    public int multiply(){
        return number1 * number2;
    }
    public double divide(){
        if(number2 == 0){
            System.out.println("you cannot divide by zero");
            return -1;
        } else {
            return (double) number1 / number2;
        }
    }
}
