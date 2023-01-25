/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nchooser;

import javax.swing.JOptionPane;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course: ICS
 * Start Date: November 12, 2020
 * End Date: November 12, 2020
 * Description: A recursive function calculates the
 * number of combinations of r objects the user can
 * choose from a set of n objects (r and n are
 * user-inputted values).
 */
public class NChooseR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variable declarations:
        long r;
        long n;
        long rFact;
        long nFact;
        long nMinusRFact;
        long c;
        //Every variable is a long because when working with
        //factorials and combinations, parts of the calculation
        //can end up as massive numbers.
        
        //The two inputs
        while (true){
            try {
                r = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "How many objects would you like to choose?",
                        "N Choose R",
                        JOptionPane.INFORMATION_MESSAGE));
                if (r>0){
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please try again.");
                }
            } catch (NumberFormatException | NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please try again.");
            }
        }
        while (true){
            try {
                n = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "How many objects are there to choose from?\n"
                        +"(Must be greater than the number of objects you are choosing.)",
                        "N Choose R",
                        JOptionPane.INFORMATION_MESSAGE));
                if (n>r){
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please try again.");
                }
            } catch (NumberFormatException | NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please try again.");
            }
        }
        
        //Calculations
        rFact = Factorial(r,r);
        nFact = Factorial(n,n);
        nMinusRFact = Factorial(n-r,n-r);

        //C(n,r) = n! / ( r! x ( n - r )! )
        c = nFact / ( rFact * nMinusRFact );
        
        //Output
        if (c<2){
            JOptionPane.showMessageDialog(null, "An error in calculation has occured.\n"
                +"Number values provided caused the long variable value limit to be reached.",
                "N Choose R", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "There are "+c
                +" ways to choose "+r+" objects from a set of "+n+" objects.",
                "N Choose R", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }
    
    //Factorial method - takes in two copies of the base number.
    //One copy, f, will be constantly multiplied by the previous
    //number (x). The other copy, x, will constantly decrease by 1.
    //When x reaches 1, the factorial is complete, and will be returned.
    public static long Factorial(long f, long x){
        if (x==1){
            return f;
        } else {
            x-=1;
            return Factorial(f*x, x);
        }
    }

}
