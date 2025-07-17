package Methods;

public class MethodsInputParameters {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
//method overloading

    public static void main(String[] args) {
        MethodsInputParameters obj=new MethodsInputParameters();
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(10,20,30));
    }
}
