package Assignment7;
public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("meow");
    }
    public static void main(String[] args) {
        Cat obj=new Cat();
        obj.makeSound();
    }
    //1. Write a Java program to create a class called Animal with a method called makeSound().
    // Create a subclass called Cat that overrides the makeSound() method to bark.
}


