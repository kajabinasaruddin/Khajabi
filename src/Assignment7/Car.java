package Assignment7;

public class Car extends Vechile{
    //Write a Java program to create a class called Vehicle with a method called drive().
    // Create a subclass called Car that overrides the drive() method to print "Repairing a car".

    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }

    public static void main(String[] args) {
        Car obj=new Car();
        obj.drive();
    }
}
