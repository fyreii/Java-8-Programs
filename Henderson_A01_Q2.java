// Created by: Teresa Henderson
// Date:  7/1/2016
// Class:  CST 200: Core Data Structures with OOP, Bansal
// File:  Henderson_A01_Q2.java
// Purpose:  Calculates entered temperature in Fahrenheit to Kelvin

import java.util.Scanner;

public class Henderson_A01_Q2 {

//-----------------------------------------------------------------
//  Computes the Kelvin equivalent of a specific Fahrenheit
//  value using the formula K = 5/9(F - 32) + 273
//-----------------------------------------------------------------

        public static void main (String[] args)
        {
            // Take input from user to get temp in Fahrenheit
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter temperature in Fahrenheit: ");
            String fahrenheitString = scan.nextLine();
            // Carry over conversion factor constant from Q1
            double CONVERSION_FACTOR = 9.0 / 5.0;
            // Convert fahrenheit String to Int for use in calculation
            double fahrenheitTemp = Double.parseDouble(fahrenheitString);
            // Calculate equivalent in Kelvin
            double in_Kelvin = CONVERSION_FACTOR * (fahrenheitTemp - 32) + 273;
            // Output results
            System.out.println ("Kelvin Equivalent: " + in_Kelvin);
        }
}

/**

 OUTPUT

 Enter temperature in Fahrenheit:
 32
 Kelvin Equivalent: 273.0

 Process finished with exit code 0


 **/