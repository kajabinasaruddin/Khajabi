package Singleton_Practice;
public class Singleton_Example2 {
    public void animal(){
        System.out.println("alice");
    }
    //private Singleton_Example2(){}
    public static class SingletonExample{
        private static Singleton_Example2 obj=null;
        private SingletonExample(){
        }
        public static Singleton_Example2 getInstance(){
            if(null== obj){
                obj=new Singleton_Example2();
            }
            return obj;
        }
    }
    public static void main(String[] args) {
        Singleton_Example2 obj=SingletonExample.getInstance();
        obj.animal();
    }
}