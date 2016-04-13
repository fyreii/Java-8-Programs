package Ch5;

/**
*
* @author Teresa Henderson 03/02/2013
*/

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ch5 {

    public static void main(String args[]) {
        // Ch5 (Java) Assignment - Guessing Game

        int guess;
        int answer = (int) (Math.random() * 100) + 1;
        int tries = 1;
        boolean running = true;

        String quitGame = "x";
        String getGuess;

        getGuess = JOptionPane.showInputDialog("Enter a number between 1 and 100: \nType 'x' to quit the game.");

        while (running) {
            if (getGuess.equalsIgnoreCase(quitGame)) {
                break; //stop execution if 'x' is used
            }

            guess = Integer.parseInt(getGuess);

            if (guess < answer) {
                tries++;
                getGuess = JOptionPane.showInputDialog("Too low, guess again: ");
            } else if (guess > answer) {
                tries++;
                getGuess = JOptionPane.showInputDialog("Too high, guess again: ");
            } else {

                JFrame frame = new JFrame("Program Output");
                JOptionPane.showMessageDialog(frame, "Your answer is correct! " + answer + "\nNumber of guesses was: " + tries);
                running = !running;
            }
        }
        System.exit(0); //final exit
    }
}
