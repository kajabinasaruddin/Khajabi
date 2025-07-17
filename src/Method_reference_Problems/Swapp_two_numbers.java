package Method_reference_Problems;

import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Swapp_two_numbers {
    public void Hello(Integer a , Integer b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();;
        int b=sc.nextInt();
        BiConsumer<Integer,Integer> bi=new Swapp_two_numbers()::Hello;
        bi.accept(a,b);
    }
}
