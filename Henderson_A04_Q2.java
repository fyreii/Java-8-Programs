// Created by:  Teresa Henderson
// Date: 07/20/2016
// Class:  CST 200: Core Data Structures with OOP, Bansal
// File:  Henderson_A04_Q2.java
// Purpose:  Outputs data to a file until a sentinel value is given

import java.util.*;
import java.io.*;

public class Henderson_A04_Q2 {
    public static void main(String[] args) throws IOException {
        // String that sets the name of the output file
        String file = "userStrings.txt";
        // instantiate a new file writer object
        FileWriter fw = new FileWriter(file);
        // instantiate a new buffer stream to write to the file writer
        BufferedWriter bw = new BufferedWriter(fw);
        // instantiate a new print writer to the buffer stream
        PrintWriter outFile = new PrintWriter(bw);

        // set a continue limit on the while
        boolean cont = true;
        // instantiate new Scanner
        Scanner input = new Scanner(System.in);

        while (cont) {
            System.out.print("Please enter a string: ");
            String answer = input.nextLine();
            // if the answer equals DONE immediately close
            // file handle and exit loop
            if (answer.equals("DONE")) {
                cont = false;
                outFile.close();
                break;
            // if the answer is not DONE, write the string to the file
            } else {
                outFile.print(answer);
                outFile.println();
            }
        }
        // output the location of the file - CWD
        System.out.println("The output file is: " + file);
    }
}

/* OUTPUT

Please enter a string: this is the song that doesn't end
Please enter a string: yes it goes on and on my friend
Please enter a string: DONE
The output file is: userStrings.txt

userStrings.txt in CWD

this is the song that doesn't end
 yes it goes on and on my friend

*/
