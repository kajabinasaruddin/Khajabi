package StringMethods;
public class SplitMethod {
    public static void main(String[] args) {
        //split()
        //  split() is used to split string into words based on delimeters
        String name="khajabi_jagadesh_alice";
        String[] result=name.split("_");
        for(int i=0;i< result.length;i++){
            System.out.println(result[i]);
        }
    }
}