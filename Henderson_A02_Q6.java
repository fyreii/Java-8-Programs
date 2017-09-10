// Created by:  Teresa Henderson
// Date:  07/08/2016
// Class:  CST 200: Core Data Structures with OOP, Bansal
// File:  Henderson_A02_Q6.java
// Purpose:  Write a program that prints the pattern on assignment page

public class Henderson_A02_Q6 {
    public static void main(String[] args) {
        // sets the max number of rows via Stars example in book
        final int MAX_ROWS = 10;

        // this section creates the top half of the diamond

        // loop 1: for each row starting at one
        // as long as the # of rows is less than the max
        // increment rows by 2
        for (int rows = 1; rows < MAX_ROWS; rows += 2) {
            // loop 2: for each space starting at zero
            // as long as # of spaces is less than the max - 1
            // 1 the current number of rows divided by 2 (because
            // we increment by 2 in the first loop)
            // increment spaces by 1
            for (int spaces = 0; spaces < MAX_ROWS - 1 - rows / 2; spaces++)
                System.out.print(" ");
            // loop 3: for spaces starting at 0, as long as spaces
            // are less than the current # of rows, increment spaces by 1
            // print a star
            for (int spaces = 0; spaces < rows; spaces++)
                System.out.print("*");
            // after each row, tack on a newline at the
            // end of each row so the next line of
            // stars starts on the next line down
            System.out.print("\n");
        }

        // this section creates the bottom half of the diamond

        // loop 4: start a new row loop for the bottom half
        // starting at the 7th row, as long as the current # of rows isn't 0
        // de-increment rows by 2
        for (int rows = 7; rows > 0; rows -= 2) {
            // loop 5: this loop remains the same as the top because
            // we are performing the same function as above
            // the reversal is being caused by the de-increment
            for (int spaces = 0; spaces < MAX_ROWS - 1 - rows / 2; spaces++)
                System.out.print(" ");
            // loop 6: this loop remains the same as the top because
            // we are performing the same function as above
            // the reversal is being caused by the de-increment
            for (int spaces = 0; spaces < rows; spaces++)
                System.out.print("*");
            // as above, so below
            System.out.print("\n");
        }
    }
}

/**

 OUTPUT

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *


 **/