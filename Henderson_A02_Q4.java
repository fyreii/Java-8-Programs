// Created by:  Teresa Henderson
// Date: 07/07/2016
// Class:  CST 200: Core Data Structures with OOP, Bansal
// File:  Henderson_A02_Q4.java
// Purpose:  Display if a year entered is a leap year according to Gregorian calendar

import java.util.*;

public class Henderson_A02_Q4 {
    public static void main(String[] args) {

        int year;
        int startOfCal = 1582;

        // instantiate new Scanner object
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a year to check: ");
        year = scan.nextInt();

        // if the year entered is less than 1582, display
        // error message and exit code 1
        if (year < startOfCal) {
            System.out.print("You have entered an invalid year!");
            System.exit(1);
        }

        // if the year modulus is 0 (logical OR)
        // year modulus 4 is 0 (logical AND)
        // year modulus 100 is (logical NOT) 0 the year is a leap year

        // if any other result is obtained, it is not a leap year
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.print("The year " + year + " is a leap year.");
        } else {
            System.out.print("The year " + year + " is a not leap year.");
        }
    }
}

/**

 OUTPUT

Run 1: Leap Year

 Enter a year to check: 2000
 The year 2000 is a leap year.

Run 2: Not Leap Year

 Enter a year to check: 1999
 The year 1999 is a not leap year.

Run 3: Invalid year

 Enter a year to check: 1580
 You have entered an invalid year!

 **/
