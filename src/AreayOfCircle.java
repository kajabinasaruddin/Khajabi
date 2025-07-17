import java.util.Scanner;

public class AreayOfCircle {
    public static void main(Project5[] args) {
        Scanner sc=new Scanner(System.in);
        double pi=3.14;
        int radius = sc.nextInt();
        int area=(int)(pi*radius*radius);
        System.out.println(area);
    }
}
