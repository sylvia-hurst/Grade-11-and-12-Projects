/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fundraising;
import javax.swing.JOptionPane;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course: ICS
 * Start Date: September 29, 2020
 * End Date: September 29, 2020
 * Description: Takes user inputs for the donation amount per student
 * and student populations for a list of given schools, and then calculates
 * the total funds raised from all schools, outputting the data in a table.
 */
public class FundRaising {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variable declarations
        
        //Two-dimensional array to store donation totals. Each row is for
        //a different donation amount. Each column is for a different school.
        //The last column is for the total for each donation amount.
        double donations[][] = new double[4][9];
        
        //Variables to temporarily host user inputs:
        //School name, fundraising amount per student, and population for the school.
        int school;
        int coin;
        int pop;
        
        //Variables for use in calculations
        double schoolTotal = 0;
        double total = 0;
        
        //Continuously takes input until an invalid input is given
        while(true) {
            try {
                //Each if statement will break the while loop if a value outside the range
                //for the last variable is given. Additionally, if a Number Format Exception
                //is caught, the loop will be broken and the results will be printed.
                school = Integer.parseInt(JOptionPane.showInputDialog("Which school is doing fundraising?\n"
                        + "0 - Catholic Central\n"
                        + "1 - Holy Cross\n"
                        + "2 - John Paul II\n"
                        + "3 - Mother Teresa\n"
                        + "4 - Regina Mundi\n"
                        + "5 - St. Joseph\n"
                        + "6 - St. Mary\n"
                        + "7 - St. Thomas Aquinas\n"
                        + "Other/Cancel - EXIT"));
                if (school<0||school>7){
                    JOptionPane.showMessageDialog(null, "Invalid input. Now printing results.");
                    break;
                }
                coin = Integer.parseInt(JOptionPane.showInputDialog("What is the donation amount?\n"
                        + "0 - 25 cents\n"
                        + "1 - 50 cents\n"
                        + "2 - 1 dollar\n"
                        + "3 - 2 dollars"));
                if (coin<0||coin>3){
                    JOptionPane.showMessageDialog(null, "Invalid input. Now printing results.");
                    break;
                }
                pop = Integer.parseInt(JOptionPane.showInputDialog("What is the school population?"));
                if (pop<0){
                    JOptionPane.showMessageDialog(null, "Invalid input. Now printing results.");
                    break;
                }
                //Switch statement to use the coin # to multiply with the population #
                //for the school's total which is stored in a variable and then placed in the array
                switch (coin){
                    case 0:
                        schoolTotal = pop*0.25;
                        break;
                    case 1:
                        schoolTotal = pop*0.5;
                        break;
                    case 2:
                        schoolTotal = pop;
                        break;
                    case 3:
                        schoolTotal = pop*2;
                }
                //Makes sure the rest of the coin rows have been cleared
                //In case the user is changing a school's donation value
                for (int i=0;i<4;i++){
                    donations[i][school] = 0;
                }
                //Applying the value to its correct position in the array
                donations[coin][school] = schoolTotal;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Now printing results.");
                break;
            }
        }
        
        //Sums totals
        for (int i=0;i<8;i++){
            for (int j=0;j<4;j++) {
                donations[j][8]+=donations[j][i];
                total+=donations[j][i];
            }
        }
        
        //Outputting data in a table
        
        /*Original brute force method
        System.out.println("\tCathCen\tHoly C\tJP II\tMotherT\tReginaM\tSt.Joe\tSt.Mary\tSt.Thom\tTOTAL\n"
                + "$0.25 - "+donations[0][0]+"\t"+donations[0][1]+"\t"+donations[0][2]+"\t"
                + donations[0][3]+"\t"+donations[0][4]+"\t"+donations[0][5]+"\t"
                + donations[0][6]+"\t"+donations[0][7]+"\t"+donations[0][8]+"\t\n"
                + "$0.50 - "+donations[1][0]+"\t"+donations[1][1]+"\t"+donations[1][2]+"\t"
                + donations[1][3]+"\t"+donations[1][4]+"\t"+donations[1][5]+"\t"
                + donations[1][6]+"\t"+donations[1][7]+"\t"+donations[1][8]+"\t\n"
                + "$1.00 - "+donations[2][0]+"\t"+donations[2][1]+"\t"+donations[2][2]+"\t"
                + donations[2][3]+"\t"+donations[2][4]+"\t"+donations[2][5]+"\t"
                + donations[2][6]+"\t"+donations[2][7]+"\t"+donations[2][8]+"\t\n"
                + "$2.00 - "+donations[3][0]+"\t"+donations[3][1]+"\t"+donations[3][2]+"\t"
                + donations[3][3]+"\t"+donations[3][4]+"\t"+donations[3][5]+"\t"
                + donations[3][6]+"\t"+donations[3][7]+"\t"+donations[3][8]+"\t\n"
                + "TOTAL DONATIONS = "+total);
        */
        
        //Version 2, with loops for improved efficiency
        System.out.println("\tCathCen\tHoly C\tJP II\tMotherT\tReginaM\tSt.Joe\tSt.Mary\tSt.Thom\tTOTAL");
        for (int i=0;i<4;i++){
            switch(i){
                case 0:
                    System.out.print("$0.25 - ");
                    break;
                case 1:
                    System.out.print("$0.50 - ");
                    break;
                case 2:
                    System.out.print("$1.00 - ");
                    break;
                case 3:
                    System.out.print("$2.00 - ");
                    break;
            }
            for (int j=0;j<9;j++){
                System.out.print(donations[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.print("TOTAL DONATIONS = "+total+"\n");
        
    }

}
