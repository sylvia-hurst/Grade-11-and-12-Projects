/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg20191009_blackjack;
import java.util.Scanner;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course Code: ICS
 * Start Date: October 9, 2019
 * End Date: October 25, 2019
 * Description: Blackjack testing.
 * 
 * Blackjack rules: Ace is worth 1-11. Faces are worth 10. The rest are their pip value.
 * You play against the dealer. Try to get at close to 21 without going over. (If you get over 22, you're out of the game.)
 * Start by placing your bet.
 * Each player is dealt 2 cards to start. The dealer has one card face up and one card face down.
 * Players choose whether they want to hit (gain a card), stand (stay), or double (doubles bet but only one card is given).
 * Hits can be done multiple times before standing.
 * The dealer then reveals their next card, and continues to hit until they have reached/passed 17.
 * Any player whose hand passes the dealer wins their bet from the dealer, and vice versa.
 * With ties, the player simply keeps their bet.
 * If a player gets a Blackjack (2 cards that = 21), they instantly win the round, gain 1.5x their bet, and then the rest of the players continue to play in that round.
 * If a player gets over 21 in their hand, they immediately bust and lose the round.
 * 
 * Coding Blackjack: The idea is that the computer AI is the dealer, and the user is the sole player playing against the dealer.
 * GAME ENDS when player is out of money
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner kI = new Scanner(System.in);
        
        double payroll = 100;
        double wager = 0;
        int []pHand = {0,0,0,0,0}; //5 cards for player max
        int []dHand = {0,0,0,0,0}; //5 cards for dealer max
        int userChoice = 0;
        int pSum = 0;
        int dSum = 0;
        int pCount = 0;
        int dCount = 0;
        int rCount = 0;
        
        //ROUND START (begin of loop)
        while (payroll>0)
        {
            rCount++; System.out.println("Round " + rCount);
            System.out.print("Please enter your wager (0 to " + payroll + "): "); //Later add wager restrictions
            wager = Integer.parseInt(kI.nextLine());
            if (wager > payroll)
            {
                wager = payroll;
                System.out.println("Invalid wager. Your wager has been set to " + wager + ".");
            }
            else if (wager < 0)
            {
                wager = 1;
                System.out.println("Invalid wager. Your wager has been set to " + wager + ".");
            }
            payroll-=wager;
            
            pHand[0] = (int)(Math.random()*13+1); //13 cards (A to K)
            pHand[1] = (int)(Math.random()*13+1);
            pHand[2] = 0;
            pHand[3] = 0;
            pHand[4] = 0;

            //If the player gets a Blackjack right away...
            pSum = calculatePSum(pHand, pSum);
            if (pSum==21)
            {
                for (int i=0;i<5;i++)
                    System.out.print(pHand[i] + " ");
                System.out.println(" with a sum of " + pSum);
                System.out.println("You got a Blackjack! You win the round and gain 1.5x your wager!");
                payroll = payroll + (wager*1.5);
            }
            else
            {

                //Dealer hand (Pt. 1)
                dHand[0] = (int)(Math.random()*13+1);
                dHand[1] = (int)(Math.random()*13+1);
                System.out.println("The dealer's face up card is " + dHand[0]);

                //Player hand
                pCount = 2;

                do
                {
                pSum = calculatePSum(pHand, pSum);  //Call function to add hand

                for (int i=0;i<5;i++)
                    System.out.print(pHand[i] + " ");
                System.out.println(" with a sum of " + pSum);

                System.out.print("(1) to Hit, (2) to Stand, or (3) to double down: ");
                userChoice = Integer.parseInt(kI.nextLine());
                if (userChoice==1)
                {
                    System.out.println("You want another card!");
                    pHand[pCount] = (int)(Math.random()*13+1);
                    pCount++;
                    pSum = calculatePSum(pHand, pSum);
                }
                else if (userChoice==2)
                {
                    System.out.println("You have chosen to stand!");
                    break;
                }
                else
                {
                    System.out.println("You want to double your wager and gain a card!");
                    pHand[pCount] = (int)(Math.random()*13+1);
                    payroll-=wager;
                    wager = wager*2;

                    pSum = calculatePSum(pHand, pSum);  //Call function to add hand

                    for (int i=0;i<5;i++)
                        System.out.print(pHand[i] + " ");
                    System.out.println(" with a sum of " + pSum);
                    break;
                }
                } while(pSum<=21 && pCount<5);

                if (pCount==5)
                {
                    for (int i=0;i<5;i++)
                        System.out.print(pHand[i] + " ");
                    System.out.println(" with a sum of " + pSum);
                }

                if (pSum>21)
                {
                    if (pCount<5)
                    {
                        for (int i=0;i<5;i++)
                            System.out.print(pHand[i] + " ");
                        System.out.println(" with a sum of " + pSum);
                    }
                    System.out.println("You bust! You lose the round.");
                }
                else
                {
                    System.out.println("Your current wager is " + wager + ".");

                    //Dealer hand (Pt. 2)
                    dCount = 1;

                    dSum = calculateDSum(dHand, dSum);
                    while(dSum<=17 && dCount<5) 
                    {
                        dHand[dCount] = (int)(Math.random()*13+1);
                        dCount++;
                        dSum = calculateDSum(dHand, dSum);
                    }
                    System.out.println("The total sum of the dealer's hand is " + dSum);

                    //Competing vs. dealer //Results
                    if (dSum>21)
                    {
                        System.out.println("The dealer busts! You win the round!");
                        payroll+=(wager*2);
                    }
                    else if (pSum>dSum)
                    {
                        System.out.println("You win the round!");
                        payroll+=(wager*2);
                    }
                    else if (pSum<dSum)
                    {
                        System.out.println("You lose the round...");
                    }
                    else if (pSum==dSum)
                    {
                        System.out.println("You tie! You keep your wager.");
                        payroll+=wager;
                    }
                    else
                    {
                        System.out.println("What happened???");
                        return;
                    }
                }
            }
            System.out.println("Your current payroll is " + payroll + ".");
            System.out.println("End of round.");
            System.out.println("");
        }
        //ROUND END (end of loop)
        
        //When the game ends...
        System.out.println("You've run out of money! Game over.");
        
    }

    public static int calculatePSum(int[] pHand, int pSum)
    {
        boolean pHandAce = false;
        pSum = 0;
            for (int i=0;i<5;i++)
        {
            if(pHand[i]==1)
                pHandAce = true;
            if(pHand[i]>=10)
                pSum+=10;
            else
                pSum+=pHand[i];
        }
        if (pSum<=11 && pHandAce==true)
            pSum+=10;
        return (pSum);
    }
    
    public static int calculateDSum(int[] dHand, int dSum)
    {
        boolean dHandAce = false;
        dSum = 0;
            for (int i=0;i<5;i++)
        {
            if(dHand[i]==1)
                dHandAce = true;
            if(dHand[i]>=10)
                dSum+=10;
            else
                dSum+=dHand[i];
        }
        if (dSum<=11 && dHandAce==true)
            dSum+=10;
        return (dSum);
    }
}
