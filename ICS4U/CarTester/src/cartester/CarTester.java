/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;
import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course: ICS
 * Start Date: October 1, 2020
 * End Date: October 2, 2020
 * Description: Asks the user to make three different cars.
 * The property variables for the cars are:
 * String make; String model; int year; int price; String colour; boolean shiny;
 * 7 constructors exist for having 0-6 (ordered) data pieces to give.
 * For example, when the make, model and year are given, the price,
 * colour and shininess will be randomly generated to fill in the spaces.
 * If at any time invalid parameters are entered, a
 * completely random car will be generated instead.
 * The car data then gets outputted to the user, along with a honk of the horn.
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variable declarations
        int counter = 3;
        int counter2 = 1;
        
        while (counter>0) {
            //Keeping track of the car #
            System.out.println("Car #"+counter2+":");
            try {
                //Input string
                String[] input1 = ((JOptionPane.showInputDialog(null,
                            "Cars remaining: "+counter+"\n"
                            + "Please enter data for the car in this order:\n"
                            + "Make, Model, Year(int), Price(int), Colour, Shininess(true/false)\n"
                            + "Separate properties with spaces.\n"
                            + "Feel free to leave properties blank if they're at the end of the list.",
                            "Car Tester",
                            JOptionPane.INFORMATION_MESSAGE))).split(" ");

                //Casts the String array to an ArrayList so I can use the .size() method
                List<String> inputA = new ArrayList<>();
                Collections.addAll(inputA, input1);
                
                //If the input is blank, the car is randomized
                if (inputA.get(0).equals("")){
                    System.out.println("Missing data. Randomizing car.\n");
                    Car car1 = new Car();
                    System.out.println(car1);
                    car1.honk();
                } else {
                    //Depending on the # of properties entered, a different constructor will be called
                    //Each case does 3 things: Set up the car, print out the car details, and honk the horn
                    switch (inputA.size()) {
                        case 6:
                            {
                                Car car1 = new Car(inputA.get(0), inputA.get(1), Integer.parseInt(inputA.get(2)), Integer.parseInt(inputA.get(3)), inputA.get(4), Boolean.valueOf(inputA.get(5)));
                                System.out.println(car1.toString());
                                car1.honk();
                                break;
                            }
                        case 5:
                            {
                                Car car1 = new Car(inputA.get(0), inputA.get(1), Integer.parseInt(inputA.get(2)), Integer.parseInt(inputA.get(3)), inputA.get(4));
                                System.out.println(car1.toString());
                                car1.honk();
                                break;
                            }
                        case 4:
                            {
                                Car car1 = new Car(inputA.get(0), inputA.get(1), Integer.parseInt(inputA.get(2)), Integer.parseInt(inputA.get(3)));
                                System.out.println(car1.toString());
                                car1.honk();
                                break;
                            }
                        case 3:
                            {
                                Car car1 = new Car(inputA.get(0), inputA.get(1), Integer.parseInt(inputA.get(2)));
                                System.out.println(car1.toString());
                                car1.honk();
                                break;
                            }
                        case 2:
                            {
                                Car car1 = new Car(inputA.get(0), inputA.get(1));
                                System.out.println(car1.toString());
                                car1.honk();
                                break;
                            }
                        case 1:
                            {
                                Car car1 = new Car(inputA.get(0));
                                System.out.println(car1.toString());
                                car1.honk();
                                break;
                            }
                    }
                }
            } catch (NumberFormatException | NullPointerException e) {
                    //Catches invalid data entry and instead randomizes the car properties
                    System.out.println("Invalid data. Randomizing car.\n");
                    Car car1 = new Car();
                    System.out.println(car1);
                    car1.honk();
            }
            
            //Counting down for displaying the # of cars remaining
            //Counting up for displaying the current car #
            counter--;
            counter2++;
        
        }
        
    }

}
