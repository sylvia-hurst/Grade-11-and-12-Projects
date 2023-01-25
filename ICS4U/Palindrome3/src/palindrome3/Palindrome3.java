/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome3;
import javax.swing.JOptionPane;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course: ICS
 * Start Date: September 18, 2020
 * End Date: September 18, 2020
 * Description: Determines if a phrase is a palindrome.
 */
public class Palindrome3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variable declarations
        String input; //Original word inputted by the user
        String inNoSpace; //The input string after removing the spaces
        String reverse = ""; //Reversed version
        
        //Takes input
        input = JOptionPane.showInputDialog("Palindrome Detector 3.0\nEnter a phrase(no punctuation):");
        
        //Removes all spaces from the string
        inNoSpace = input.replace(" ", "");
        
        int counter = inNoSpace.length()-1; //For counting the while loop to reverse the string
        
        //Reverses the string
        while (counter>=0) {
            reverse+=inNoSpace.charAt(counter);
            counter--;
        }
        
        if ((inNoSpace.toUpperCase()).equals((reverse.toUpperCase()))) {
            JOptionPane.showMessageDialog(null, input+" IS a palindrome.");
        }
        else {
            JOptionPane.showMessageDialog(null, input+" is NOT a palindrome.");
        }
        
    }

}
