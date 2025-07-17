package Assignment4;

import java.util.Scanner;

public class Number
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=2;i<=n;i++){ //loop through number from 2 to n and 1 is not a prime
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
    }
    public static boolean isPrime(int num){ // method to check if number is prime
        if(num <2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i ==0 ){
                return false;
            }

        }
        return true;
    }
}