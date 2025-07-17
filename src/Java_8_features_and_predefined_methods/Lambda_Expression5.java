package Java_8_features_and_predefined_methods;

import static java.lang.Integer.sum;

public class Lambda_Expression5 {
    public static void main(String[] args) {
        Functional_interface1 f=(int a,int b) -> System.out.println(a+b);
        int var=sum(10,20);
        System.out.println(var);
    }
}
