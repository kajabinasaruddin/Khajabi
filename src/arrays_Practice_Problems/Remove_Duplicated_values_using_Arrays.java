package arrays_Practice_Problems;

import java.util.Scanner;

public class Remove_Duplicated_values_using_Arrays {
    public int RemoveDuplicatedValues(int[] nums){
        if(nums.length ==0){
            return 0;
        }
       int k=1;
       for(int i=0;i<nums.length;i++){
           if(nums[i]!=nums[i-1]){
               nums[k]=nums[i];
           }
       }
       return k;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Remove_Duplicated_values_using_Arrays obj=new Remove_Duplicated_values_using_Arrays();
        int k=obj.RemoveDuplicatedValues(nums);
        for(int i=0;i<k;i++){
            System.out.println(nums[i]);
        }
    }
}

