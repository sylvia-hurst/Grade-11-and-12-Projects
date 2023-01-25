/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gameoflife;
import javax.swing.JOptionPane;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course: ICS
 * Start Date: September 30, 2020
 * End Date: September 30, 2020
 * Description: Simulates Conway's Game Of Life.
 * 1. Any live cell with two or three live neighbours survives.
 * 2. Any dead cell with three live neighbours becomes a live cell.
 * 3. All other live cells die in the next generation. Similarly, all other dead cells stay dead.
 * I will be using a '-' to represent a dead cell and a 'O' to represent a live cell.
 */
public class GameOfLife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variable declarations
        
        //Grids: One for outputting, one for applying changes for a
        //new generation before slapping the data back onto the first grid
        char grid1[][] = new char[20][20];
        char grid2[][] = new char[20][20];
        
        //Random numbers to initialize the grid
        int rand1;
        int rand2;
        
        //Starting number of live cells and live cell counter
        int live;
        
        //Neighbours alive counter
        int nbCount = 0;
        
        //Counting the number of generations
        int gen = 1;
        
        //Getting the starter number as input from the user
        try {
            //Input window
            live = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "There are 400 cells.\n"
                    + "How many live cells would you like to begin with?",
                    "Game of Life",
                    JOptionPane.INFORMATION_MESSAGE));
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Invalid input. Exiting game.");
            return;
        }
        
        //Creates the first generation
        
        //Starts by filling the entire grid with '-'s
        for (int Y=0;Y<20;Y++){
            for (int X=0;X<20;X++){
                grid1[Y][X]='-';
            }
        }
        
        //Randomly selects grid spaces to replace with 'O's
        //Checks that the space isn't already a 'O' before replacing
        for (int i=0;i<live;i++){
            do {
                rand1 = (int)(Math.random()*19);
                rand2 = (int)(Math.random()*19);
            } while (grid1[rand1][rand2]=='O');
            grid1[rand1][rand2]='O';
        }
        
        //Prints out the starting grid
        System.out.println("GAME OF LIFE\n------------\n\nGeneration 1:");
        for (int Y=0;Y<20;Y++){
            for (int X=0;X<20;X++){
                System.out.print(grid1[Y][X]+" ");
            }
            System.out.print("\n");
        }
        
        //Asks if you want to continue or not
        while (true) {
            //Asks user to confirm if they want to continue. If NO, then the game ends
            if (JOptionPane.showConfirmDialog(null, "Continue?", "Game Of Life",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
                System.out.println("Exiting game.");
                return;
            }
            
            //Starts a new generation
            
            /*  
            Each cell (minus edge ones) have eight neighbours:
                1. grid1[Y-1][X]
                2. grid1[Y-1][X-1]
                3. grid1[Y-1][X+1]
                4. grid1[Y][X-1]
                5. grid1[Y][X+1]
                6. grid1[Y+1][X]
                7. grid1[Y+1][X-1]
                8. grid1[Y+1][X+1]
            
            The goal is to check every one of these neighbours for every
            single cell, to determine if the cell should change state.
            
            If the Y/row index is 0, neighbours 1, 2 and 3 must be skipped.
            If the Y/row index is 19, neighbours 6, 7 and 8 must be skipped.
            If the X/col index is 0, neighbours 2, 4 and 7 must be skipped.
            If the X/col index is 19, neighbours 3, 5 and 8 must be skipped.
            
            Note: (0,0) is at the top left corner and (19, 19) is at the bottom right corner.
            
            The program will run a check of the valid neighbours and count the
            number of living neighbours. Then, using that number and the state
            of the target cell, it will cast either a '-' or a 'O' to grid2. At
            the end of the process, grid2's values will be transferred to grid1.
            */
            
            //Counting the number of alive neighbours
            for (int Y=0;Y<20;Y++){
                for (int X=0;X<20;X++) {
                    if (Y!=0) {
                        //Check #1
                        if (grid1[Y-1][X]=='O')
                            nbCount++;
                    }
                    if (Y!=0&&X!=0) {
                        //Check #2
                        if (grid1[Y-1][X-1]=='O')
                            nbCount++;
                    }
                    if (Y!=0&&X!=19) {
                        //Check #3
                        if (grid1[Y-1][X+1]=='O')
                            nbCount++;
                    }
                    if (X!=0) {
                        //Check #4
                        if (grid1[Y][X-1]=='O')
                            nbCount++;
                    }
                    if (X!=19) {
                        //Check #5
                        if (grid1[Y][X+1]=='O')
                            nbCount++;
                    }
                    if (Y!=19) {
                        //Check #6
                        if (grid1[Y+1][X]=='O')
                            nbCount++;
                    }
                    if (Y!=19&&X!=0) {
                        //Check #7
                        if (grid1[Y+1][X-1]=='O')
                            nbCount++;
                    }
                    if (Y!=19&&X!=19) {
                        //Check #8
                        if (grid1[Y+1][X+1]=='O')
                            nbCount++;
                    }
                    
                    //Determining the result of the cell
                    if (grid1[Y][X]=='-'&&nbCount==3){
                        grid2[Y][X]='O';
                    }
                    else if (grid1[Y][X]=='O'&&(nbCount<2||nbCount>3)){
                        grid2[Y][X]='-';
                    }
                    else {
                        grid2[Y][X]=grid1[Y][X];
                    }
                    
                    nbCount = 0;
                }
            }
            
            //Re-applying to the main grid
            grid1=grid2;
            
            //Re-printing the grid
            gen++;
            System.out.println("Generation "+gen+":");
            for (int Y=0;Y<20;Y++){
                for (int X=0;X<20;X++){
                    System.out.print(grid1[Y][X]+" ");
                }
                System.out.print("\n");
            }
            
        }
        
    }

}
