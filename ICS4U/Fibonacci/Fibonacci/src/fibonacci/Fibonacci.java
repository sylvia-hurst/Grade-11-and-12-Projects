/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonacci;
import java.util.Scanner;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course: ICS
 * Start Date: October 30, 2020
 * End Date: October 30, 2020
 * Description: Fibonacci sequence using a recursive algorithm.
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner kI = new Scanner(System.in); //Scanner object
        
        int pos = 0; //pos/p = position
        
        while (true) {
            try {
                System.out.print("Enter a Fibonacci position: ");
                pos = Integer.parseInt(kI.nextLine());
                if (pos < 1){
                    System.err.println("Enter a positive integer.");
                } else {
                    break;
                }
            } catch (NumberFormatException e){
                System.err.println("Enter a positive integer.");
            }
        }
        
        //Output
        System.out.println("The Fibonacci number at position "+pos+" is: "+fib(pos, 1, 1, 1, 1));
        
    }
    
    //Recursive algorithm
    public static int fib(int p, int f, int s, int l, int n){
        if (p==s) {
            //Ends when the number of stacks equals the specified position
            return f;
        } else {
            s++; //# of stacks increases
            l=f; //last fibonacci number
            f=n; //current fibonacci number
            //n becomes the new fibonacci number and then l and f are moved up
            return fib(p, f, s, l, f+l);
        }
    }
    
}
