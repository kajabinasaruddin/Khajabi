import java.util.Arrays;
import java.util.Scanner;
public class Plus_One_LeetCode {
    public static void main(Project5[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
        }
        int num= array.length;
        for(int i=num-1;i>=0;i--){
            if(array[i]<9){
                array[i]++;
                System.out.println(Arrays.toString(array));
                return ;
            }
            array[i]=0;
        }
        int[] arrays=new int[num+1];
        arrays[0]=1;
        System.out.println(Arrays.toString(arrays));
    }
}
