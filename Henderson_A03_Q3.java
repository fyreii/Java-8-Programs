// Created by:  Teresa Henderson
// Date: 07/14/2016
// Class:  CST 200: Core Data Structures with OOP, Bansal
// File:  Henderson_A03_Q3.java
// Purpose:  Generates histogram based on entered data

import java.util.Scanner;

public class Henderson_A03_Q3 {

    public static void main(String[] args) {

        //standard output messages to the user
        String warn = "Number entered is below zero or greater than 10.";
        String ask = "Enter value to plot: ";

        //create the storage array and set to zero
        Integer store[] = new Integer[10];
        for(int x = 0; x < 10; x++) {
            store[x] = 0;
        }

        //loop control variable
        boolean cont = true;

        //variables for storing input from the user
        String newValue;
        int newInt;

        //scanner for reading input from user
        Scanner scan = new Scanner(System.in);

        while (cont) {
            //loop while cont is true
            System.out.print(ask);
            newValue = scan.nextLine();
            newInt = Integer.parseInt(newValue);

            //consider the user input and react
            if (newInt == 0) {
                //quit and return the histogram to the user
                printResults(store);
                cont = false;
            } else if (newInt < 0 || newInt > 10) {
                //tell the user they are out of bounds and continue
                System.out.println(warn);
            } else {
                //legal values are iterated for later
                store[newInt-1]++;
            }
        }
    }

    private static void printResults(Integer[] inp) {
        //process the passed array
        for(int x = 0; x < 10; x++) {
            //read through and create the ten lines of output
            System.out.print((x + 1) + " | ");
            //call the histogram function to create a # string
            System.out.println(histogramLine(inp[x]));
            //System.out.println();
        }
    }

    private static String histogramLine(int counter) {
        String output = new String("");
        for(int x = 0; x < counter; x++) {
            //create a # string equal to the passed integer and return it
            output += "#";
        }
        return output;
    }
}

/** OUTPUT

Run 1:

 Enter value to plot: 4
 Enter value to plot: 5
 Enter value to plot: 5
 Enter value to plot: 4
 Enter value to plot: 5
 Enter value to plot: 9
 Enter value to plot: 0
 1 |
 2 |
 3 |
 4 | ##
 5 | ###
 6 |
 7 |
 8 |
 9 | #
 10 |

 Run 2:

 Enter value to plot: 4
 Enter value to plot: 11
 Number entered is below zero or greater than 10.
 Enter value to plot: 3
 Enter value to plot: 5
 Enter value to plot: 4
 Enter value to plot: 4
 Enter value to plot: 4
 Enter value to plot: 6
 Enter value to plot: 11
 Number entered is below zero or greater than 10.
 Enter value to plot: -1
 Number entered is below zero or greater than 10.
 Enter value to plot: 8
 Enter value to plot: 10
 Enter value to plot: 9
 Enter value to plot: 4
 Enter value to plot: 4
 Enter value to plot: 19
 Number entered is below zero or greater than 10.
 Enter value to plot: 4
 Enter value to plot: 0
 1 |
 2 |
 3 | #
 4 | #######
 5 | #
 6 | #
 7 |
 8 | #
 9 | #
 10 | #

 **/
