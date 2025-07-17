import java.util.Scanner;
public class Dec_bin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int bin=0;
        int place=1;
        int count=0;
        while(n>0){
            int digit=n%2;
            bin+=digit*place;
            place*=10;
            n/=2;

        if(digit==1){
           count++;
        }}

        System.out.println(count);
    }
}
