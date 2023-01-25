/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaoftriangle;
import java.util.Scanner;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course: ICS
 * Start Date: September 16, 2020
 * End Date: September 16, 2020
 * Description: This program will find the area of a triangle.
 */
public class AreaOfTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Scanner object
        Scanner kI = new Scanner(System.in);
        
        //Variable declarations
        double a = 0;
        double b = 0;
        double C = 0;
        double area;
        
        //Intro
        System.out.println("Area Of A Triangle Calculator");
        System.out.println("");
        
        //Collecting user inputs *Catches a number format exception if the input is not a number
        //*Also will not allow an input of 0 or a negative number
        try {
        System.out.print("Enter side a: ");
        a = Double.parseDouble(kI.nextLine());
        if (a<=0) {
            System.out.println("Invalid input.");
            return;
        }
        System.out.print("Enter side b: ");
        b = Double.parseDouble(kI.nextLine());
        if (a<=0) {
            System.out.println("Invalid input.");
            return;
        }
        System.out.print("Enter angle C: ");
        C = Double.parseDouble(kI.nextLine());
        if (a<=0) {
            System.out.println("Invalid input.");
            return;
        }
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid input.");
            return;
        }
        
        //Calculating the area
        area = (a * b * Math.sin(Math.toRadians(C))) / 2;
        
        //Outputting the result
        System.out.println("");
        System.out.println("The area of the triangle is "+area+".");
        
    }
    
}
