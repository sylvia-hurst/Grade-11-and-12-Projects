/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg20191121_typecasting;
import java.util.Scanner;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course Code: ICS
 * Start Date: November 21, 2019
 * End Date: November 22, 2019
 * Description: A program that collects user data in certain variable types, converts them to different variable types, then outputs them.

 * This program prompts the user for the following information:

    1) a whole number and stores it as an integer
    2) a decimal number and stores it as a Double
    3) a single character and stores it as a char
    4) a name and stores it as a String
    5) a whole number and stores it as a String
    6) a decimal number and stores it as a String

 * Then, it will:

    1) convert the whole number integer into a double and output it.
    2) convert the decimal number Double into an integer and output it.
    3) convert the single character into a String and output it.
    4) convert the first character of the name into a char and output it.
    5) convert the whole number String into an integer and output it.
    6) convert the decimal number String into a Double and output it.

 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner kI = new Scanner(System.in); //Scanner for keyed input
        
        //Variable declarations
        
        //Initial variables
        int wholeNumInt = 0;
        double deciNumDouble = 0;
        char singleChar = ' ';
        String nameString = " ";
        String wholeNumString = " ";
        String deciNumString = " ";
        
        //Converted variables
        double wholeNumDouble;
        int deciNumInt;
        String singleString;
        char nameChar;
        int wholeNumStrint;
        double deciNumStrouble;
        
        //Validity that progresses the while loops containing try/catch code
        boolean valid = false;
        
        //Test variables that may catch some additional errors
        int testInt;
        String testString;
        
        //Intro
        System.out.println("Welcome to the Type Caster!");
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        
        //The following 6 sections prompt the user to enter the appropriate data and store the values in variables.
        //They are also outfitted with try/catch code to ensure the data entered is of the proper variable type.
        
        //First variable: Whole number to integer
        while (valid==false) {
            System.out.print("Please enter a whole number: ");
            try {
                wholeNumInt = Integer.parseInt(kI.nextLine());
                valid = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Sorry, that is not a valid input.");
                System.out.println("");
            }
        }
        System.out.println("Thank you!");
        System.out.println("");
        valid = false;
        
        //Second variable: Decimal number to double
        while (valid==false) {
            System.out.print("Please enter a decimal number: ");
            try {
                deciNumDouble = Double.parseDouble(kI.nextLine());
                valid = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Sorry, that is not a valid input.");
                System.out.println("");
            }
        }
        System.out.println("Thank you!");
        System.out.println("");
        valid = false;
        
        //Third variable: Single character to char
        while (valid==false) {
            System.out.print("Please enter a single character: ");
            try {
                testString = kI.nextLine();
                if (testString.length()>1)
                    testInt = 1/0;
                singleChar = (testString).charAt(0);
                valid = true;
            }
            catch (ArithmeticException e) {
                System.out.println("Sorry, that is not a valid input.");
                System.out.println("");
            }
        }
        System.out.println("Thank you!");
        System.out.println("");
        valid = false;
        
        //Fourth variable: Name to String
        while (valid==false) {
            System.out.print("Please enter a name: ");
            try {
                nameString = kI.nextLine();
                valid = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Sorry, that is not a valid input.");
                System.out.println("");
            }
        }
        System.out.println("Thank you!");
        System.out.println("");
        valid = false;
        
        //Fifth variable: Whole number to String
        while (valid==false) {
            System.out.print("Please enter a whole number: ");
            try {
                wholeNumString = kI.nextLine();
                testInt = (int)Double.parseDouble(wholeNumString);
                valid = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Sorry, that is not a valid input.");
                System.out.println("");
            }
        }
        System.out.println("Thank you!");
        System.out.println("");
        valid = false;
        
        //Sixth variable: Decimal number to String
        while (valid==false) {
            System.out.print("Please enter a decimal number: ");
            try {
                deciNumString = kI.nextLine();
                testInt = (int)Double.parseDouble(deciNumString);
                valid = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Sorry, that is not a valid input.");
                System.out.println("");
            }
        }
        System.out.println("Thank you!");
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        
        //The following 6 sections process the inputted information and convert them into new variable types.
        
        //First variable: Integer to double
        wholeNumDouble = (double)wholeNumInt;
        
        //Second variable: Double to integer
        deciNumInt = (int)deciNumDouble;
        
        //Third variable: Char to String
        singleString = String.valueOf(singleChar);
        
        //Fourth variable: First letter of the name to a char
        nameChar = nameString.charAt(0);
        
        //Fifth variable: String to integer
        wholeNumStrint = (int)Double.parseDouble(wholeNumString);
        
        //Sixth variable: String to double
        deciNumStrouble = Double.parseDouble(deciNumString);
        
        //The following 6 sections output the resulting variables.
        
        //First variable: Double
        System.out.println("Here is your whole number converted to a double: " + wholeNumDouble);
        System.out.println("");
        
        //Second variable: Integer
        System.out.println("Here is your decimal number converted to an integer: " + deciNumInt);
        System.out.println("");
        
        //Third variable: String
        System.out.println("Here is your single character converted to a String: " + singleString);
        System.out.println("");
        
        //Fourth variable: Char
        System.out.println("Here is the first character in your name: " + nameChar);
        System.out.println("");
        
        //Fifth variable: Integer
        System.out.println("Here is your whole number String converted to an integer: " + wholeNumStrint);
        System.out.println("");
        
        //Sixth variable: Double
        System.out.println("Here is your decimal number String converted to a double: " + deciNumStrouble);
        System.out.println("");
        
        //Conclusion
        System.out.println("Thank you for using the Type Caster!");
        
    }

}
