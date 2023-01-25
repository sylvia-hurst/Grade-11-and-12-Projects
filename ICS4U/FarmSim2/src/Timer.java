/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sylvi
 * 
 * This class contains all the code related to the timer embedded
 * in the GUI. It will continuously run once the game begins,
 * until the game ends. Thank you Mr. Yeung for your help!
 * 
 */
public class Timer {
    
    //Variable declarations
    static boolean timerState = false;
    static long startTime = 0;
    static long elapsedTime = 0;
    static long elapsedMillis = 0;
    static long elapsedSeconds = 0;
    static long secondsDisplay = 0;
    static long elapsedMinutes = 0;
    
    public static void startTimer() {
        startTime = System.currentTimeMillis();
        Timer.timerState = true;
        Runnable thread = new Runnable() {
            public void run() {
                do {
                    elapsedTime = System.currentTimeMillis() - startTime;
                    elapsedMillis = elapsedTime % 1000;
                    elapsedSeconds = elapsedTime / 1000;
                    secondsDisplay = elapsedSeconds % 60;
                    elapsedMinutes = elapsedSeconds / 60;
                    FrmFarmSim.lblTimer.setText(String.valueOf(String.format("Total Time Elapsed: "+"%02d", elapsedMinutes) + ":" + String.format("%02d", secondsDisplay) + ":" + String.format("%03d", elapsedMillis)));
                } while (timerState);
            }
        };
        new Thread(thread).start();
    }
    
}
