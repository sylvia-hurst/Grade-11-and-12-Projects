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
 */
public class ATM {
    
    //This class will contain all of the methods required to let the ATM function
    
    /* CONTAINS:
    
    1. Bank constructor - Takes bank name and initial balance amount as parameters
    2. Display balance method - shows the current amount of money you hold
    and the current amount the bank holds
    3. Deposit method - add money to the balance (positive amount)
    4. Withdraw method - remove money from the balance (positive amount) 
    5. Invest - place money the bank holds into an investment. Set the investment amount,
    the annual interest rate, and the number of days invested, and it will be returned with interest.
        A = P(1 + i)^n
    
    */
    
    //Variable declarations
    public static String bank;
    public static double balance;
    public static String blcStr;
    
    //Bank constructor
    public ATM(String bkNm, double blnc){
        bank = bkNm;
        balance = blnc;
        blcStr = String.format("%.2f", balance);
    }
    
    //Display current balance
    public void balanceOut(){
        JOptionPane.showMessageDialog(null, "Your current balance is: $"+blcStr,
                ATM.bank, JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Deposit
    public void deposit(){
        //Input
        double input = 0;
        String inStr;
        
        do {
            try {
                input = Double.parseDouble((JOptionPane.showInputDialog(null,
                "DEPOSIT\n"
                + "Your current balance is: $"+blcStr+"\n"
                + "Please enter an amount (positive) to deposit.",
                ATM.bank,
                JOptionPane.INFORMATION_MESSAGE)));
            } catch (NumberFormatException | NullPointerException e) {
                input = -1;
            }
        } while (input<0);
        
        //Applying the deposit to the balance and displaying the results
        balance+=input;
        blcStr = String.format("%.2f", balance);
        inStr = String.format("%.2f", input);
        JOptionPane.showMessageDialog(null, "You deposited $"+inStr+".\n"
            + "Your current balance is: $"+blcStr,
            ATM.bank, JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Withdraw
    public void withdraw(){
        //Input
        double input = 0;
        String inStr;
        
        do {
            try {
                input = Double.parseDouble((JOptionPane.showInputDialog(null,
                "WITHDRAW\n"
                + "Your current balance is: $"+blcStr+"\n"
                + "Please enter an amount (positive) to withdraw.",
                ATM.bank,
                JOptionPane.INFORMATION_MESSAGE)));
            } catch (NumberFormatException | NullPointerException e) {
                input = -1;
            }
        } while (input<0 || input>balance);
        
        //Applying the withdraw to the balance and displaying the results
        balance-=input;
        blcStr = String.format("%.2f", balance);
        inStr = String.format("%.2f", input);
        JOptionPane.showMessageDialog(null, "You withdrew $"+inStr+".\n"
            + "Your current balance is: $"+blcStr,
            ATM.bank, JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Invest
    public void invest(){
        //Variables
        double principal;
        double rate;
        int days;
        String prStr;
        String itrStr;
        
        //Taking each input
        
        //Investment
        do {
            try {
                principal = Double.parseDouble((JOptionPane.showInputDialog(null,
                "INVEST\n"
                + "Your current balance is: $"+blcStr+"\n"
                + "Please enter an amount from your balance (positive) to invest.",
                ATM.bank,
                JOptionPane.INFORMATION_MESSAGE)));
            } catch (NumberFormatException | NullPointerException e) {
                principal = -1;
            }
        } while (principal<0 || principal>balance);
        prStr = String.format("%.2f", principal);
        
        //Annual interest rate
        do {
            try {
                rate = Double.parseDouble((JOptionPane.showInputDialog(null,
                "INVEST\n"
                + "Please enter the annual interest rate (decimal).",
                ATM.bank,
                JOptionPane.INFORMATION_MESSAGE)));
            } catch (NumberFormatException | NullPointerException e) {
                rate = -1;
            }
        } while (rate<0);
        
        //Days invested
        do {
            try {
                days = Integer.parseInt((JOptionPane.showInputDialog(null,
                "INVEST\n"
                + "Please enter the number of days you will invest this for.",
                ATM.bank,
                JOptionPane.INFORMATION_MESSAGE)));
            } catch (NumberFormatException | NullPointerException e) {
                days = -1;
            }
        } while (days<0);
        
        //Calculations
        
        double A = principal*(Math.pow((1+(rate/365)), days));
        double interest = A-principal;
        balance = A;
        itrStr = String.format("%.2f", interest);
        blcStr = String.format("%.2f", balance);
        
        //Output
        JOptionPane.showMessageDialog(null, "You invested $"+prStr
            + " at an annual rate of "+rate+" for "+days+" days.\n"
            + "You obtained $"+itrStr+" in interest.\n"
            + "Your current balance is: $"+blcStr,
            ATM.bank, JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
