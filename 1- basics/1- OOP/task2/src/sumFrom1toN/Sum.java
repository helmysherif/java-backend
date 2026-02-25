package sumFrom1toN;
public class Sum {
    private int number;
    public void setNumber(int number){
        this.number = number;
    }
    public int SumFrom1toNumber(){
        int sum = 0;
        for (int i = 0;i <= number;i++){
            sum += i;
        }
        return sum;
    }
}
