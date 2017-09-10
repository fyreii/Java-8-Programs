// Created by:  Teresa Henderson
// Date: 07/06/2016
// Class:  CST 200: Core Data Structures with OOP, Bansal
// File:  Henderson_A02_Q1.java
// Purpose: Calculate distance between two points
// via the formula:  Distance = sqrt (x2 - x1)^2 + (y2 - y1)^2

import java.util.Scanner;

public class Henderson_A02_Q1 {
    public static void main(String[] args) {

        // set variables
        double x1, x2, y1, y2, distance, calc;

        // instantiate new Scanner object
        Scanner scan = new Scanner(System.in);

        // Get each value as a double
        System.out.print("Enter the value of x1: ");
        x1 = scan.nextDouble();
        System.out.print("Enter the value of y1: ");
        y1 = scan.nextDouble();
        System.out.print("Enter the value of x2: ");
        x2 = scan.nextDouble();
        System.out.print("Enter the value of y2: ");
        y2 = scan.nextDouble();

        // perform calculation with Math.pow and Math.sqrt
        // ^ in Java is a logical XOR
        calc = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        distance = Math.sqrt(calc);

        // Print the result to 4 decimal places
        System.out.printf("The distance is: %.4f%n", distance);

    }
}

/**
 OUTPUT

 Enter the value of x1: 3.4
 Enter the value of y1: 2.3
 Enter the value of x2: 4.5
 Enter the value of y2: 4.3
 The distance is: 2.2825

 **/