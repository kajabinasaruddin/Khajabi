package Java_8_features_and_predefined_methods;

public class Use_a_lambda_to_reverse_a_string2 {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        Functional_interface2 f=(String input)-> {
            String s ="shaik khajabhi";
            String rev = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                rev += s.charAt(i);
            }
            System.out.println(rev);
        };
        f.reverseString("shaik khajabhi ");
    }
}