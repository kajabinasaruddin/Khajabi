package WorkShop;
import java.util.Scanner;
public class ArraysExmples
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter:");
        int s=sc.nextInt();
        int[] array=new int[s];
        for(int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
            System.out.println(array[i]);
        }
    }
}