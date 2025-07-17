package Assignment5;
import java.util.Scanner;
public class MissingNumber {
    public static int missing(int[] array,int n){
        int sum=(n*(n+1))/2;
        for(int i=0;i< array.length;i++){
            sum=sum-array[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []array=new int[n-1];
        for(int i=0;i<n-1;i++){
            array[i]=sc.nextInt();
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("Missing numbers:" +missing(array,n));
    }
}
