package WorkShop;

import javax.swing.tree.VariableHeightLayoutCache;

public class Variable {
    int a=10;
    float f=10.0f;
    String name="khajabi";
    double d=12.3d;
    char ch='A';
    public static void main(String[] args) {
        Variable obj=new Variable();
        System.out.println(obj.a);
        System.out.println(obj.f);
        System.out.println(obj.name);
        System.out.println(obj.d);
        System.out.println(obj.ch);
    }
}
