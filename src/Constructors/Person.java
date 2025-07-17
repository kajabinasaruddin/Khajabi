package Constructors;

public class Person {
    int pid;    //instance variables
    String pname;
    String loc;
    public Person(int pid,String pname,String loc){
        this.pid=pid;
        this.pname=pname;
        this.loc=loc;
    }
    public void disp(){
        System.out.println(this.pid + "-"+this.pname+"-"+this.loc);

    }

public static void main(String[] args) {
    Person p1=new Person(10,"babu","hyd");
    p1.disp();
    Person p2=new Person(10,"babu","hyd");
    p2.disp();
}
}
