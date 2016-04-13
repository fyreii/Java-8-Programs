package Ch6;

/**
*
* @author Teresa Henderson 03/09/2013
*/
import java.util.*;

public class Ch6 {

    public static void main(String args[]) {
        // Ch6 (Java) Assignment - Traversing Arrays
        int loopMe;
        int myArray[] = new int[25];
        for (loopMe = 0; loopMe < 25; loopMe++) {
            myArray[loopMe] = (int) (Math.random() * 100) + 1;
            System.out.println("myArray contains: " + myArray[loopMe]);
        }
      
        // determine largest and smallest values in the array
        Arrays.sort(myArray);
        System.out.println("\nSmallest value is: " + myArray[0]);
        System.out.println("Largest value is: " + myArray[24]);

        // ignore the smallest and largest values and calculate average       
        int sum = 0;
        for (int value : myArray) {
            if (value != myArray[0] || value != myArray[24]) {
                sum += value;
            }
        }
        int average = ((int) sum) / myArray.length;
        System.out.println("Average value is: " + average);
       
        // extra credit - find value frequency
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int value : myArray) {
          Integer freq = myMap.get(value);
          myMap.put(value, (freq == null) ? 1 : freq + 1);
        }
        System.out.println("\nValue=Frequency ");
        System.out.println(myMap);
       
    } // end of main
} // end of class  
