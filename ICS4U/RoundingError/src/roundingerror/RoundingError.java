/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundingerror;
import javax.swing.JOptionPane;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course: ICS
 * Start Date: September 16, 2020
 * End Date: September 16, 2020
 * Description: This program will showcase how Java improperly rounds a square root.
 */
public class RoundingError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variable declarations
        double num;
        double square;
        double sqrt;
        double error;

        //Input number *Catches a number format exception if the user does not input a number
        try {
        num = Double.parseDouble(JOptionPane.showInputDialog("Please enter a number."));
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Invalid input.");
            return;
        }
        
        //Takes the square root, which is never a perfect number unless it is a perfect square
        //And then squares it again
        sqrt = Math.sqrt(num);
        square = sqrt*sqrt;
        
        //The error margin is the difference between the square of the square root, and the original number
        error = square - num;
        
        //All the data is displayed
        JOptionPane.showMessageDialog(null, "Number: "+num+"\nSquare root: "+sqrt+"\nSquare: "+square+"\nError margin: "+error);
        
    }
    
}
