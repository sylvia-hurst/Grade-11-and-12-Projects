/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mybankmachine;
import javax.swing.JOptionPane;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course: ICS
 * Start Date: October 2, 2020
 * End Date: October 13, 2020
 * Description: An ATM program that simulates depositing,
 * withdrawing and investing money in a bank. For
 * simplicity, the user is assumed to have infinite money.
 */
public class MyBankMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variable declarations
        int input;
        String bankInput;
        double balanceInput;
        
        //Bank name is taken
        bankInput = JOptionPane.showInputDialog("Enter the name of the bank:");
        
        //Initial balance value is taken. Catches invalid inputs.
        //Only positive integers can be inputted, otherwise it loops.
        do {
            try {
                balanceInput = Double.parseDouble(JOptionPane.showInputDialog("Enter your initial amount of money:"));
            } catch (NumberFormatException | NullPointerException e) {
                balanceInput = -1;
            }
        } while (balanceInput<0);
        
        ATM atm1 = new ATM(bankInput, balanceInput);
        
        //Menu is controlled by a JOptionPane and the number you
        //enter takes you to the submenu of whatever action it is
        //Encased in a while loop for continued use
        while (true){
            //Taking the input value
            try {
                input = Integer.parseInt((JOptionPane.showInputDialog(null,
                    "Welcome to "+ATM.bank+". Please enter your choice.\n"
                    + "0 - Display Balance\n"
                    + "1 - Deposit\n"
                    + "2 - Withdraw\n"
                    + "3 - Invest",
                    ATM.bank,
                    JOptionPane.INFORMATION_MESSAGE)));
            } catch (NumberFormatException | NullPointerException e) {
                System.out.println("Invalid input. Exiting program.");
                return;
            }

            //Activating submenus
            switch (input){
                case 0:
                    //DISPLAY BALANCE
                    atm1.balanceOut();
                    break;
                case 1:
                    //DEPOSIT
                    atm1.deposit();
                    break;
                case 2:
                    //WITHDRAW
                    atm1.withdraw();
                    break;
                case 3:
                    //INVEST
                    atm1.invest();
                    break;
                default:
                    //Exits program due to invalid input
                    System.out.println("Invalid input. Exiting program.");
                    return;
            }
            
        }
        
    }

}
