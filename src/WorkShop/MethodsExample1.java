package WorkShop;

public class MethodsExample1 extends MethosExamples{
    @Override
    public int add() {
        return super.add();
    }

    @Override
    public int sub() {
        return super.sub();
    }

    @Override
    public int multiply() {
        return super.multiply();
    }

    @Override
    public String concat() {
        return super.concat();
    }

    public static void main(String[] args) {
        MethodsExample1 obj=new MethodsExample1();
        System.out.println(obj.add());
        System.out.println(obj.sub());
        System.out.println(obj.multiply());
        System.out.println(obj.concat());
    }
}
