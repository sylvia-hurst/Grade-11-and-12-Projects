/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg20191106_subroutines;
import java.util.Scanner;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course Code: ICS
 * Start Date: November 6, 2019
 * End Date: November 6, 2019
 * Description: My first subroutine program
 * 
 */
public class Main {

    //Declaration for the constant pi
    public static double pi = 3.14;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Declaration for scanner object
      Scanner kI = new Scanner (System.in);

      //Variables for user input
      int option;
      double input;

      //Intro
      System.out.println("Welcome to the circle calculator!");

      //Loop begins (and does not end until 7 or an invalid option is entered)
      do {
        System.out.println("");
        //Asking user for input to make their choice
        System.out.println("Enter (1) to find the radius with the diameter, or (2) to find it with the circumference.");
        System.out.println("Enter (3) to find the diameter with the radius, or (4) to find it with the circumference.");
        System.out.println("Enter (5) to find the circumference with the radius, or (6) to find it with the diameter.");
        System.out.println("Enter (7) to exit the program.");
        option = Integer.parseInt(kI.nextLine());

        //This switch statement runs based on the option the user chose.
        //It starts by asking them to input the variable needed for the calculation, then it calls the method to perform the calculation and output the result.
        //Inputting a number outside of the range of 1-6 will exit the program.
        switch (option) {
          case 1:
          {
            System.out.println("");
            System.out.print("Enter the diameter: ");
            input = Double.parseDouble(kI.nextLine());
            diameterToRadius (input);
            break;
          }
          case 2:
          {
            System.out.println("");
            System.out.print("Enter the circumference: ");
            input = Double.parseDouble(kI.nextLine());
            circumToRadius (input);
            break;
          }
          case 3:
          {
            System.out.println("");
            System.out.print("Enter the radius: ");
            input = Double.parseDouble(kI.nextLine());
            radiusToDiameter (input);
            break;
          }
          case 4:
          {
            System.out.println("");
            System.out.print("Enter the circumference: ");
            input = Double.parseDouble(kI.nextLine());
            circumToDiameter (input);
            break;
          }
          case 5:
          {
            System.out.println("");
            System.out.print("Enter the radius: ");
            input = Double.parseDouble(kI.nextLine());
            radiusToCircum (input);
            break;
          }
          case 6:
          {
            System.out.println("");
            System.out.print("Enter the diameter: ");
            input = Double.parseDouble(kI.nextLine());
            diameterToCircum (input);
            break;
          }
          case 7:
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

      }while(true);

    }

    //Below are the methods for each option's calculation.
    //Each method takes the user inputted variable and performs an operation on it to get the result, then rounds the result to two decimal places and outputs it to the user.

    //Option 1
    public static void diameterToRadius (double diameter) {
      double radius = diameter/2;
      radius = radius*100;
      radius = Math.round(radius);
      radius = radius/100;
      System.out.println("The radius of the circle is " + radius + ".");
    }
     //Option 2
    public static void circumToRadius (double circum) {
      double radius = circum/pi/2;
      radius = radius*100;
      radius = Math.round(radius);
      radius = radius/100;
      System.out.println("The radius of the circle is " + radius + ".");
    }

    //Option 3
    public static void radiusToDiameter (double radius) {
      double diameter = radius*2;
      diameter = diameter*100;
      diameter = Math.round(diameter);
      diameter = diameter/100;
      System.out.println("The diameter of the circle is " + diameter + ".");
    }

    //Option 4
    public static void circumToDiameter (double circum) {
      double diameter = circum/pi;
      diameter = diameter*100;
      diameter = Math.round(diameter);
      diameter = diameter/100;
      System.out.println("The diameter of the circle is " + diameter + ".");
    }

    //Option 5
    public static void radiusToCircum (double radius) {
      double circum = radius*2*pi;
      circum = circum*100;
      circum = Math.round(circum);
      circum = circum/100;
      System.out.println("The circumference of the circle is " + circum + ".");
    }

    //Option 6
    public static void diameterToCircum (double diameter) {
      double circum = diameter*pi;
      circum = circum*100;
      circum = Math.round(circum);
      circum = circum/100;
      System.out.println("The circumference of the circle is " + circum + ".");
    }

    

}
