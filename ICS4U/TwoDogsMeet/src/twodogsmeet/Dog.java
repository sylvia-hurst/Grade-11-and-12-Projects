/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twodogsmeet;

/**
 *
 * @author hu765630
 */
public class Dog {
    
    /*
    This class creates Dog objects and
    sets, changes, and displays values.
    Dogs have five properties:
    Name, breed, age, aggression, and hunger.
    */
    
    //Variable declarations
    private final String dogName;
    private final String dogBreed;
    private final int age;
    private int aggression, hunger;

    //Dog constructor
    public Dog(String dgName, String dgBreed){
        //Takes the inputted name and breed and sets random other values
        dogName = dgName;
        dogBreed = dgBreed;
        age = (int)(Math.random()*10)+1;
        aggression = (int)(Math.random()*10)+1;
        hunger = (int)(Math.random()*10)+1;
    }

    //Methods to change data
    public void setAggression(int dogAgg){
        aggression = dogAgg;
    }

    public void setHunger(int dogHung){
        hunger = dogHung;
    }
    
    //Methods to access data
    public String getName() {
        return dogName;
    }
    
    public String getBreed() {
        return dogBreed;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getAggression() {
        return aggression;
    }
    
    public int getHunger() {
        return hunger;
    }

    //Barks
    public void barkFriendly() {
        System.out.print("Woof! Woof!");
    }

    public void barkAngry() {
        System.out.print("GRR! BARK!");
    }

    //Method to output Dog data

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        //Places everything into a String
        String output = "Name: " + dogName + "\n";
        output += "Breed: " + dogBreed + "\n";
        output += "Age: " + age + "\n";
        output += "Aggression: " + aggression + "\n";
        output += "Hunger: " + hunger;
        return output;
    }
    
}
