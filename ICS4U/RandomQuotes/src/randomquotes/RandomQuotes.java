/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomquotes;

import java.io.*;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course: ICS
 * Start Date: October 14, 2020
 * End Date: October 14, 2020
 * Description: Reads lines from a file, places them into an array,
 * then randomly outputs a singular quote from the array.
 */
public class RandomQuotes {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        try ( //Buffered Reader / File Reader
            BufferedReader readFile = new BufferedReader(new FileReader(
            "C:\\Users\\hu765630\\OneDrive - Wellington Catholic District School Board\\Documents\\NetBeansProjects\\RandomQuotes\\quotes.txt"))) {
            
            //Above destination leads to the file folder for the RandomQuotes project,
            //which contains the quotes.txt file.
            
            //Variables for file input
            String myLine;
            String quotes[] = new String[10];
            int counter = 0;
            
            //Reading the file contents and applying them to an array
            while (true) {
                myLine = readFile.readLine();
                if (myLine==null){
                    break;
                }
                quotes[counter] = myLine;
                counter++;
            }
            
            readFile.close();
            
            //Randomizing and outputting a quote
            System.out.println("Quote of the Day: "+quotes[(int)(Math.random()*10)]);
            
        }
        
    }

}
