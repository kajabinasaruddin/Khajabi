package PracticeProblems;

import java.util.Scanner;

public class Maximum_Element_of_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] name=new int[n];
        int max=name[0];
        for(int i=0;i< name.length;i++){
            name[i]=sc.nextInt();
            if(name[i]>max){
                max=name[i];
            }
        }
        System.out.println(max);
    }
}
