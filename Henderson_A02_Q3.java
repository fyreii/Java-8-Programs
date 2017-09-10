// Created by:  Teresa Henderson
// Date: 07/07/2016
// Class:  CST 200: Core Data Structures with OOP, Bansal
// File:  Henderson_A02_Q3.java
// Purpose:  Compute and display result of rolling (num)D6 and adding a number

import java.util.*;

public class Henderson_A02_Q3 {
    public static void main(String[] args) {

        // initialize variables for use in main()
        int numDice, numToAdd, counter, faceTotal, rollMe;
        // addRolls is a placeholder for the total of individual rolls
        int addRolls = 0;
        int faceValue = 1;
        int MAXVALUE = 6;

        // instantiate new Scanner object
        Scanner scan = new Scanner(System.in);

        // Ask the user for input and take the input as Integers
        System.out.print("How many dice would you like to roll? ");
        numDice = scan.nextInt();
        System.out.print("What number would you like to add to the total? ");
        numToAdd = scan.nextInt();

        // loop through the number of dice provided
        for (counter = 0; counter < numDice; counter++) {
            // calls the "roll" method 
            rollMe = roll(faceValue, MAXVALUE);
            // totals the rolled values to a placeholder variable
            addRolls += rollMe;
        }
        // add the number given by the user to the total of the rolls
        faceTotal = addRolls + numToAdd;
        // print result of total rolls + number to add
        System.out.println("The result of rolling " + numDice + "D6 is " + faceTotal + ".");
    }

    // method to roll the dice
    private static int roll(int faceValue, int MAXVALUE) {
        faceValue = (int) (Math.random() * MAXVALUE) + 1;
        // return the generated face value for use above
        return faceValue;
    }
}


/**

 OUTPUT

 How many dice would you like to roll?  3
 What number would you like to add to the total? 2
 The result of rolling 3D6 is 13.

 **/