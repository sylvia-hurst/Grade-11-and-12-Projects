/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg20191031_flaremix2;
import java.util.Scanner;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course Code: ICS
 * Start Date: October 31, 2019
 * End Date: October 31, 2019
 * Description: Remixing pre-existing code with for loops and arrays.
 * This is program #2: Friend names
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner (System.in); //Scanner for keyed input
        
        //Declaring the String array
        String [ ] friends = new String [5]; //Changed from 10 to 5 elements
        
        //Asking for user input for all the friend names
        System.out.println("Enter the names of five friends:"); //Changed 'ten' to 'five'
        for (int i = 0; i <= 4; i = i + 1) //Changed i limitation from i <= 9 to i <= 4, to count for just 5 values instead of 10
        {
            friends[i] = keyedInput.nextLine();
        }
        
        //Outputting certain friend names
        System.out.println("The second, third and fourth names listed were:"); //Changed 'fourth and seventh' to 'second, third and fourth'
        System.out.println("Second: " + friends[1]); //Changed these three lines to accomodate the second, third and fourth friend names
        System.out.println("Third: " + friends[2]);
        System.out.println("Fourth: " + friends[3]);
        
        
    }

}
