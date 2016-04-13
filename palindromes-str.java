public class Ch9 {

    /**
     *
     * @author Teresa Henderson 03/31/2013
     * Ch9 (Java) Assignment - Recursive String Palindromes
     */
     
     */ Actually got in trouble for using reverse string on this one ... */
    
    private static boolean paliCheck(String origStr) {
        if (origStr.length() > 2) {
            return true;
        }  else {
            if (origStr.charAt (0) == origStr.charAt(origStr.length() - 1)) {
                return paliCheck(origStr.substring(1, origStr.length() - 1));
            }  
        else
            return false;
        }
    } // end of method
   
   
    public static void main(String args[]) {
       
        boolean ans = false;
        String origStr = JOptionPane.showInputDialog("Please enter a string: ");
       
        ans = paliCheck(origStr);
       
        if (ans) {
            JFrame frame = new JFrame("Palindrome");
            JOptionPane.showMessageDialog(frame, "We have a palindrome! \n" + origStr);
        } else {
            JFrame frame = new JFrame("Not Palindrome");
            JOptionPane.showMessageDialog(frame, "We do not have a palindrome! \n" + origStr);
        }
         
    } // end of main()
} // end of class
