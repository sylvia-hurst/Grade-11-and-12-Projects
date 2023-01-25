/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg20191031_swyk;
import java.util.Scanner;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course Code: ICS
 * Start Date: October 31, 2019
 * End Date: November 5, 2019
 * Description: A show-what-you-know program containing for loops and arrays.
 * 
 * This program is a quiz with guess-that-animal questions.
 * There is an array filled with 10 questions, and an array filled with 10 corresponding answers (in letter value).
 * The program will randomly take a question from the array and ask it to the user.
 * The user will input their answer (in a multiple choice fashion) and the answer will be displayed to them.
 * Score will be kept for fun. If you get all the questions right, you get a special message at the end.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner kI = new Scanner (System.in); //Scanner for keyed input
        int randNum; //Random number that decides which question is asked
        String uI; //Variable for user input that determines whether or not their answer is correct
        int score = 0; //Score variable
        int counter = 0; //Counts the question # for displaying in the interface
        final int max = 10; //Maximum value for # of questions or # of possible correct answers
        
        //Array containing String values for each possible question
        //Each is initialized on a different line for the sake of organization
        String [] questions = new String [20];
        
        questions [0] = "I am green, slimy and have a long tongue. What am I?"
                + " Am I (A) a chameleon? (B) a frog? (C) a salamander? Or (D) a crocodile?";
        
        questions [1] = "I am beige with brown spots, and I have a long neck. What am I?"
                + " Am I (A) a saiga? (B) a gazelle? (C) a moose? Or (D) a giraffe?";
        
        questions [2] = "I have no legs, so I slither to move. What am I?"
                + " Am I (A) a snake? (B) a worm? (C) a slug? Or (D) a fish?";
        
        questions [3] = "I am very small and slow, but I have a shell to protect me. What am I?"
                + " Am I (A) a crab? (B) a nautilus? (C) a snail? Or (D) a tortoise?";
        
        questions [4] = "I am the fastest running land mammal. What am I?"
                + " Am I (A) a cheetah? (B) a wildebeest? (C) a lion? Or (D) a peregrine falcon?";
        
        questions [5] = "I am a bird, but I love to swim in the cold Antarctic waters! What am I?"
                + " Am I (A) a pelican? (B) a seagull? (C) a pigeon? Or (D) a penguin?";
        
        questions [6] = "I have eight arms and a beak, and I live underwater. What am I?"
                + " Am I (A) a squid? (B) an octopus ? (C) a spider? Or (D) a puffin?";
        
        questions [7] = "I am the largest of all living animals today. What am I?"
                + " Am I (A) an elephant? (B) a polar bear? (C) a blue whale? Or (D) a kraken?";
        
        questions [8] = "I have antlers, and I am known for helping Santa pull his sleigh. What am I?"
                + " Am I (A) a raindeer? (B) a caribou? (C) a antelope? Or (D) a reindeer?";
        
        questions [9] = "I reproduce quickly, and I am known to hide eggs for children to find. What am I?"
                + " Am I (A) a rabbit? (B) a squirrel? (C) a chicken? Or (D) a chipmunk?";
        
        //Correct answers: (1) Frog, (2) Giraffe, (3) Snake, (4) Snail, (5) Cheetah, (6) Penguin, (7) Octopus, (8) Blue Whale, (9) Reindeer, (10) Rabbit
        
        //Array containing String values for correct multiple choice answers, each corresponding to the questions above
        String [] answers = {"B", "D", "A", "C", "A", "D", "B", "C", "D", "A"};
        
        //Incorrect answers: (1) Chameleon, Salamander, Crocodile; (2) Saiga, Gazelle, Moose; (3) Worm, Slug, Fish; (4) Crab, Nautilus, Tortoise; (5) Wildebeest, Lion, Peregrine Falcon;
        //(6) Pelican, Seagull, Pigeon; (7) Squid, Spider, Puffin;(8) Elephant, Polar Bear, Kraken; (9) Raindeer, Caribou, Antelope; (10) Squirrel, Chicken, Chipmunk
        
        //QUIZ START
        
        //This for loop runs for exactly 10 times so that each question can be asked to the user
        for (int i=0;i<max;i++)
        {
        //Selecting a random number for the question
        do {
            randNum = (int)Math.round(Math.random()*9);
        }while(" ".equals(questions[randNum]));
        //This loops until it reaches a value that was not already used (used values get replaced with an empty space)
        
        //Displays the question number
        counter++;
        System.out.println("Question " + counter);
        //Outputs the random question to the user and asks for their answer
        //User has to input the capital letter for the answer due to how the answer values are stored in an array
        System.out.println(questions[randNum]);
        System.out.println("");
        System.out.print("Enter your answer: ");
        uI = kI.nextLine();

        //If statement that determines whether or not the user was correct
        //If the user was correct, the score value increases
        if (uI.equals(answers [randNum]))
        {
            System.out.println("Correct!");
            System.out.println("");
            score++;
        }
        else
        {
            System.out.println("Incorrect!");
            System.out.println("");
        }
        //Closing the used question so that it does not appear again
        questions[randNum] = " ";
        }
        
        //Concluding messages
        System.out.println("Quiz complete! Your final score is " + score + " out of 10.");
        
        //Special message that appears if all questions were answered correctly
        if (score==max)
            System.out.println("You got all questions correct! Well done!");
        
    }

}
