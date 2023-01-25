/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customerlist;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course: ICS
 * Start Date: October 14, 2020
 * End Date: October 14, 2020
 * Description: Reads data from a file, then allows the
 * user to input information about airline customers.
 * Data includes - name, address, city, province and
 * postal code (which has data validation).
 */
public class CustomerList {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        //Scanner object
        Scanner kI = new Scanner(System.in);
        
        //Variable declarations
        int counter = 0;
        boolean valid = false;
        String cData = "";
        String pCode = "";
        
        try ( //Buffered Reader / File Reader
            BufferedReader readFile = new BufferedReader(new FileReader(
            "C:\\Users\\hu765630\\OneDrive - Wellington Catholic District School Board\\Documents\\NetBeansProjects\\CustomerList\\customerList.txt"))) {
            
            //Above destination leads to the file folder for the CustomerList project,
            //which contains the customerList.txt file.
            
            //Variables for file input
            String myLine;
            
            //Reading & Outputting the file contents
            System.out.println("Contents of the file customerList.txt:");
            
            while (true) {
                myLine = readFile.readLine();
                if (myLine==null){
                    break;
                }
                System.out.println(myLine);
            }
            
            readFile.close();
            
        }
        
        //Asking user how many customers they would like to add
        while (valid==false) {
            try {
                System.out.print("\nHow many customers would you like to add? ");
                counter = Integer.parseInt(kI.nextLine());
                valid = true;
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please try again, and input an integer.\n");
            }
        }
        
        //Loop that contains all code for inputting data
        for (int i=1;i<=counter;i++) {
            //Idea: Concat all parts of the string onto one string
            //and then write that entire string to the file
            System.out.println("Additional customer #"+i);
            
            System.out.print("Name: ");
            cData = cData.concat("\nName: "+kI.nextLine());
            System.out.print("Address: ");
            cData = cData.concat("\nAddress: "+kI.nextLine());
            System.out.print("City: ");
            cData = cData.concat("\nCity: "+kI.nextLine());
            System.out.print("Province: ");
            cData = cData.concat("\nProvince: "+kI.nextLine());
            
            //Special code to ensure postal code is a valid postal code
            valid = false;
            while (valid==false) {
                System.out.print("Postal Code: ");
                pCode = kI.nextLine();
                //Checks the unicode value of each character
                //and makes sure each falls into the correct range
                if ((int)(pCode.charAt(0))>64&&(int)(pCode.charAt(0))<91&&(int)(pCode.charAt(2))>64&&(int)(pCode.charAt(2))<91&&(int)(pCode.charAt(4))>64&&(int)(pCode.charAt(4))<91&&(int)(pCode.charAt(1))>47&&(int)(pCode.charAt(1))<58&&(int)(pCode.charAt(3))>47&&(int)(pCode.charAt(3))<58&&(int)(pCode.charAt(5))>47&&(int)(pCode.charAt(5))<58) {
                    valid = true;
                } else {
                    System.err.println("Invalid Postal Code. Please try again. Format is: L#L#L#");
                }
            }
            
            cData = cData.concat("\nPostal Code: "+pCode);
            cData = cData.concat("\n--------------------");
            
            //Printing to the file
            try (PrintWriter fileOut = new PrintWriter(new FileWriter(
                "C:\\Users\\hu765630\\OneDrive - Wellington Catholic District School Board\\Documents\\NetBeansProjects\\CustomerList\\customerList.txt", true))) {
                fileOut.print(cData);
                fileOut.close();
            }
            
            //Emptying the data string to prepare for the next run of the loop
            cData = "";
            
        }
        
    }

}
