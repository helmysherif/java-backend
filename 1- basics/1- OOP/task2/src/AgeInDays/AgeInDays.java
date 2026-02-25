package AgeInDays;
public class AgeInDays {
    int age;
    AgeInDays(int age){
        this.age = age;
    }
    public void calculateAgeInDays(){
        int years  = age / 365;
        int remainingDays = age % 365;
        int months = remainingDays / 30;
        int days = remainingDays % 30;
        System.out.println("years = " + years);
        System.out.println("months = " + months);
        System.out.println("days = " + days);
    }
}
