/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hangman;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course: ICS
 * Start Date: September 29, 2020
 * End Date: September 30, 2020
 * Description: Plays hangman with the user. The computer randomly
 * selects a phrase from a two-dimensional array (rows being categories,
 * columns being phrases) and then asks the user to input letter guesses.
 * Just like hangman, each incorrect guess adds one piece to the hangman
 * and seven incorrect guesses is a loss, but if the full phrase is revealed,
 * the user wins.
 */
public class Hangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variable declarations
        
        //For the input guess
        char guess;
        
        //ArrayLists to host all correct guesses and incorrect guesses
        ArrayList<Character> guessList = new ArrayList<>();
        ArrayList<Character> wrongList = new ArrayList<>();
        
        //Counting the occurences of a correct guess
        int count;
        int lastIndex;
        
        //For counting how many guesses remain
        int guessCount = 7;
        
        //Checking if the phrase has been fully revealed
        String phrCheck;
        
        //2D array to host categories and phrases
        //0-TV SHOWS, 1-FOOD, 2-ACTIVITIES; 5 phrases per category
        String phrases[][] = new String[3][5];
        
        //Filling the array with phrases
        
        //TV SHOWS
        phrases[0][0] = "SPONGEBOB SQUAREPANTS";
        phrases[0][1] = "PHINEAS AND FERB";
        phrases[0][2] = "FAIRLY ODD PARENTS";
        phrases[0][3] = "BACKYARDIGANS";
        phrases[0][4] = "DORA THE EXPLORER";
        
        //FOOD
        phrases[1][0] = "ICE CREAM SUNDAE";
        phrases[1][1] = "FISH AND CHIPS";
        phrases[1][2] = "CHEESE STUFFED CRUST PIZZA";
        phrases[1][3] = "GRILLED CHEESE SANDWICHES";
        phrases[1][4] = "POMEGRANATE";
        
        //ACTIVITIES
        phrases[2][0] = "PLAYING VIDEO GAMES";
        phrases[2][1] = "DRAWING PICTURES";
        phrases[2][2] = "WRITING STORIES";
        phrases[2][3] = "HANGING OUT WITH FRIENDS";
        phrases[2][4] = "DOING HOMEWORK";
        
        //Choosing the category and phrase
        int cat = (int)(Math.random()*3);
        int phr = (int)(Math.random()*5);
        
        //Splitting the chosen category into a new array
        String[] phrWords = phrases[cat][phr].split(" ");
        
        //Making an array for the hidden words
        String[] phrHidWords = new String[phrWords.length];
        
        for (int i=0;i<phrWords.length;i++) {
            phrHidWords[i] = phrWords[i].replaceAll(".", "-");
        }
        
        //Outputting the initial message
        System.out.print("Hangman\n=======\n\nCategory: ");
        switch (cat){
            case 0:
                System.out.print("TV SHOWS\n");
                break;
            case 1:
                System.out.print("FOOD\n");
                break;
            case 2:
                System.out.print("ACTIVITIES\n");
                break;
        }
        System.out.println("Number of words: "+phrWords.length);
        
        //Large loop only broken by running out of guesses or completing the phrase
        //Or by hitting cancel on the message box
        while (true) {
            //Current phrase
            for (int i=0;i<phrWords.length;i++) {
                System.out.print(phrHidWords[i]+" ");
            }
            System.out.println("");
            //List of incorrect guesses
            if (guessCount!=7){
                System.out.print("Incorrect letters: ");
                wrongList.forEach((wrong) -> {
                    System.out.print(wrong + " ");
                });
                System.out.println("");
            }
            
            //Draws the stick man depending on how many guesses are left
            switch (guessCount){
                case 6:
                    //Just the head
                    System.out.println(" O");
                    System.out.println("");
                    break;
                case 5:
                    //The head and the torso
                    System.out.println(" O\n |");
                    System.out.println("");
                    break;
                case 4:
                    //The head, torso and one arm
                    System.out.println(" O\n/|");
                    System.out.println("");
                    break;
                case 3:
                    //The head, torso and two arms
                    System.out.println(" O\n/|\\");
                    System.out.println("");
                    break;
                case 2:
                    //The head, torso, arms, and abdomen
                    System.out.println(" O\n/|\\\n |");
                    System.out.println("");
                    break;
                case 1:
                    //The head, torso, arms, abdomen and one leg
                    System.out.println(" O\n/|\\\n |\n/");
                    System.out.println("");
                    break;
            }
            
            //Asking the user to input a guess. Loop breaks when a valid input is entered
            while (true) {
                try {
                    //Taking just the first inputted character
                    if (guessCount==1){
                        guess = (JOptionPane.showInputDialog("You have 1 guess remaining.\n"
                        + "Guess a letter:")).charAt(0);
                    } else {
                        guess = (JOptionPane.showInputDialog("You have "+guessCount+" guesses remaining.\n"
                        + "Guess a letter:")).charAt(0); 
                    }
                    
                    if ((int)guess>64&&(int)guess<91) //Confirming it's a capital letter
                        break;
                } catch (NullPointerException e){
                    JOptionPane.showMessageDialog(null, "Game cancelled.");
                    return;
                }
            }

            //Determining the results of the guess
            if (phrases[cat][phr].contains(String.valueOf(guess))) {
                //CORRECT
                guessList.add(guess);
                
                //Counting the occurences of the correct guess
                count = 0;
                lastIndex = 0;
                while(lastIndex != -1){
                    lastIndex = phrases[cat][phr].indexOf(guess,lastIndex);
                    if(lastIndex != -1){
                        count ++;
                        lastIndex++;
                    }
                }
                
                //Displays message to show the result
                if (count==1) {
                    JOptionPane.showMessageDialog(null, "Correct!\n\nThere is 1 "+guess+" in the phrase.");
                } else {
                    JOptionPane.showMessageDialog(null, "Correct!\n\nThere are "+count+" "+guess+"s in the phrase.");
                }
                
                //replaceAll except for all the char values of the guessList
                for (int i=0;i<phrWords.length;i++) {
                    phrHidWords[i] = phrWords[i].replaceAll("((?:"+guessList+")+)?(?!"+guessList+").((?:"+guessList+")+)?", "$1-$2");
                }
            }
            else {
                //INCORRECT
                wrongList.add(guess);
                //Displays message to show the result
                JOptionPane.showMessageDialog(null, "Incorrect!\n\nThere are no "+guess+"s in the phrase.");
                guessCount--;
            }
            
            //If the entire phrase is revealed, the game ends
            phrCheck = "";
            for (int i=0;i<phrWords.length;i++) {
                phrCheck+=(phrHidWords[i]);
                
            }
            if (!phrCheck.contains("-")) {
                    //GAME OVER
                    JOptionPane.showMessageDialog(null, "Congratulations! You completed the phrase!");
                    for (String phrWord : phrWords) {
                        System.out.print(phrWord + " ");
                    }
                    System.out.println("");
                    return;
            }
            
            //If the user runs out of guesses, the game ends
            if (guessCount==0) {
                //GAME OVER
                //Draws the full stick man: The head, torso, arms, abdomen, and legs
                System.out.print(" O\n/|\\\n |\n/ \\\n\nGame over.\nThe full phrase is: ");
                for (String phrWord : phrWords) {
                    System.out.print(phrWord + " ");
                }
                System.out.println("");
                return;
            }
        }
        
    }

}
