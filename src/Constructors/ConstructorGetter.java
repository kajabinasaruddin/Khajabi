package Constructors;

public class ConstructorGetter {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    ConstructorGetter(int age,String name){
        this.age=age;
        this.name=name;
    }

    public static void main(String[] args) {
        ConstructorGetter obj=new ConstructorGetter(10,"khajabi");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
