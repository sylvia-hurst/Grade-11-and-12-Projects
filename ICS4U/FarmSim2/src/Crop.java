/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hu765630
 */
public class Crop {
    
    /* This class constructs Crop objects for each plant.
    Each plant has the final stat variables for it:
    ripePoint, hydration, yMin, yMax
    And the changing variables for it:
    ripe, ripeLvl, moist
    
    These variables only change if the crop is replaced.
    */
    
    //Variables:
    int ripe;           //0-2
    double ripeLvl;     //Meter
    int ripePoint;      //Goal for the meter
    int moist;          //0-2
    int moistCount;     //Counts days until the plant becomes dry
    int hydration;      //# of days the plant stays moist
    int yMin;           //Yield min
    int yMax;           //Yield max
    int collection;     //Amount collected
    
    //Constructor
    public Crop(int rP, int h, int yMi, int yMa){
        ripe = 0;
        ripeLvl = 0;
        ripePoint = rP;
        moist = 0;
        moistCount = 0;
        hydration = h;
        yMin = yMi;
        yMax = yMa;
        collection = 0;
    }
    
    //Ripening calculation
    public void calcRipeness(int moistness, int days){
        //If ripe/overripe the previous day
        if (ripeLvl>=ripePoint){
            ripe = 2;
        //If underripe the previous day
        } else {
            //Only ripens if the plant was moist and it wasn't cloudy
            if (moistness==1&&FrmFarmSim.cloudy==false){
                ripeLvl += 0.1*days + (int)(Math.random()*2+1);
            }
            if (ripeLvl>=ripePoint){
                ripe = 1;
            }
        }
    }
    
    //Moisture calculation
    public void calcMoisture(int moistness){
        //If wet the previous day
        if (moistness==2){
            moist=1;
            moistCount=0;
        //If moist the previous day
        } else if (moistness==1){
            moist=1;
            moistCount++;
            if (moistCount==hydration){
                moist=0;
                moistCount=0;
            }
        }
        //Nothing happens if the plant is dry
    }
    
    //Harvesting
    public void harvest(){
        //If ripe, the amount collected goes up
        if (ripe==1){
            collection = (int)(Math.random()*(yMax-yMin))+yMin;
        } else {
            collection = 0;
        }
        //Regardless of the ripeness, the produce is reset
        ripeLvl=0;
        ripe=0;
    }
    
    //Resetting moisture count variable when the weather
    //is Blazing Sun or Rain Storm
    public void resetMoistCount(){
        moistCount=0;
    }
    
    //Accessing ripeness value
    public int getRipeness(){
        return ripe;
    }
    
    //Accessing moisture value
    public int getMoisture(){
        return moist;
    }
    
    //Accessing collected variable
    public int getCollected(){
        return collection;
    }
    
}
