package Assignment7;

import java.util.Scanner;

public class Rectangle extends Shape {
   // Write a Java program to create a class called Shape with a method called getArea().
    // Create a subclass called Rectangle that overrides the getArea() method
    // to calculate the area of a rectangle.
    private double length;
    private double breath;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreath() {
        return breath;
    }

    public void setBreath(double breath) {
        this.breath = breath;
    }
    @Override
    public void getArea() {
        System.out.println(length*breath);
    }
    public static void main(String[] args) {
        Rectangle obj=new Rectangle();
        obj.setLength(10);
        obj.setBreath(20);
        obj.getArea();
    }
}
