// Created by:  Teresa Henderson
// Date: 7/1/2016
// Class:  CST 200: Core Data Structures with OOP, Bansal
// File:  Henderson_A02_Q5.java
// Purpose: Number Guessing Game

import java.util.*;

public class Henderson_A02_Q5 {

    public static void main(String[] args) {
        // call the letsPlay method with a boolean argument
        letsPlay(true);

    }

    // this method is private which means it is not
    // usable outside this *.java file
    private static void letsPlay(boolean running) {

        // all the normal housekeeping - setting variables
        // instantiating Scanner for input, etc.
        int guess;
        int answer = (int) (Math.random() * 100) + 1;
        int tries = 1;

        String getGuess;
        String quitGame = "0";

        Scanner scan = new Scanner(System.in);

        System.out.print("\n# Welcome to the Numbers Guessing Game! #");
        System.out.print("** Version 2.0 - Now with Java! **\n");

        System.out.print("Enter a number between 1 and 100 (0 to exit): ");
        getGuess = scan.nextLine();

        // if the user enters the guardian value, the game halts
        // playAgain method is called to ask if the user wants
        // to play another game
        if (getGuess.equalsIgnoreCase(quitGame)) {
            System.out.print("You chose to quit the game!\n");
            playAgain();
        }

        while (running) {
            // converts the String getGuess to an int for calculation
            guess = Integer.parseInt(getGuess);

            // logic to match the entered guesses to the randomly generated answer
            if (guess < answer) {
                tries++;
                System.out.print("Too low, guess again: ");
                getGuess = scan.nextLine();
            } else if (guess > answer) {
                tries++;
                System.out.print("Too high, guess again: ");
                getGuess = scan.nextLine();
            } else {
                System.out.print("Your answer is correct! " + answer + "\nNumber of guesses was: " + tries + ".\n");
                // when the game ends, running is set to false to halt the game
                running = false;
                // the method playAgain is called to ask the user if they
                // want to play another game
                playAgain();
            }

        }
    }

    // this method asks the user if they wish to play
    // another game
    private static void playAgain() {

        String again;
        Scanner scan = new Scanner(System.in);

        System.out.print("Would you like to play again (y/n)? ");
        again = scan.nextLine();

        // if the user enters yes, it calls
        // the playGame method again and sets it to run
        if (again.equalsIgnoreCase("y")) {
            letsPlay(true);
        } else {
            System.out.print("Thanks for playing!");
            System.exit(0);
        }
    }

}

/**

 OUTPUT

 Run 1: User chooses exit

 # Welcome to the Numbers Guessing Game! #
 ** Version 2.0 - now with Java! **

 Enter a number between 1 and 100 (0 to exit): 0
 You chose to quit the game!

 Would you like to play again (y/n)? n

 Run 2: User wins game and plays again

 # Welcome to the Numbers Guessing Game! #
 ** Version 2.0 now with Java! **

 Enter a number between 1 and 100 (0 to exit): 12
 Your answer is correct! 12
 Number of guesses was: 1.

 Would you like to play again(y/n)? y

 # Welcome to the Numbers Guessing Game! #
 ** Version 2.0 now with Java! **

 Enter a number between 1 and 100 (0 to exit): 12
 Too low, guess again: 45
 Too low, guess again: 67
 Too high, guess again: 50
 Too high, guess again: 49
 Your answer is correct! 49
 Number of guesses was: 5.

 Would you like to play again (y/n)? n
 Thanks for playing!

 **/