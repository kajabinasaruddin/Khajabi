package TryCatchMethod;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args){
        int x=10;
        int y=0;
        int z;
        try{
            z=x/y; //Divide by Zero
            System.out.println(z);
        }
        catch (ArithmeticException e){
            System.out.println("division by zero exception");
        }
        System.out.println("program over");
    }
}
