import java.util.ArrayList;
import java.util.List;

public class Project {
    public void  printName(Project5 name){
        System.out.println(name);
    }
    public int add() {
        int a = 10;
        return a;
    }
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(Project5[] args) {
        Project obj=new Project();
        // obj.printName("khajabi");
        System.out.println(obj.add());
        System.out.println(obj.add());
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(30,40,40));
        List<Integer>l1=new ArrayList<>();
        l1.add(10);
        l1.add(0,20);
    }
}