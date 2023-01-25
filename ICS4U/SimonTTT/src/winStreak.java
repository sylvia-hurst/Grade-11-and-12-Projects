

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arisrelleve
 */
public class winStreak {
    /* This is a way to check how much you have won, and when you have lost your
    win streak. */
        
    //this is to update the first player's winstreak
    public static void updateWS(int winStreak) throws IOException {    
        
    try (PrintWriter fileOut = new PrintWriter(new FileWriter(
            "WinStreak.txt", true))) {  

                fileOut.println("Player 1 is on a " + winStreak + " win streak. ");
                
            }

    }
    
    //updates if the player has lost.
    public static void lossWS(int winStreak) throws IOException {
    
    try (PrintWriter fileOut = new PrintWriter(new FileWriter(
            "WinStreak.txt", true))) {   
        fileOut.println("Player 1 is on a " + winStreak + " win streak. ");
        }
    
    }

    //gets the highest winstreak from the data.
    public static int getWS() throws IOException {
    String content = "";
    
    BufferedReader readFile = new BufferedReader(new FileReader("WinStreak.txt")); {

    String myLine;
    
    while (true) {
                myLine = readFile.readLine();
                if (myLine==null){
                    break;
                }
                content+=myLine;
            }
            
            readFile.close();
        }
    int j = 0;
    String arrContent[] = content.split(" ");
    int max = Integer.parseInt(arrContent[5]);
    boolean numeric = true;
    
    for(int i = 1; i < (arrContent.length/7); i++) {
        
        if(Integer.parseInt(arrContent[5 + j]) > max) {
            max = Integer.parseInt(arrContent[5 + j]);
        }
        
        j = j + 8;
    }
    
    return max;
    }
}
    
