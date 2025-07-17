import java.util.Scanner;

public class MoveZerosToEnd
{
        public static void main(Project5[] args)
        {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] array=new int[n];
            int count=0;
            for(int i=0;i<n;i++) {
                array[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++) {
                if(array[i] != 0) {
                    array[count]=array[i];
                    count++;}}
            for(int i=count;i<n;i++) {
                array[i]=0;}
            for(int i=0;i<n;i++)
            {
                System.out.print(array[i]+" ");
            }
        }
}
