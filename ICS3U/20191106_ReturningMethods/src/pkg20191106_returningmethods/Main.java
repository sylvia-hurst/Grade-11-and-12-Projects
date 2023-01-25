/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg20191106_returningmethods;
import java.util.Scanner;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course Code: ICS
 * Start Date: November 6, 2019
 * End Date: November 6, 2019
 * Description: Methods and returning data back to the main program
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        1: add 2 nums
        2: subtract 2 nums
        3: multiply 2 nums
        4: divide 2 nums
        5: square a num
        6: square root a num
        7: cube a num
        8: cube root a num
        9: find the modulus (remainder) of 2 nums
        10: find the average of 2 nums
        */

       //Declaration for scanner object
       Scanner kI = new Scanner (System.in);

       //Variables for user input
       int option;
       double n1, n2;

       //Variable to store the result returned from the function
       double result;

       //Intro
       System.out.println("Welcome to the mystical math machine!");

       //Loop begins (and does not end until 0 or an invalid option is entered)
       do {
         System.out.println("");
         //Asking user for input to make their choice
         System.out.println("Enter (1) to add two numbers, (2) to subtract two numbers, (3) to multiply two numbers, (4) to divide two numbers, (5) to square a number, ");
         System.out.println("(6) to square root a number, (7) to cube a number, (8) to cube root a number, (9) to find the remainder of two numbers, or (10) to find the average of two numbers.");
         System.out.println("Enter (0) to exit the program.");
         option = Integer.parseInt(kI.nextLine());

         //This switch statement runs based on the option the user chose.
         //It starts by asking them to input the variable(s) needed for the calculation, then it calls the function to perform the calculation and return the value.
         //Inputting a number outside of the range of 1-10 will exit the program.
         switch (option) {
           case 1:
           {
             System.out.println("");
             System.out.print("Enter your first number: ");
             n1 = Double.parseDouble(kI.nextLine());
             System.out.print("Enter your second number: ");
             n2 = Double.parseDouble(kI.nextLine());
             result = sum(n1,n2);
             break;
           }
           case 2:
           {
             System.out.println("");
             System.out.print("Enter your first number: ");
             n1 = Double.parseDouble(kI.nextLine());
             System.out.print("Enter your second number: ");
             n2 = Double.parseDouble(kI.nextLine());
             result = diff(n1,n2);
             break;
           }
           case 3:
           {
             System.out.println("");
             System.out.print("Enter your first number: ");
             n1 = Double.parseDouble(kI.nextLine());
             System.out.print("Enter your second number: ");
             n2 = Double.parseDouble(kI.nextLine());
             result = product(n1,n2);
             break;
           }
           case 4:
           {
             System.out.println("");
             System.out.print("Enter your first number: ");
             n1 = Double.parseDouble(kI.nextLine());
             System.out.print("Enter your second number: ");
             n2 = Double.parseDouble(kI.nextLine());
             result = quotient(n1,n2);
             break;
           }
           case 5:
           {
             System.out.println("");
             System.out.print("Enter your number: ");
             n1 = Double.parseDouble(kI.nextLine());
             result = square(n1);
             break;
           }
           case 6:
           {
             System.out.println("");
             System.out.print("Enter your number: ");
             n1 = Double.parseDouble(kI.nextLine());
             result = sqrt(n1);
             break;
           }
           case 7:
           {
             System.out.println("");
             System.out.print("Enter your number: ");
             n1 = Double.parseDouble(kI.nextLine());
             result = cube(n1);
             break;
           }
           case 8:
           {
             System.out.println("");
             System.out.print("Enter your number: ");
             n1 = Double.parseDouble(kI.nextLine());
             result = cbrt(n1);
             break;
           }
           case 9:
           {
             System.out.println("");
             System.out.print("Enter your first number: ");
             n1 = Double.parseDouble(kI.nextLine());
             System.out.print("Enter your second number: ");
             n2 = Double.parseDouble(kI.nextLine());
             result = mod(n1,n2);
             break;
           }
           case 10:
           {
             System.out.println("");
             System.out.print("Enter your first number: ");
             n1 = Double.parseDouble(kI.nextLine());
             System.out.print("Enter your second number: ");
             n2 = Double.parseDouble(kI.nextLine());
             result = ave(n1,n2);
             break;
           }
           case 0:
           {
             System.out.println("");
             System.out.println("Now exiting program.");
             return;
           }
           default:
           {
             System.out.println("");
             System.out.println("Invalid response.");
             return;
           }
         }

         //Outputting the result:
         output(result);

       }while(true);

     }

     /*
     Below are the methods for each option's calculation.

     Each method takes the user inputted variable and performs an operation on it to get the result, then rounds the result to two decimal places and returns it to the main program.

     Most methods run on two double variables, while the others run on a single double variable. All of them return a double as the result of the calculation.
     */

     //Option 1
     public static double sum (double n1, double n2) {
       double calc = n1+n2;
       calc = calc*100;
       calc = Math.round(calc);
       calc = calc/100;
       return (calc);
     }
      //Option 2
     public static double diff (double n1, double n2) {
       double calc = n1-n2;
       calc = calc*100;
       calc = Math.round(calc);
       calc = calc/100;
       return (calc);
     }

     //Option 3
     public static double product (double n1, double n2) {
       double calc = n1*n2;
       calc = calc*100;
       calc = Math.round(calc);
       calc = calc/100;
       return (calc);
     }

     //Option 4
     public static double quotient (double n1, double n2) {
       double calc = n1/n2;
       calc = calc*100;
       calc = Math.round(calc);
       calc = calc/100;
       return (calc);
     }

     //Option 5
     public static double square (double n1) {
       double calc = Math.pow(n1,2);
       calc = calc*100;
       calc = Math.round(calc);
       calc = calc/100;
       return (calc);
     }

     //Option 6
     public static double sqrt (double n1) {
       double calc = Math.sqrt(n1);
       calc = calc*100;
       calc = Math.round(calc);
       calc = calc/100;
       return (calc);
     }

     //Option 7
     public static double cube (double n1) {
       double calc = Math.pow(n1,3);
       calc = calc*100;
       calc = Math.round(calc);
       calc = calc/100;
       return (calc);
     }

     //Option 8
     public static double cbrt (double n1) {
       double calc = Math.cbrt(n1);
       calc = calc*100;
       calc = Math.round(calc);
       calc = calc/100;
       return (calc);
     }

     //Option 9
     public static double mod (double n1, double n2) {
       double calc = n1%n2;
       return (calc);
     }

     //Option 10
     public static double ave (double n1, double n2) {
       double calc = (n1+n2)/2;
       calc = calc*100;
       calc = Math.round(calc);
       calc = calc/100;
       return (calc);
     }

     /*
       This method is specifically for outputting the final result.
       It takes the double value of the result and prints it out to the user.
       Returns: void
     */
     public static void output (double result) {
       System.out.println("The result is: " + result);
     }

}
