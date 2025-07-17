package Singleton_Practice;
public class Singleton_Example1 {
    private static Singleton_Example1 obj1;
    private Singleton_Example1(){

    }
    public static Singleton_Example1 getInstance(){
        if(obj1==null){
            obj1=new Singleton_Example1();
        }
        return obj1;
    }
    public static void main(String[] args) {
        Singleton_Example1 obj;
        obj=Singleton_Example1.getInstance();
        System.out.println(obj);
    }
}
