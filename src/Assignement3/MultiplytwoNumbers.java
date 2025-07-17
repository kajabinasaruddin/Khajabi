package Assignement3;
public class MultiplytwoNumbers
{
    //Write a method in your class to multiply 2 int type numbers
    public  int multiply(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        MultiplytwoNumbers obj=new MultiplytwoNumbers();
        System.out.println(obj.multiply(10,20));
    }
}
