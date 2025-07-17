package Arrays;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []n={9,3,7,6,5};
        int target=9;
        for(int i=0;i< n.length-1;i++){
            for(int j=i+1; j < n.length ;j++){
                if(n[i]+n[j] == target){
                    System.out.println(i + " " +j);
                }
            }
        }
    }
}
