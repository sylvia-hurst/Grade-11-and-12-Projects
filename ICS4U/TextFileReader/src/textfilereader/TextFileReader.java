/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package textfilereader;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course: ICS
 * Start Date: October 14, 2020
 * End Date: October 14, 2020
 * Description: Reads a text file using the user-inputted file name.
 */
public class TextFileReader {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main (String[] args) throws IOException {
        
        //Input variable
        String input = JOptionPane.showInputDialog(null,
                "Please input the name of the file to read.",
                "Text File Reader",
                JOptionPane.INFORMATION_MESSAGE);
        
        try ( //Buffered Reader / File Reader
            BufferedReader readFile = new BufferedReader(new FileReader(
            "C:\\Users\\hu765630\\OneDrive - Wellington Catholic District School Board\\Documents\\NetBeansProjects\\TextFileReader\\"
            +input))) {
            
            //Above destination leads to the file folder for the TextFileReader project,
            //which contains the splatAStats.txt file I used for testing.
            
            //Variables for file input
            String myLine;
            
            //Reading & Outputting the file contents
            System.out.println("Contents of the file "+input+":");
            
            while (true) {
                myLine = readFile.readLine();
                if (myLine==null){
                    break;
                }
                System.out.println(myLine);
            }
            
            readFile.close();
            
        }
        
    }

}
