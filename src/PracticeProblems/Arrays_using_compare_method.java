package PracticeProblems;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays_using_compare_method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] name=new int[n];
        for(int i=0;i< name.length;i++){
            name[i]=sc.nextInt();
        }
        int n1=sc.nextInt();
        int[] arrays=new int[n];
        for(int i=0;i< arrays.length;i++){
            arrays[i]=sc.nextInt();
        }
        int result=Arrays.compare(name,arrays);
        if(result==0){
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }
    }
}
