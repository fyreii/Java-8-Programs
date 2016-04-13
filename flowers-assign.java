package Flowers;

// Flowers.java - This program reads names of flowers and whether they are grown in shade or sun from an input
// file and prints the information to the user's screen.
// Input:  flowers.dat.
// Output: Names of flowers and the words sun or shade.

// Author: Teresa Henderson 3/17/2013

import java.io.*;  // Import class for file input.

public class Flowers
{
     public static void main(String args[]) throws Exception
     {
          // Declare variables here
            String flowerName, prefersEnv;
         
               // Open input file - the example in the book leaves out the fact
               // the path name MUST BE ESCAPED.  Input file assumed to be in C: to
              // make refrences easier.
           
            FileReader fr = new FileReader(
     "C:\\flowers.dat");
       
            // try-with-resources is apparently the Java 7 JDK preferred way to
            // auto-close an open file. It was recommended by the IDE.
           
        try (BufferedReader br = new BufferedReader(fr)) {         
            while((flowerName = br.readLine()) != null)
                    {
                        prefersEnv = br.readLine();
                        System.out.println("Flower " + flowerName + " prefers " + prefersEnv);
                    }
        }     
          System.exit(0);
     } // End of main() method.

} // End of Flowers class.
