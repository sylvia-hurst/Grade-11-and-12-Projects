/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package morsecode;
import java.util.Scanner;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course: ICS
 * Start Date: September 18, 2020
 * End Date: September 18, 2020
 * Description: Converts a string message to Morse code.
 */
public class MorseCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Scanner object
        Scanner kI = new Scanner(System.in);
        
        //Variable declarations
        String input; //Input message
        //Alphabet and 1-0 in the following Strings and array for utilizing the index values
        //Treating the alphaNumStr variables and morse array as parallel
        String alphaNumStrUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"; //Upper case letters
        String alphaNumStrLower = "abcdefghijklmnopqrstuvwxyz1234567890"; //Lower case letters
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----"};
        int index; //To temporarily hold the index value of the character
        
        /*
        I have parallel variables for the alphabets/numbers and for the
        Morse code alphabet/numbers. I scan each character in the input string,
        find its index in the alphabet array, then use the same index
        in the Morse code array, and then output that. There are two alphabet
        arrays, one for upper case letters, and one for lower case letters,
        to ensure they both get translated to Morse code properly. Both arrays
        contain numbers 1 to 0, as well. Special characters get filtered out.
        The code checks if it falls within the upper case range, in which it
        will use the corresponding String. If not, it uses the lower case string
        for both lower case letters and numbers.
        */
        
        //Taking input for the message
        System.out.print("Morse Code Converter\n\n"
                + "Enter your message: ");
        input = kI.nextLine();
        
        //Spacer
        System.out.println("");
        System.out.println("Morse Code:");
        System.out.println("");
        
        //Outputting final message in Morse code
        for (int i=0;i<input.length();i++) {
            
            //Stops the remaining code in the loop and then continues the loop
            //To make sure invalid characters are skipped
            if (((int)input.charAt(i)<48||((int)input.charAt(i)>57&&(int)input.charAt(i)<65)||((int)input.charAt(i)>90&&(int)input.charAt(i)<97)||(int)input.charAt(i)>122)&&(int)input.charAt(i)!=32) {
                continue;
            }
            
            //Converts letters or numbers to Morse code
            if ((int)input.charAt(i)!=32) {
                if ((int)input.charAt(i)>64&&(int)input.charAt(i)<91)
                    index = alphaNumStrUpper.indexOf(input.charAt(i));
                else
                    index = alphaNumStrLower.indexOf(input.charAt(i));
                System.out.println(morse[index]);
            }
            else
                System.out.println("");
        }
        
    }

}
