package Arrays;
import java.util.Scanner;
public class Move_all_zero_at_the_end_of_the_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        int count=0;
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();}
        for(int i=0;i<n;i++){
            if(array[i]!=0){
                array[count]=array[i];
                count++;
            }
        }
        for(int i=count;i<n;i++){
            array[i]=0;
        }
        for(int i=0;i<n;i++){
            System.out.println(array[i]+" ");
        }
    }
}
