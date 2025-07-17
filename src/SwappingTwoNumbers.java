public class SwappingTwoNumbers {
    public static void main(Project5[] args) {
        int a=10;
        int b=20;
        System.out.println("before swapping: a="+a+",b="+b);
        int c= a+b;
        a=b;
        b=c;
        System.out.println("after swapping: a="+a+",b="+b);
    }
}