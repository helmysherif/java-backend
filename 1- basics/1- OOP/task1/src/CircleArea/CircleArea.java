package CircleArea;

public class CircleArea {
    private int radius;
    CircleArea(int r){
        radius = r;
    }
    public double calculateArea(){
        double PI = 3.141592653;
        return PI * (radius * radius);
    }
}
