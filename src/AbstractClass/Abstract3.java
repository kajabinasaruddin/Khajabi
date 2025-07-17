package AbstractClass;

public class Abstract3 implements Abstract{
    @Override
    public int add()
    {
        int a=10;
        int b=20;
        return a+b;
    }
    @Override
    public int sub()
    {
        int c=10;
        int  d=20;
        return c-d;
    }

    public static void main(String[] args) {
        Abstract3 obj=new Abstract3();
        System.out.println(obj.add());
        System.out.println(obj.sub());
    }
}
