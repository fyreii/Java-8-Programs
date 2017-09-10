// Created by:  Teresa Henderson
// Date: 07/12/2016
// Class:  CST 200: Core Data Structures with OOP, Bansal
// File:  Henderson_A03_Q1.java
// Purpose:  Print calculations for a Cylinder object

public class Henderson_A03_Q1 {

    public static void main(String[] args) {
        // instantiate first set of new Cylinder objects
        Cylinder cyl = new Cylinder(5,4);
        Cylinder cyl2 = new Cylinder(7,8);
        Cylinder cyl3 = new Cylinder(2,3);
        Cylinder cyl4 = new Cylinder(6,10);
        // print output
        System.out.println("First Run:");
        System.out.println("-----------------");
        System.out.println(cyl);
        System.out.println("-----------------");
        System.out.println(cyl2);
        System.out.println("-----------------");
        System.out.println(cyl3);
        System.out.println("-----------------");
        System.out.println(cyl4);
        System.out.println("-----------------");
        // instantiate second set of new Cylinder objects
        Cylinder cyl5 = new Cylinder(10,4);
        Cylinder cyl6 = new Cylinder(10,8);
        Cylinder cyl7 = new Cylinder(10,3);
        Cylinder cyl8 = new Cylinder(10,10);
        // print the output
        System.out.println("Second Run:");
        System.out.println("-----------------");
        System.out.println(cyl5);
        System.out.println("-----------------");
        System.out.println(cyl6);
        System.out.println("-----------------");
        System.out.println(cyl7);
        System.out.println("-----------------");
        System.out.println(cyl8);
        System.out.println("-----------------");
    }
}
// nested Cylinder class
class Cylinder {

    double s_area, radius, height, volume;
    // pull radius and height from the current method
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    // method for getArea()
    public double getArea() {
        s_area = (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
        return s_area;
    }
    // method for getVolume()
    public double getVolume() {
        volume = Math.PI * Math.pow(radius, 2) * height;
        return volume;
    }
    // getter method
    public double getRadius() {
        return radius;
    }
    // getter method
    public double getHeight() {
        return height;
    }
    // setter method
    public void setHeight(double h) {
        height = h;
    }
    // setter method
    public void setRadius(double r) {
        radius = r;
    }
    // toString method that produces the output for each Cylinder object
    public String toString() {
        String shape = "Cylinder";
        String shapeString = "The shape is a: " + shape;
        String radiusString = "The radius is: " + getRadius();
        String heightString = "The height is: " + getHeight();
        String s_areaString = "The surface area is: " + String.format("%.2f%n", getArea());
        String volumeString = "The volume is: " + String.format("%.2f%n",getVolume());
        return  shapeString + "\n" + radiusString + "\n" + heightString + "\n" + s_areaString + "\n" + volumeString;
        }
    }

/** OUTPUT

 First Run:
 -----------------
 The shape is a: Cylinder
 The radius is: 5.0
 The height is: 4.0
 The surface area is: 282.74
 The volume is: 314.15
 -----------------
 The shape is a: Cylinder
 The radius is: 7.0
 The height is: 8.0
 The surface area is: 659.73
 The volume is: 1231.50
 -----------------
 The shape is a: Cylinder
 The radius is: 2.0
 The height is: 3.0
 The surface area is: 62.83
 The volume is: 37.69
 -----------------
 The shape is a: Cylinder
 The radius is: 6.0
 The height is: 10.0
 The surface area is: 603.18
 The volume is: 1130.97
 -----------------
 Second Run:
 -----------------
 The shape is a: Cylinder
 The radius is: 10.0
 The height is: 4.0
 The surface area is: 879.64
 The volume is: 1256.63
 -----------------
 The shape is a: Cylinder
 The radius is: 10.0
 The height is: 8.0
 The surface area is: 1130.97
 The volume is: 2513.27
 -----------------
 The shape is a: Cylinder
 The radius is: 10.0
 The height is: 3.0
 The surface area is: 816.81
 The volume is: 942.47
 -----------------
 The shape is a: Cylinder
 The radius is: 10.0
 The height is: 10.0
 The surface area is: 1256.63
 The volume is: 3141.59
 -----------------
 **/