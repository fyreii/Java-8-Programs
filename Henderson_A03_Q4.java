// Created by:  Teresa Henderson
// Date: 07/14/2016
// Class:  CST 200: Core Data Structures with OOP, Bansal
// File:  Henderson_A03_Q4.java
// Purpose:  Implement three classes, RoundShape, Sphere and Cone

public class Henderson_A03_Q4
{
    // RoundShape class that is extended by Cone and Sphere
    public static class RoundShape
    {
        private double radius;
        // allows calls RoundShape without a value
        public RoundShape() {}
        // allows calls to RoundShapes providing a radius
        public RoundShape(double r) {
            this.setRadius(r);
        }
        // setter for radius
        public void setRadius(double r) {
            this.radius = r;
        }
        // getter for radius
        public double getRadius() {
            return this.radius;
        }
    }
    // Sphere is a subset of RoundShape
    public static class Sphere extends RoundShape
    {
        // allows Sphere to be called without a value
        public Sphere() {}
        // allows Sphere to be called with a radius
        public Sphere(double r) {
            this.setRadius(r);
        }
        // getter for Sphere volume
        public double getVolume() {
            double getSphereVolume = 4 * Math.PI * (Math.pow(this.getRadius(), 3) / 3);
            return getSphereVolume;
        }
        // getter for Sphere area
        public double getArea() {
            double getSphereArea = 4 * Math.pow(this.getRadius(), 2) * Math.PI;
            return getSphereArea;
        }
        // toString for Sphere
        public String toString() {
            String shape = "Sphere";
            String shapeString = "The shape is a: " + shape;
            String radiusString = "The radius is: " + getRadius();
            String areaString = "The area is: " + String.format("%.2f%n", getArea());
            String volumeString = "The volume is: " + String.format("%.2f%n",getVolume());
            return  shapeString + "\n" + radiusString + "\n" + areaString + "\n" + volumeString;
        }

    }
    // Cone class is a subclass of RoundShape
    public static class Cone extends RoundShape
    {
        // allows Cone to be called without a value
        public Cone() {}
        // allows Cone to be called with a radius
        public Cone(double r, double h) {
            this.setRadius(r);
            this.setHeight(h);
        }
        private double height;
        // getter for Cone volume
        public double getVolume() {
            double getConeVolume = Math.PI * Math.pow(this.getRadius(), 2) * this.getHeight();
            return getConeVolume;
        }
        // getter for Cone area
        public double getArea() {
            double getConeArea = (2 * Math.PI * this.getRadius() * this.getHeight()) + (2 * Math.PI * Math.pow(this.getRadius(), 2));
            return getConeArea;
        }
        // setter for height
        public void setHeight(double h) {
            this.height = h;
        }
        // getter for height
        public double getHeight() {
            return this.height;
        }
        // toString for Cone
        public String toString() {
            String shape = "Cone";
            String shapeString = "The shape is a: " + shape;
            String radiusString = "The radius is: " + getRadius();
            String heightString = "The height is: " + getHeight();
            String areaString = "The area is: " + String.format("%.2f%n", getArea());
            String volumeString = "The volume is: " + String.format("%.2f%n",getVolume());
            return  shapeString + "\n" + radiusString + "\n" + heightString + "\n" + areaString + "\n" + volumeString;
        }
    }
    public static void main(String[] args)
    {
        // instantiate two new Cones and two new Spheres
        Cone cone1 = new Cone(5,5);
        Cone cone2 = new Cone(10,10);
        Sphere sphere1 = new Sphere(6);
        Sphere sphere2 = new Sphere(11);
        // output of first set of values
        System.out.println("First Run:");
        System.out.println("-----------------");
        System.out.println(cone1);
        System.out.println("-----------------");
        System.out.println(cone2);
        System.out.println("-----------------");
        System.out.println("-----------------");
        System.out.println(sphere1);
        System.out.println("-----------------");
        System.out.println(sphere2);
        System.out.println("-----------------");
        // instantiate two more Cones and two more Spheres
        Cone cone3 = new Cone(10,5);
        Cone cone4 = new Cone(10,5);
        Sphere sphere3 = new Sphere(9);
        Sphere sphere4 = new Sphere(20);
        // output of second set of values
        System.out.println("Second Run:");
        System.out.println("-----------------");
        System.out.println(cone3);
        System.out.println("-----------------");
        System.out.println(cone4);
        System.out.println("-----------------");
        System.out.println("-----------------");
        System.out.println(sphere3);
        System.out.println("-----------------");
        System.out.println(sphere4);
        System.out.println("-----------------");
    }
}

/** OUTPUT

 First Run:
 -----------------
 The shape is a: Cone
 The radius is: 5.0
 The height is: 5.0
 The area is: 314.16

 The volume is: 392.70

 -----------------
 The shape is a: Cone
 The radius is: 10.0
 The height is: 10.0
 The area is: 1256.64

 The volume is: 3141.59

 -----------------
 -----------------
 The shape is a: Sphere
 The radius is: 6.0
 The area is: 452.39

 The volume is: 904.78

 -----------------
 The shape is a: Sphere
 The radius is: 11.0
 The area is: 1520.53

 The volume is: 5575.28

 -----------------
 Second Run:
 -----------------
 The shape is a: Cone
 The radius is: 10.0
 The height is: 5.0
 The area is: 942.48

 The volume is: 1570.80

 -----------------
 The shape is a: Cone
 The radius is: 10.0
 The height is: 5.0
 The area is: 942.48

 The volume is: 1570.80

 -----------------
 -----------------
 The shape is a: Sphere
 The radius is: 9.0
 The area is: 1017.88

 The volume is: 3053.63

 -----------------
 The shape is a: Sphere
 The radius is: 20.0
 The area is: 5026.55

 The volume is: 33510.32

 -----------------

 **/