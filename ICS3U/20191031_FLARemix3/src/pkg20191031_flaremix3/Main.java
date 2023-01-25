/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg20191031_flaremix3;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course Code: ICS
 * Start Date: October 31, 2019
 * End Date: October 31, 2019
 * Description: Remixing pre-existing code with for loops and arrays.
 * This is program #3: Average marks
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Removed the Scanner because it isn't used
        
        double [ ] marks = {34.7, 54.1, 34.8, 99.6, 43.6, 43.2, 65.8, 44.8, 88.6};
        double total = 0;
        double average;
        
        //Displaying all the marks
        System.out.println("These are the marks:");
        for (int i = 0; i<=8; i= i + 1) //Changed i limitation from i<=5 to i<=8, to account for the 3 new values
        {
           System.out.println(marks[i]);
        }
        
        //Adding all the marks together
        for (int i = 0; i<=8; i= i + 1) //Changed i limitation from i<=5 to i<=8, to account for the 3 new values
        {
            total = total + marks[i];
        }
        
        //Calculating the average by dividing by the number of values
        average = total/9; //Changed divisor from 6 to 9 to account for the 3 new values
        
        //Rounding to one decimal place
        average = average * 10;
        average = Math.round(average);
        average = average/10;
        
        //Outputting the average
        System.out.println("The average mark is:");
        System.out.println(average);
        
    }

}
