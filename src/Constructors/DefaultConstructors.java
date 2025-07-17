package Constructors;

public class DefaultConstructors {
    public int add(){
        int a=10;
        int b=20;
        return a+b;
    }
    DefaultConstructors(){
        System.out.println("default constructors");
    }

    public static void main(String[] args) {
        DefaultConstructors ob=new DefaultConstructors();
        System.out.println(ob.add());
    }

}
