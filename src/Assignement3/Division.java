package Assignement3;
public class Division {
    // write a method in your class to divide 2 int numbers
    public static int div(int a,int b){
        return a/b;
    }
    public static void main(String[] args) {
        Division obj=new Division();
        System.out.println(obj.div(20,10));
    }
}
