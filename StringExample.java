import java.util.Scanner;
public class StringExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name1=sc.nextLine();
        String name2=sc.nextLine();
        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));
    }
}
