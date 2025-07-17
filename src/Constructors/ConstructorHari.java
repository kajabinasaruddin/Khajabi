package Constructors;

public class ConstructorHari {
    private String name;
    private String name2;
    private int age;

    public String getName() {
        return name;
    }

    public String getName2() {
        return name2;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ConstructorHari(String name, String name2, int age) {
        this.name = name;
        this.name2 = name2;
        this.age = age;
    }
    public static void main(String [] args){
        ConstructorHari obj=new ConstructorHari("James","Calefornia",23);
        System.out.println(obj.getAge());
        System.out.println(obj.getName2());
        System.out.println(obj.getName());
    }
}
