// Created by:  Teresa Henderson
// Date: 07/06/2016
// Class:  CST 200: Core Data Structures with OOP, Bansal
// File:  Henderson_A02_Q2.java
// Purpose:  Calculate area of triangle given lengths of sides
// via formula:  Area = sqrt (s(s - a)(s - b)(s - c))

import java.util.Scanner;

public class Henderson_A02_Q2 {
    public static void main(String[] args) {

    // set appropriate variables (based on assignment example)
    double s, a, b, c, area, calc_area, calc_s;

    // instantiate new Scanner object
    Scanner scan = new Scanner(System.in);

    // Get each value as a double
    System.out.print("Enter the value of a: ");
    a = scan.nextDouble();
    System.out.print("Enter the value of b: ");
    b = scan.nextDouble();
    System.out.print("Enter the value of c: ");
    c = scan.nextDouble();

    // calculate value of s for use in formula
    calc_s = (a + b + c)/2;
    // calculate area given s
    calc_area = (calc_s * (calc_s - a)*(calc_s - b)*(calc_s - c));
    area = Math.sqrt(calc_area);

    // Print the result to 3 decimal places
    System.out.printf("The area is: %.3f%n", area);

    }
}

/**
 OUTPUT

 Enter the value of a: 4
 Enter the value of b: 13
 Enter the value of c: 15
 The area is: 24.000

 **/
