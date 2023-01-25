/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reducefraction;

import javax.swing.JOptionPane;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course: ICS
 * Start Date: November 12, 2020
 * End Date: November 12, 2020
 * Description: Uses a recursive function to find the greatest
 * common divisor of two numbers in order to reduce a
 * user-inputted fraction to its simplest form.
 */
public class ReduceFraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variable declarations:
        int num; //Numerator
        int den; //Denominator
        int gcd; //Greatest common divisor
        int rNum; //Reduced numerator
        int rDen; //Reduced denominator
        
        //The two inputs
        while (true){
            try {
                num = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Enter the numerator:",
                        "Reduce Fraction",
                        JOptionPane.INFORMATION_MESSAGE));
                break;
            } catch (NumberFormatException | NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please try again.");
            }
        }
        while (true){
            try {
                den = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Enter the denominator:",
                        "Reduce Fraction",
                        JOptionPane.INFORMATION_MESSAGE));
                break;
            } catch (NumberFormatException | NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please try again.");
            }
        }
        
        //Calculations
        gcd = GCD(num, den);
        rNum = num/gcd;
        rDen = den/gcd;
        
        //Output
        JOptionPane.showMessageDialog(null, "The fraction "+num+"/"+den
                +" can be simplified to "+rNum+"/"+rDen+".",
                "Reduce Fraction", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    //GCD method - Continuously performs the modulus operation
    //on the numbers (back and forth) until one comes out as zero,
    //revealing the GCD
    public static int GCD(int n, int d){
        if(d == 0) {
            return n;
        }
        else {
          return GCD(d, n%d);
        }
    }
    
    /*
    
    Ex. num=27, den=18.
    
    GCD (27, 18)
    
    GCD (18, 27%18 = 9)
    
    GCD (9, 18%9 = 0)
    
    returns n, 9.
    
    Ex. num=25, den=30
    
    GCD (25, 30)
    
    GCD (30, 25%30 = 25)
    
    GCD (25, 30%25 = 5)
    
    GCD (5, 25%5 = 0)
    
    returns n, 5.
    
    */

}
