package Constructors;
public class DefaultParameters {
    public int age;
    public String name;

    public void setAge(int age) {
        this.age = age;
    }

    DefaultParameters( ){
        this.age=age;
        this.name=name;
    }

    public static void main(String[] args) {
        DefaultParameters obj=new DefaultParameters();
        System.out.println(obj.age);
        System.out.println(obj.name);
    }
}
