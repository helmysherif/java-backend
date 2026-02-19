package DigitSum;

public class DigitSum {
    int num1;
    int num2;
    DigitSum(int num1 , int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public int sumDigit(){
        return (num1 % 10) + (num2 % 10);
    }
}
