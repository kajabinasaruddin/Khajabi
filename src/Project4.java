public class Project4 extends Project3{
    public int add(int a,int b){
        return a*b;
    }

    public static void main(Project5[] args) {
        Project3 obj1=new Project3();
        Project4 obj2=new Project4();
        Project3 obj=new Project4();
        System.out.println(obj.add(10,20));
       // System.out.println(obj2.hello());
    }
}