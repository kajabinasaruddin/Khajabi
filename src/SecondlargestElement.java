import java.util.Arrays;
import java.util.Scanner;

public class SecondlargestElement {
    public static void main(Project5[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println(array[array.length-2]);
    }
}
