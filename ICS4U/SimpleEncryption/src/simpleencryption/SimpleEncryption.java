/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simpleencryption;
import javax.swing.JOptionPane;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course: ICS
 * Start Date: September 18, 2020
 * End Date: September 18, 2020
 * Description: Encrypts or decrypts a user-inputted message
 * with a user-inputted alphabetic rotation amount.
 * Works with upper case letters, lower case letters, and spaces.
 */
public class SimpleEncryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variable declarations
        String inMessage; //Input message
        String newMessage = ""; //Encrypted or decrypted message
        int shift; //Rotation amount
        int letterInt; //Temporarily stores a letter (as unicode)
        
        //Idea: Use unicode values for capital letters: 65 - 90
        
        //Taking input for the message to encrypt or decrypt
        inMessage = JOptionPane.showInputDialog("Encryption & Decryption Device\n"
                +"Enter your message: ");
        
        //Taking input for the shift value, from 1 to 25 or -1 to -25
        //The user is asked to reverse the +/- sign if decrypting,
        //since decrypting would be the opposite procedure from the original shift
        try {
            shift = Integer.parseInt(JOptionPane.showInputDialog("Enter the rotation amount.\n"
                    +"It must be a value from 1 to 25 or from -1 to -25.\n"
                    +"Be sure to reverse the +/- if decrypting."));
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input.");
            return;
        }
        
        //Checks that the shift input is a valid number
        if (shift==0||shift<-25||shift>25) {
            JOptionPane.showMessageDialog(null, "Invalid input.");
            return;
        }
        
        //Using unicode values to change the letters
        for (int i=0;i<inMessage.length();i++) {
            letterInt = (int)inMessage.charAt(i);
            
            if (letterInt>64&&letterInt<91) {
                if (letterInt+shift>90)
                    letterInt+=shift-26;
                else if (letterInt+shift<65)
                    letterInt+=shift+26;
                else
                    letterInt+=shift;
            }
            else if (letterInt>96&&letterInt<123) {
                if (letterInt+shift>122)
                    letterInt+=shift-26;
                else if (letterInt+shift<97)
                    letterInt+=shift+26;
                else
                    letterInt+=shift;
            }
            
            newMessage+=(char)letterInt;
        }
        
        //Outputting the new message
        JOptionPane.showMessageDialog(null, "Your new message is: "+newMessage);
        
    }

}
