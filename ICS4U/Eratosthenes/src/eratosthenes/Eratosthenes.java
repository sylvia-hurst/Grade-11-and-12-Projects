/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eratosthenes;
import java.util.ArrayList;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course: ICS
 * Start Date: September 28, 2020
 * End Date: September 28, 2020
 * Description: Prints out all prime numbers from 1-1000
 * using an algorithm to detect prime numbers and only print primes.
 */
public class Eratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variable declarations
        
        //Array list to hold prime numbers
        //Each new number is divided by every previous prime
        //And if no factors are found, it is a new prime
        ArrayList<Integer> primes = new ArrayList<>();
        
        //Simple boolean to temporarily store an individual number's validity of being prime
        boolean valid = true;
        
        //Printing the results
        System.out.println("The prime numbers from 1-1000 are:");
        for (int i=2;i<1000;i++){
            if (i==2) {
                primes.add(i);
                System.out.print(i+" ");
            }
            else {
                for (int j=0; j<primes.size();j++) {
                    if (i%primes.get(j)==0) {
                        valid=false;
                    }
                }
                if (valid==true) {
                    primes.add(i);
                    System.out.print(i+" ");
                }
                valid = true;
            }
        }
        
    }

}
