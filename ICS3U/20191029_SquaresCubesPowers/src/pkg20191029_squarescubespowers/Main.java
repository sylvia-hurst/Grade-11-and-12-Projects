/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg20191029_squarescubespowers;
import java.util.Scanner;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course Code: ICS
 * Start Date: October 29, 2019
 * End Date: October 31, 2019
 * Description: A program that prompts the user to input a number, select one of four options, and allows them to place an exponent on their number and see the result.
 * I am a cool kid and decided not to import any math subroutines to help with the exponent functions.
 * I only used for loops and multiplication / division operators to solve the power. B)
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner kI = new Scanner (System.in); //Scanner for keyed input
        
        //Variable declaration
        //option is an int because it simply runs the if statement
        //num and num2 are doubles because they may end up having decimal values if the chosen exponent is negative
        //exp is an int to keep the program simple
        int option;
        double num;
        double num2;
        int exp;
        
        //Introduction
        System.out.println("Welcome to the power house!");
        
        //Loop that keeps the program running until option 4 (or an invalid option) is entered, where the return statement will end the program
        //This loop allows the user to continuously play with bases and exponents to their heart's content
        do
        {
            System.out.println("");
            
            //User inputs their option
            System.out.print("Enter (1) to square, (2) to cube, (3) to input a custom exponent, or (4) to exit: ");
            option = Integer.parseInt(kI.nextLine());
            
            //Series of ifs controls what happens based on the user's inputted option
            //Options 1-3 start by asking the user to input a base, then continues with that option's specific functions
            //Option 4 or anything else exits the program
            if (option==1)
            {
                System.out.print("Please input a number (double) to be the power's base: ");
                num = Double.parseDouble(kI.nextLine());
                
                //Squares the number
                num = num*num;
                
                //Rounding number to two decimal places
                num = num*100;
                num = Math.round(num);
                num = num/100;
                
                //Displays the result
                System.out.println("Your number squared equals " + num);
            }
            else if (option==2)
            {
                System.out.print("Please input a number (double) to be the power's base: ");
                num = Double.parseDouble(kI.nextLine());
                
                //Cubes the number
                num = num*num*num;
                
                //Rounding number to two decimal places
                num = num*100;
                num = Math.round(num);
                num = num/100;
                
                //Displays the result
                System.out.println("Your number cubed equals " + num);
            }
            else if (option==3)
            {
                System.out.print("Please input a number (double) to be the power's base: ");
                num2 = Double.parseDouble(kI.nextLine());
                num = 1;
                
                //Prompts the user to enter the exponent as well
                System.out.print("Please input an exponent (int): ");
                exp = Integer.parseInt(kI.nextLine());
                
                //Uses an if statement to determine whether the base number should be multiplied or divided by itself (exp) times (divided if the exp is negative)
                if (exp>=0)
                {
                    for (int i=0;i<exp;i++) //For loops multiply the number by itself as many times as the exponent #
                        num = num*num2;
                }
                else
                {
                    for (int i=0;i>exp;i--) //For loops divide the number by itself as many times as the exponent #
                        num = num/num2;
                }
                
                //Rounding number to two decimal places
                num = num*100;
                num = Math.round(num);
                num = num/100;
                
                //Displaying the resulting number
                System.out.println("Your number to the exponent " + exp + " equals " + num);
            }
            else if (option==4)
            {
                //Farewell statement and program exiting
                System.out.println("");
                System.out.println("Farewell.");
                System.out.println("Program exited.");
                return;
            }
            else
            {
                //Invalid response statement and program exiting
                System.out.println("");
                System.out.println("Invalid response.");
                return;
            }
        }while(true);
        //This loop will always continue looping because of the boolean being set to true,
        //unless the loop is broken by a return statement inside the loop, after selecting anything other than options 1-3
        
    }

}
