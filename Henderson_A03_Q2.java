// Created by:  Teresa Henderson
// Date: 07/13/2016
// Class:  CST 200: Core Data Structures with OOP, Bansal
// File:  Henderson_A03_Q2.java
// Purpose: Rewrite of SnakeEyes.java example in book

    /**
     * A class to simulate rolling many dice and finding the ratio of snake eyes.
     *
     * @author Lewis et al., CST200 team.
     */

    public class Henderson_A03_Q2
    {
        //Note: you should not need to change the Die class.
        public static class Die
        {
            private final int MAX = 6;
            private int faceValue;
            // create Die objuect with faceValue of 1
            public Die()
            {
                faceValue = 1;
            }
            // method to roll one Die object
            public int roll()
            {
                faceValue = (int)(Math.random() * MAX) + 1;
                return faceValue;
            }
            // setter for faceValue of Die
            public void setFaceValue(int value)
            {
                if(value > 0 && value <= MAX)
                    faceValue = value;
            }
            // getter for faceValue of Die
            public int getFaceValue()
            {
                return faceValue;
            }
            // toString method returns output as String
            public String toString()
            {
                String result = Integer.toString(faceValue);
                return result;
            }
        }
        // new class Pair of Dice instantiates two Die objects
        public static class PairOfDice
        {
            // instantiate two new Die objects using Die class
            private Die die1 = new Die();
            private Die die2 = new Die();
            // setters for die1 and die 2 face values
            public void setDie_first(int val) { die1.setFaceValue(val); }
            public void setDie_second(int val) { die2.setFaceValue(val); }
            // getters for die face values
            public int getDie_first() {
                return die1.getFaceValue();
            }
            public int getDie_second() {
                return die2.getFaceValue();
            }
            // method to roll the pair of dice
            public void rollPair() {
               die1.roll();
               die2.roll();
            }
            // method to sum the Die values used to determine snake eyes or not
            public int sumDiceValues() {
                return getDie_first() + getDie_second();
            }
        }
        // provided code from assignment
        public static void main(String[] args) {
            final int ROLLS = 500;
            int count = 0;
            // instantiate pair of dice object
            PairOfDice myPair = new PairOfDice();
            // prewritten method to roll the dice and check if values are snakeeyes
            // snake eyes value is if sum of dice is equal to 2
            for(int roll = 1; roll <= ROLLS; roll++)
            {
                myPair.rollPair();
                if(myPair.sumDiceValues() == 2) {
                    count++;
                }
            }
            // output all relevant values
            System.out.println("Number of rolls: " + ROLLS);
            System.out.println("Number of snake eyes: " + count);
            System.out.println("Ratio: " + (double)count / ROLLS);
        }

    }

/**  OUTPUT

 Number of rolls: 500
 Number of snake eyes: 11
 Ratio: 0.022

 Number of rolls: 500
 Number of snake eyes: 7
 Ratio: 0.014

 Number of rolls: 500
 Number of snake eyes: 10
 Ratio: 0.02

 **/