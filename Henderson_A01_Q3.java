// Created by: Teresa Henderson
// Date:  7/1/2016
// Class:  CST 200: Core Data Structures with OOP, Bansal
// File:  Henderson_A01_Q3.java
// Purpose:  Calculates total number of seconds for time entered as HH:MM:SS

import java.util.Scanner;

public class Henderson_A01_Q3 {

    public static void main (String[] args)
    {
    // Declare variables for use in program
    int hours;
    int minutes;
    int seconds;
    int totalSeconds;

    Scanner input = new Scanner(System.in);
    // Ask user for hours input - take input as Int
    System.out.println("Enter number of hours: ");
    hours = input.nextInt();
    // Ask user for minutes input - take input as Int
    System.out.println("Enter the number of minutes: ");
    minutes = input.nextInt();
    // Ask user for seconds input - take input as Int
    System.out.println("Enter the number of seconds: ");
    seconds = input.nextInt();
    // Calculate totalSeconds using standard formula
    totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
    // Output the entered values in standard format as well as converted value in seconds
    System.out.println("The entered time is: " + hours + ":" + minutes + ":" + seconds);
    System.out.println("The total time in seconds is: " + totalSeconds);
    }
}

/**

 OUTPUT

 Enter number of hours:
 1
 Enter the number of minutes:
 28
 Enter the number of seconds:
 42
 The entered time is: 1:28:42
 The total time in seconds is: 5322

 Process finished with exit code 0

 **/

