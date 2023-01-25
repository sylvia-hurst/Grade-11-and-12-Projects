/**
 *
 * @author hu765630
 */

import java.io.*;

public class hScore {
    
    //Variable declarations:
    
    //Integer for the high score
    static int hiScore;
    
    //String array to host previous ten scores
    static String pTen[] = new String[10];
    
    //Methods:
    
    //Get High Score - This is run at the beginning of the program.
    //It reads the file, recording the high score to a String as well
    //as the previous ten scores to an array. The high score is
    //returned so it can be displayed on the form.
    public static int getHS() throws IOException {
        String content = "";
        
        try ( //Buffered Reader / File Reader
            BufferedReader readFile = new BufferedReader(new FileReader(
            "C:\\Users\\hu765630\\OneDrive - Wellington Catholic District School Board\\Documents\\NetBeansProjects\\SimonSays\\highScore.txt"))) {
            
            //Above destination leads to the file folder for the SimonSays project,
            //which contains the highScore.txt file.
            
            //Variables for file input
            String myLine;
            
            //Reading file contents & applying them to a String
            while (true) {
                myLine = readFile.readLine();
                if (myLine==null){
                    break;
                }
                content+=myLine;
            }
            
            readFile.close();
        }
        
        //Splitting the content into an array
        String arrContent[] = content.split(" ");
        
        //Array to host records of the previous 10 scores
        String prevTen[] = {arrContent[8], arrContent[10], arrContent[12], arrContent[14],
            arrContent[16], arrContent[18], arrContent[20], arrContent[22], arrContent[24], arrContent[26]};
        
        //Copying to static array outside of this method
        System.arraycopy(prevTen, 0, pTen, 0, 10);
        
        /* TEST OUTPUT
        System.out.println("Previous 10: "+prevTen[0]+", "+prevTen[1]+", "
                +prevTen[2]+", "+prevTen[3]+", "+prevTen[4]+", "+prevTen[5]+", "
                +prevTen[6]+", "+prevTen[7]+", "+prevTen[8]+", "+prevTen[9]); */
        
        //Casting the second value, the actual high score, to an integer variable
        //(Must be integer for comparison purposes later
        int hS = Integer.parseInt(arrContent[2]);
        
        hiScore = hS;
        
        //Only returning the second value, the high score number itself
        return hS;
    }
    
    //Update High Score - This runs each time your score increases past the
    //current high score. It updates the value on the form and in the file,
    //but it does NOT update the previous 10 scores on the file.
    public static void updateHS(int scr) throws IOException{
        if (hiScore<scr){
            hiScore=scr;
            //Now, we replace the entire contents of the file, 
            //only replacing the high score with the new one.
        }    
        try (PrintWriter fileOut = new PrintWriter(new FileWriter(
            "C:\\Users\\hu765630\\OneDrive - Wellington Catholic District School Board\\Documents\\NetBeansProjects\\SimonSays\\highScore.txt"))) {
            fileOut.print("High Score: "+hiScore+" \n"
            +" \n"+"Game Records \n"+"------------ \n"
            +"1. "+pTen[0]+" \n"
            +"2. "+pTen[1]+" \n"
            +"3. "+pTen[2]+" \n"
            +"4. "+pTen[3]+" \n"
            +"5. "+pTen[4]+" \n"
            +"6. "+pTen[5]+" \n"
            +"7. "+pTen[6]+" \n"
            +"8. "+pTen[7]+" \n"
            +"9. "+pTen[8]+" \n"
            +"10. "+pTen[9]+" ");
            fileOut.close();
        }
    }
    
    //Write Scores - This runs when the game ends; when the player makes
    //a mistake. It updates the current high score AND updates the previous
    //10 scores on the file.
    public static void writeScores(int scr) throws IOException{
        //Firstly it moves the positions of each of the
        //previous ten scores. Then it updates the high scores.
        for (int i=9; i>0; i--){
            pTen[i]=pTen[i-1];
        }
        pTen[0]=String.valueOf(scr);
        updateHS(scr);
    }
    
}