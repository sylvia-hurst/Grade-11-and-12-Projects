/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eastervariation2;
import javax.swing.JOptionPane;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course: ICS
 * Start Date: September 16, 2020
 * End Date: September 17, 2020
 * Description: This program will calculate the date of Easter Day when given a user-inputted year.
 */
public class EasterVariation2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variable declarations:
        int month, day, year; //Month and day of Easter; year is user input
        int a, b, c, d, q, f, g, h, j, k, n, p;
        //Lettered variables are for storing values during calculations
        String monthStr; //For output in string form
        
        //Input year *Catches a number format exception if the user does not input an integer
        try {
        year = Integer.parseInt(JOptionPane.showInputDialog("Easter Date Calculator\nPlease enter a year."));
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input.");
            return;
        }
        
        //Calculations:
        a = year / 100;
        b = year % 100;
        c = 3 * (a + 25) / 4;
        d = 3 * (a + 25) % 4;
        q = 8 * (a + 11) / 25;
        f = (5*a + b) % 19;
        g = (19*f + c - q) % 30;
        h = (f + 11*g) / 319;
        j = (60 * (5 - d) + b) / 4;
        k = (60 * (5 - d) + b) % 4;
        n = (2*j - k - g + h) % 7;
        month = (g - h + n + 114) / 31;
        p = (g - h + n + 114) % 31;
        day = p+1;
        
        //Converting the month # to a String
        if (month==3) {
            monthStr = "March";
        }
        else {
            monthStr = "April";
        }
        
        //Outputting the date
        JOptionPane.showMessageDialog(null, "Easter will fall on Sunday, "+monthStr+" "+day+", "+year);
        
    }
    
}
