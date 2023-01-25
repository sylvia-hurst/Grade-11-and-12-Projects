/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartester;

/**
 *
 * @author hu765630
 */
public class Car {
    
    //Variable declarations
    static String make, model, colour;
    static int year, price;
    static boolean shiny;
    
    //CAR CONSTRUCTORS
    
    //Incorrect parameters - default constructor that
    //randomly assigns all property values to the car
    public Car(){
        
        /*
        List for random makes/models:
        Ford: Mustang, F-Series, Explorer, Escape, Focus
        Honda: Accord, Civic, Fit, Odyssey, Pilot
        Toyota: Camry, Corolla, Highlander, Tundra, Tacoma
        Jeep: Cherokee, Wrangler, Renegade, Gladiator, Compass
        */
        
        String modelRand[][] = new String[4][5];
        
        //Ford
        modelRand[0][0] = "Mustang";
        modelRand[0][1] = "F-Series";
        modelRand[0][2] = "Explorer";
        modelRand[0][3] = "Escape";
        modelRand[0][4] = "Focus";
        
        //Honda
        modelRand[1][0] = "Accord";
        modelRand[1][1] = "Civic";
        modelRand[1][2] = "Fit";
        modelRand[1][3] = "Odyssey";
        modelRand[1][4] = "Pilot";
        
        //Toyota
        modelRand[2][0] = "Camry";
        modelRand[2][1] = "Corolla";
        modelRand[2][2] = "Highlander";
        modelRand[2][3] = "Tundra";
        modelRand[2][4] = "Tacoma";
        
        //Jeep
        modelRand[3][0] = "Cherokee";
        modelRand[3][1] = "Wrangler";
        modelRand[3][2] = "Renegade";
        modelRand[3][3] = "Gladiator";
        modelRand[3][4] = "Compass";
        
        //Random selection
        int rand1 = (int)(Math.random()*3);
        int rand2 = (int)(Math.random()*4);
        
        //Assigning results
        switch (rand1){
            case 0:
                make = "Ford";
                break;
            case 1:
                make = "Honda";
                break;
            case 2:
                make = "Toyota";
                break;
            case 3:
                make = "Jeep";
                break;
        }
        
        model = modelRand[rand1][rand2];

        //Everything else uses its own little function
        year = getYear();
        price = getPrice();
        colour = getColour();
        shiny = getShiny();
    }
    
    //If the user only inputs the make and nothing else,
    //the model will be given the default value "Unknown"
    //And the rest of the values are randomly generated
    public Car(String mk){
        make = mk;
        model = "Unknown";
        year = getYear();
        price = getPrice();
        colour = getColour();
        shiny = getShiny();
    }
    
    //If the user inputs the make and the model
    public Car(String mk, String mdl){
        make = mk;
        model = mdl;
        year = getYear();
        price = getPrice();
        colour = getColour();
        shiny = getShiny();
    }
    
    //If the user inputs the make, model and year
    public Car(String mk, String mdl, int yr){
        make = mk;
        model = mdl;
        year = yr;
        price = getPrice();
        colour = getColour();
        shiny = getShiny();
    }
    
    //If the user inputs the make, model, year, and price
    public Car(String mk, String mdl, int yr, int pr){
        make = mk;
        model = mdl;
        year = yr;
        price = pr;
        colour = getColour();
        shiny = getShiny();
    }
    
    //If the user inputs the make, model, year, price and colour
    public Car(String mk, String mdl, int yr, int pr, String clr){
        make = mk;
        model = mdl;
        year = yr;
        price = pr;
        colour = clr;
        shiny = getShiny();
    }
    
    //If the user inputs the make, model, year, price, colour and shininess
    public Car(String mk, String mdl, int yr, int pr, String clr, boolean sh){
        make = mk;
        model = mdl;
        year = yr;
        price = pr;
        colour = clr;
        shiny = sh;
    }

    //RANDOM SELECTION METHODS - Reused in multiple other constructors
    
    //Random year from 1995-2020
    public static int getYear(){
        int yr = (int)(Math.random()*25+1995);
        return yr;
    }
    
    //Random price from $10,000 to $50,000
    public static int getPrice(){
        int pr = (int)(Math.random()*40000+10000);
        return pr;
    }
    
    //Random colour from 12 colour options
    public static String getColour(){
        String[] colours = {"Pink", "Red", "Orange", "Yellow", "Green", "Lime", "Blue", "Cyan", "Purple", "Brown", "White", "Black"};
        int rand = (int)(Math.random()*12);
        String clr = colours[rand];
        return clr;
    }
    
    //Random true/false value for shininess
    public static boolean getShiny(){
        boolean sh = (int)(Math.random()*2+1)==1;
        return sh;
    }
    
    //OUTPUT METHODS
    
    //Data output

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        String output = "Make: "+make+"\n"
                        + "Model: "+model+"\n"
                        + "Year: "+year+"\n"
                        + "Price: $"+price+".00\n"
                        + "Colour: "+colour+"\n"
                        + "Shiny: "+shiny+"\n";
        return output;
    }
    
    //Honk method (random from 4 potential honk sounds)
    public void honk(){
        int random = (int)(Math.random()*4+1);
        switch (random){
            case 1:
                System.out.println("BEEP BEEP!\n");
                break;
            case 2:
                System.out.println("BEEEP!\n");
                break;
            case 3:
                System.out.println("HONK HONK!\n");
                break;
            case 4:
                System.out.println("HOOONK!\n");
                break;
        }
    }
    
}
