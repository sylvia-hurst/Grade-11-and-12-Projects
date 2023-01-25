/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome;
import javax.swing.JOptionPane;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course: ICS
 * Start Date: September 17, 2020
 * End Date: September 17, 2020
 * Description: Determines if a word is a palindrome.
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variable declarations
        String input; //Original word inputted by the user
        String reverse = ""; //Reversed version
        
        //Takes input
        input = JOptionPane.showInputDialog("Palindrome Detector\nEnter a word:");
        
        int counter = input.length()-1; //For counting the while loop to reverse the string
        
        //Reverses the string
        while (counter>=0) {
            reverse+=input.charAt(counter);
            counter--;
        }
        
        if ((input.toUpperCase()).equals((reverse.toUpperCase()))) {
            JOptionPane.showMessageDialog(null, input+" backwards is "+reverse
            +"\n"+input+" IS a palindrome.");
        }
        else {
            JOptionPane.showMessageDialog(null, input+" backwards is "+reverse
            +"\n"+input+" is NOT a palindrome.");
        }
        
    }

}
