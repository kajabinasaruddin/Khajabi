import java.util.Scanner;
public class ArrayExample {
    public static void main(Project5[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
                array[i]=sc.nextInt();
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        for(int i= array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }
}
