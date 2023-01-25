/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg20191028_forloops;
import java.util.Scanner;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course Code: ICS
 * Start Date: October 28, 2019
 * End Date: October 28, 2019
 * Description: For loops used to count forwards and backwards and with different counting intervals.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner kI = new Scanner (System.in); //Scanner for keyed input
        
        //Introduction and listing counting options to the user
        System.out.println("Welcome to the crazy counting machine!");
        System.out.println("(1) Count from 0 to 10 by 1");
        System.out.println("(2) Count from 100 to 0 by 10");
        System.out.println("(3) Count from 50 to 500 by 50");
        System.out.println("(4) Count from 6000 to 1000 by 1000");
        
        //Determining the user's choice
        //If they choose an invalid number, the program will continue asking them to input a number until it is a valid option
        int choice = 0;
        while (choice < 1 || choice > 4)
        {
            System.out.println("Please enter your choice:");
            choice = Integer.parseInt(kI.nextLine());
        }
        
        //Switch used to control the output based on the value of the choice variable
        switch (choice){
            case 1:
                System.out.println("You have chosen to count from 0 to 10 by 1."); //For each case there is an intro to remind the user what option they picked
                for (int i=0;i<11;i++) //And a for loop to control the value of i and output each value counted until it reaches the limit
                    System.out.println(i);
                break;
            case 2:
                System.out.println("You have chosen to count from 100 to 0 by 10.");
                for (int i=100;i>=0;i=i-10)
                    System.out.println(i);
                break;
            case 3:
                System.out.println("You have chosen to count from 50 to 500 by 50.");
                for (int i=50;i<501;i=i+50)
                    System.out.println(i);
                break;
            case 4:
                System.out.println("You have chosen to count from 6000 to 1000 by 1000.");
                for (int i=6000;i>=1000;i=i-1000)
                    System.out.println(i);
                break;
        }
        
        System.out.println("Program complete"); //Outro
        
    }

}
