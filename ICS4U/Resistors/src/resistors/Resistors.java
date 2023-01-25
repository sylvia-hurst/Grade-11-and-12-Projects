/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resistors;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course: ICS
 * Start Date: September 28, 2020
 * End Date: September 28, 2020
 * Description: Uses resistor colour codes to determine
 * the ohms of the user-inputted resistor.
 */
public class Resistors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variable declarations
        
        //Resistor value
        int ohms;
        
        //For the two first digits that make up the base before it is multiplied by 10^x
        String base = "";
        
        //Array for the colour codes
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Black");
        colours.add("Brown");
        colours.add("Red");
        colours.add("Orange");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Violet");
        colours.add("Grey");
        colours.add("White");
        
        //User input
        String[] input = (JOptionPane.showInputDialog("Resistor Value Calculator\n"
                + "Input your colour code. Separate colours with hyphens.\n"
                + "Ex: Red-Orange-Black").split("-"));
        
        //Shoving the first two digits together into one number
        base = base.concat(String.valueOf(colours.indexOf(input[0])));
        base = base.concat(String.valueOf(colours.indexOf(input[1])));
        
        //Calculation
        ohms = (int) (Integer.parseInt(base) * Math.pow(10, Integer.parseInt(String.valueOf(colours.indexOf(input[2])))));
        
        //Output
        System.out.println("You entered: "+input[0]+"-"+input[1]+"-"+input[2]+"\n"
                + "The resistance is: "+ohms+" ohms.");
        
    }

}
