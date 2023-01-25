/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome2;
import javax.swing.JOptionPane;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course: ICS
 * Start Date: September 17, 2020
 * End Date: September 18, 2020
 * Description: Determines the number of palindromes in a sentence and indicates them all.
 */
public class Palindrome2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variable declarations
        String input; //Original sentence inputted by the user
        String[] inArray; //Array to store each word of the sentence
        String reverse = ""; //For storing the reverse of the word
        int counter; //For counting the while loop to reverse the string
        int palinCount = 0; //For counting the number of palindromes
        String palinList = ""; //For storing the list of palindromes
        
        //Takes input
        input = JOptionPane.showInputDialog("Palindrome Detector 2.0\nEnter a sentence(no punctuation):");
        
        //Splits the string input into each word and places them in the array
        inArray = input.split(" ");
        
        //Reverses every element of the array separately
        for (String inArray1 : inArray) {
            counter = inArray1.length() - 1;
            while (counter>=0) {
                reverse += (String.valueOf(inArray1.charAt(counter)));
                counter--;
            }
            //Determines if the element is a palindrome or not
            if ((inArray1.toUpperCase()).equals(reverse.toUpperCase()) == true) {
                palinCount++; //+1 to the palindrome counter if the current one is a palindrome
                palinList += (inArray1 + " ");
            }
            reverse = "";
        }
        
        //Outputting the results
        if (palinCount>1) {
            JOptionPane.showMessageDialog(null, "Sentence: "+input+".\n"
                    +"There are "+palinCount+" palindromes in the sentence.\n"
                    +"Palindromes: "+palinList);
        }
        else if (palinCount==1) {
            JOptionPane.showMessageDialog(null, "Sentence: "+input+".\n"
                    +"There is 1 palindrome in the sentence.\n"
                    +"Palindrome: "+palinList);
        }
        else {
            JOptionPane.showMessageDialog(null, "Sentence: "+input+".\n"
                    +"There are no palindromes in the sentence.");
        }
    
    }

}
