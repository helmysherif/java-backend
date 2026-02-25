package PlayerClass;
public class Player {
    private int number;
    private String name;
    public void setNumber(int number){
        if(number > 0){
            this.number = number;
        } else {
            System.out.println("invalid number");
        }
    }
    public int getNumber(){
        return number;
    }
    public void setName(String name){
        if(name.length() > 5){
            this.name = name;
        } else {
            System.out.println("invalid player name");
        }
    }
    public String getName(){
        return name;
    }
}
