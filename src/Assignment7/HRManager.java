package Assignment7;

public class HRManager extends Employee{
   // Write a Java program to create a class called Employee with methods called work() and getSalary().
    // Create a subclass called HRManager that overrides the work() method and adds a new method
    // called addEmployee().

    @Override
    public void work() {
        System.out.println("Add work");
    }
    public void addEmployee(){
        System.out.println("employees added");
    }

    public static void main(String[] args) {
        HRManager obj=new HRManager();
        obj.work();
        obj.addEmployee();
    }
}
