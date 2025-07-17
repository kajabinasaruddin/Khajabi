package TryCatchMethod;

import java.util.Scanner;

public class SpecialCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        try {
            char ch = name.charAt(0);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                System.out.println("OK: The first character is a letter.");
            } else {
                throw new Exception("Special character detected!");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
