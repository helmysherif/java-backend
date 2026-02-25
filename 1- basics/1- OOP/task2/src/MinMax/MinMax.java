package MinMax;
public class MinMax {
    int[] numbers;
    public void setNumbers(int[] numbers){
        this.numbers = numbers;
    }
    public int getMinimum() {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
    public int getMaximum() {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}
