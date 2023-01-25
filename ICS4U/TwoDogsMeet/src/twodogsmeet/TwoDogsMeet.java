/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twodogsmeet;
import java.util.Scanner;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course: ICS
 * Start Date: October 13, 2020
 * End Date: October 13, 2020
 * Description: Simulates a meeting between two dogs
 * who have different aggression and hunger values
 * that determine the outcome of the meeting.
 */
public class TwoDogsMeet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        1. Output to the screen that two dogs will be created.
        2. User inputs name and breed of both dogs.
        3. Constructors are called to build the two dogs.
        Age, aggression and hunger values are randomly assigned.
        4. Dog information is displayed.
        5. Prompts user to confirm or change aggression/hunger.
        6. Simulates a meeting between the dogs, using both
        aggression and hunger values to determine the result.
        */
        
        //Scanner object
        Scanner kI = new Scanner(System.in);
        
        //Temp input variables
        String dog1n, dog1b, dog2n, dog2b, input;
        
        //Initial message
        System.out.println("TWO DOGS MEET\n-------------\n\n"
            + "This program will create two dogs and simulate an interaction between them.\n"
            + "Please input the name and breed for the two dogs.\n");
        
        //Taking input
        System.out.print("Dog #1's Name: ");
        dog1n = kI.nextLine();
        System.out.print("Dog #1's Breed: ");
        dog1b = kI.nextLine();
        System.out.print("Dog #2's Name: ");
        dog2n = kI.nextLine();
        System.out.print("Dog #2's Breed: ");
        dog2b = kI.nextLine();
        
        //Constructing the two dogs
        Dog dog1 = new Dog(dog1n, dog1b);
        Dog dog2 = new Dog(dog2n, dog2b);
        
        //Displaying dog information
        System.out.println("");
        System.out.println(dog1);
        System.out.println("");
        System.out.println(dog2);
        System.out.println("");
        
        //Asks user if they're okay with the values or not
        //If the user doesn't say "OK" then they will input every agg/hung themself.
        System.out.println("Are you OK with the aggression and hunger values?");
        System.out.print("Type \"OK\" to accept this data, or anything else to change this data: ");
        input = kI.nextLine();
        
        if (!input.equalsIgnoreCase("OK")){
            //Changing data
            try {
                System.out.print("Dog #1's Aggression: ");
                dog1.setAggression(Integer.parseInt(kI.nextLine()));
                System.out.print("Dog #1's Hunger: ");
                dog1.setHunger(Integer.parseInt(kI.nextLine()));
                System.out.print("Dog #2's Aggression: ");
                dog2.setAggression(Integer.parseInt(kI.nextLine()));
                System.out.print("Dog #2's Hunger: ");
                dog2.setHunger(Integer.parseInt(kI.nextLine()));
                System.out.println("Updating data...");
            } catch (NumberFormatException e) {
                System.out.println("\nInvalid input. Remaining data will use previously assigned values.");
            }
            
            //Reprinting data
            System.out.println("");
            System.out.println(dog1);
            System.out.println("");
            System.out.println(dog2);
            System.out.println("");
        }
        
        //Data confirmation complete
        System.out.println("Data confirmed. Beginning simulation.\n");
        
        //Simulation
        
        //Meeting message
        System.out.println("Welcome to the dog-meeting simulator!\n"
            +dog1.getName()+", the "+dog1.getAge()+"-year-old "+dog1.getBreed()+" meets "
            +dog2.getName()+", the "+dog2.getAge()+"-year-old "+dog2.getBreed()+"!\n");
        
        //Dog 1 speaks
        System.out.print(dog1.getName()+": ");
        //Determining bark results based on aggression and hunger
        if ((dog1.getAggression()>5&&dog1.getHunger()>5)||(dog1.getAggression()>7||dog1.getHunger()>7)){
            //Bark angry
            //Combination of aggression AND hunger makes dog angry, or...
            //Aggression OR hunger is too extreme for friendly interaction
            dog1.barkAngry();
        }
        else {
            //Bark friendly, stats are not too extreme
            dog1.barkFriendly();
        }
        
        System.out.println("");
        
        //Dog 2 speaks (same code as dog 1)
        System.out.print(dog2.getName()+": ");
        //Determining bark results based on aggression and hunger
        if ((dog2.getAggression()>5&&dog2.getHunger()>5)||(dog2.getAggression()>7||dog2.getHunger()>7)){
            //Bark angry
            //Combination of aggression AND hunger makes dog angry, or...
            //Aggression OR hunger is too extreme for friendly interaction
            dog2.barkAngry();
        }
        else {
            //Bark friendly, stats are not too extreme
            dog2.barkFriendly();
        }
        
        System.out.println("");
        
    }
    
}
