package arrays_Practice_Problems;
import java.util.Scanner;
public class Prime_and_non_prime_numbers_in_the_array {
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<= Math.sqrt(num);i++){
            if(num %i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        for(int num:array){
            if(isPrime(num)){
                System.out.println(num+"-prime");
            }
            else{
                System.out.println(num+"- not prime");
            }
        }
    }
}
