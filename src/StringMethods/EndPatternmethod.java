package StringMethods;

public class EndPatternmethod {
    public static void main(String[] args) {
        //endsWith(pattern)
        //	endsWith() will take pattern as i/p and verify given string ends with mentioned pattern or not
        //	suppose given string ends with mentioned pattern then return true else return false
        String name="khajabi";
        System.out.println(name.endsWith("bi"));
        System.out.println(name.endsWith("bhi"));
    }
}