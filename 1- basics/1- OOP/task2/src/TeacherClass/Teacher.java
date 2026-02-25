package TeacherClass;
public class Teacher {
    private Long id;
    private String name;
    private float age;
    private String phoneNumber;
    private float salary;
    public void setId(Long id){
        if(id > 0){
            this.id = id;
        } else {
            System.out.println("invalid id");
        }
    }
    public Long getId(){
        return id;
    }
    public void setName(String name){
        if (name == null || name.length() < 3 || !name.matches("[a-zA-Z]+")) {
            System.out.println("Name must be at least 3 letters and contain letters only");
        } else {
            this.name = name;
        }
    }
    public String getName(){
        return name;
    }
    public void setAge(float age){
        if(age >= 25 && age <= 60){
            this.age = age;
        } else {
            System.out.println("invalid age");
        }
    }
    public float getAge(){
        return age;
    }
    public void setPhoneNumber(String phoneNumber){
        if(phoneNumber.length() == 13 && phoneNumber.startsWith("+20")){
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("invalid phone number");
        }
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setSalary(float salary){
        if(salary >= 3000){
            this.salary = salary;
        } else {
            System.out.println("salary must be greater than 3000");
        }
    }
    public float getSalary(){
        return salary;
    }
}
