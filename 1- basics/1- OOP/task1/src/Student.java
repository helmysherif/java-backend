public class Student {
    int id;
    String name;
    int age;
    Student(int id , String name , int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public void print(){
        System.out.println("name = " + name + " and id = " + id + " and age = " + age);
    }
}
