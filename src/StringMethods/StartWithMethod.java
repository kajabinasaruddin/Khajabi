package StringMethods;
public class StartWithMethod {
    public static void main(String[] args) {
        String name="khajabi";
        //startsWith(pattern)
        //	startsWith() will take pattern as i/p and verify given string starts with mentioned pattern or not
        //	suppose given string starts with mentioned pattern then return true else return false
        System.out.println(name.startsWith("kha"));
        System.out.println(name.startsWith("bob"));
    }
}
