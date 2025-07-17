package Constructors;
public class Hello {
    int age;
    String name;
    String  loc;
    Hello(int age,String name,String loc){
        this.name=name;
        this.age=age;
        this.loc=loc;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getLoc() {
        return loc;
    }

    public static void main(String[] args) {
        Hello obj=new Hello(20,"khajabi","hyd");
        System.out.println(obj.getAge());
        System.out.println(obj.getLoc());
        System.out.println(obj.getName());
    }
}
