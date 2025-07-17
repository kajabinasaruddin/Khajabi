package ClassWork;

public class WithoutUsingStaticMwthod {
    //non-static method
    public int subtract(){
        int a=10;
        int b=2;
        return a-b;
    }
    public int add(){
        int a=10;
        int b=2;
        return a+b;
    }
    //pre defined method
    public static void main(String[] args) {
        WithoutUsingStaticMwthod obj=new WithoutUsingStaticMwthod();
        System.out.println(obj.subtract());
        System.out.println(obj.add());
    }
}
//static method means directly call the class
//non-static method means called using the object
// . meaning belongs to
