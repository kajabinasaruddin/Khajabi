package WeeklyAssessment;

import java.util.Scanner;

public class ReversseOfstring
{
    public static void main(String[] args) {
//        StringBuilder ob=new StringBuilder("java");
//        System.out.println(ob.reverse());
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        System.out.println("reverse String :"+s1);
        if(s.equalsIgnoreCase(s1))
            System.out.println("palindrome");
        else
            System.out.println("not");

    }
}
