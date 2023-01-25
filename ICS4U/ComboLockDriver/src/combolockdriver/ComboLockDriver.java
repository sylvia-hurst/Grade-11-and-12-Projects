/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package combolockdriver;
import java.util.Scanner;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course: ICS
 * Start Date: October 13, 2020
 * End Date: October 14, 2020
 * Description: Simulates opening a combination lock.
 */
public class ComboLockDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        1. Constructs a lock with 3 user-inputted numbers (from 0-39 like Master locks).
        2. Simulates the user guessing the numbers to unlock it.
        One try: if correct, the lock opens, if incorrect at any time,
        a message is outputted to show the correct combination.
        3. Constructs a new lock object with 3 randomly-generated numbers (from 1-3).
        4. The user guesses the numbers to try to unlock it.
        Three tries: if correct, the lock opens, if not, the combo is revealed.
        */
        
        //Scanner object
        Scanner kI = new Scanner(System.in);
        
        //Variables
        int in1=0, in2=0, in3=0;
        boolean valid = false;
        String guess;
        
        //Taking user input
        System.out.println("Welcome to the Combo-Lock Machine!\n\n"
            + "To begin, please input three numbers from 0 to 39 for your combination.\n");
        while (valid==false) {
            try {
                System.out.print("1st: ");
                in1 = Integer.parseInt(kI.nextLine());
                System.out.print("2nd: ");
                in2 = Integer.parseInt(kI.nextLine());
                System.out.print("3rd: ");
                in3 = Integer.parseInt(kI.nextLine());
                
                //Data validation
                if (in1>39||in2>39||in3>39||in1<0||in2<0||in3<0) {
                    System.out.println("Invalid data entered, please try again.\n");
                } else {
                    valid = true;
                }
            } catch (NumberFormatException e) {
                //Data validation
                System.out.println("Invalid data entered, please try again.\n");
            }
        }
        
        //Constructing the user combo lock object with the three inputs
        ComboLock uCombo = new ComboLock(in1, in2, in3);
        
        //Simulating opening the lock
        System.out.println("Data confirmed.\nNow, please try to unlock the lock! You have one attempt.\n");
        
        //Loop only runs once
        //Purpose is that the code inside breaks if an incorrect answer is inputted
        for (int i=1;i<2;i++) {
            System.out.print("What is the first number? ");
            guess = kI.nextLine();
            if (guess.equals(String.valueOf(uCombo.getNum1()))) {
                System.out.println("Correct!\n");
            } else {
                System.out.println("Incorrect.\n");
                break;
            }
            
            System.out.print("What is the second number? ");
            guess = kI.nextLine();
            if (guess.equals(String.valueOf(uCombo.getNum2()))) {
                System.out.println("Correct!\n");
            } else {
                System.out.println("Incorrect.\n");
                break;
            }
            
            System.out.print("What is the third number? ");
            guess = kI.nextLine();
            if (guess.equals(String.valueOf(uCombo.getNum3()))) {
                System.out.println("Correct!\n");
            } else {
                System.out.println("Incorrect.\n");
                break;
            }
        }
        
        //Displaying the full combo at the end
        System.out.println(uCombo);
        
        //Creating an entirely random lock, except the numbers can only be 1, 2 or 3
        System.out.println("\nNow generating a randomized combination lock.\n"
            + "Each of the three numbers can only be 1, 2 or 3.");
        ComboLock rCombo = new ComboLock();
        System.out.println("Generation complete.\n");
        
        //Guessing the randomized combination
        System.out.println("Now, please try to unlock the lock! You have three attempts.\n");
        
        //Loop runs three times, continues when an incorrect answer is inputted
        for (int i=1;i<4;i++) {
            System.out.println("Attempt #"+i);
            System.out.print("What is the first number? ");
            guess = kI.nextLine();
            if (guess.equals(String.valueOf(rCombo.getNum1()))) {
                System.out.println("Correct!\n");
            } else {
                System.out.println("Incorrect.\n");
                if (i==3) {
                    System.out.println("You have reached the maximum number of attempts.\n");
                }
                continue;
            }
            
            System.out.print("What is the second number? ");
            guess = kI.nextLine();
            if (guess.equals(String.valueOf(rCombo.getNum2()))) {
                System.out.println("Correct!\n");
            } else {
                System.out.println("Incorrect.\n");
                if (i==3) {
                    System.out.println("You have reached the maximum number of attempts.\n");
                }
                continue;
            }
            
            System.out.print("What is the third number? ");
            guess = kI.nextLine();
            if (guess.equals(String.valueOf(rCombo.getNum3()))) {
                System.out.println("Correct!\n");
                i=4;
            } else {
                System.out.println("Incorrect.\n");
                if (i==3) {
                    System.out.println("You have reached the maximum number of attempts.\n");
                }
            }
        }
        
        //Displaying the full combo at the end
        System.out.println(rCombo);
        
    }

}
