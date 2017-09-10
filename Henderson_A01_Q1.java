// Created by:  Teresa Henderson
// Date:   7/1/2016
// Class:  CST 200: Core Data Structures with OOP, Bansal
// File:  Henderson_A01_Q1.java
// Purpose:  Debugging a simple Java program

import java.util.Scanner;

public class Henderson_A01_Q1 {
    // Error 1: Nothing can be declared above main, moved into main
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int result;
        // Error 2: Changed NUM to 2 because a value of 1 means result is always 0
        // Error 3: Added missing semicolon at line 15
        int NUM = 2;

        System.out.println("Enter an integer number: ");
        String input = scan.nextLine();
        // Error 4: Converted input String to Int

        result = Integer.parseInt(input) % NUM;
        // Error 5: Removed if else because it is redundant

        if (result != 0) {
            System.out.println("\nNumber " + input + " is odd.");
        } else {
            System.out.println("\nNumber " + input + " is even.");
        }
    }
}

/**

 OUTPUT

 Enter an integer number:
 -3

 Number -3 is odd.

 Enter an integer number:
 0

 Number 0 is even.

 Enter an integer number:
 126

 Number 126 is even.
 Process finished with exit code 0

 **/