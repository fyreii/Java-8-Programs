// Created by:  Teresa Henderson
// Date: 07/20/2016
// Class:  CST 200: Core Data Structures with OOP, Bansal
// File:  Henderson_A04_Q1.java
// Purpose:  Throws exception when incorrect number is entered

import java.util.*;

public class Henderson_A04_Q1 {
    public static void main(String[] args) {
        // set variables to use
        String answer;
        int num_doubles = 0;
        double store = 0;
        // instantiate Scanner
        Scanner input = new Scanner(System.in);
        // while loop restricted by doubles counter
        while (num_doubles < 5) {
            // try assumes everything will run perfectly
            try {
                // get input as String
                System.out.print("Please enter a number: ");
                answer = input.nextLine();
                // convert String input to a double
                double convert = Double.parseDouble(answer);
                // keeps a running total
                store += convert;
                // increment number of doubles counter by one
                num_doubles++;
              // catch the NumberFormatException if the input is wrong
            } catch (NumberFormatException e) {
                // print an error message and continue
                System.out.println("Please enter a valid number!");
            }
        }
        // when all 5 valid values are entered, exit the loop and print the average
        System.out.printf("The average is %4f", store / 5 );
    }
}

/* OUTPUT

Please enter a number: 5
Please enter a number: 5.5
Please enter a number: number
Please enter a valid number!
Please enter a number: '1
Please enter a valid number!
Please enter a number: 2
Please enter a number: 3.44565
Please enter a number: 1
The average is 3.38913

 */
