package TryCatchMethod;

import Operators.AirthmaticOperators;

public class ThrowKeyword {
    public static void main(String[] args) {
        try{
            throw new ArithmeticException("this is our own exception");
            //System.out.println("this is try block");
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("program over");
    }
}
