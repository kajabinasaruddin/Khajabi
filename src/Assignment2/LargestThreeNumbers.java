package Assignment2;

public class LargestThreeNumbers {
    public static void main(String[] args) {
        int a = 70;
        int b= 70;
        int c= 80;
        if(a>b && a>c){
            System.out.println("Largest number is a");
        }
        else if(b>c && b>a){
            System.out.println("Largest number is b");
        }
        else if(c>a && c>b){
            System.out.println("largest number is c");
        }
        else{
            System.out.println("two numbers are equal");
        }
    }
}