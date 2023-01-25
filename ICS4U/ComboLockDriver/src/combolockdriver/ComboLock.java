/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combolockdriver;

/**
 *
 * @author hu765630
 */
public class ComboLock {
    
    //Place to construct combination locks
    
    //Variable declarations
    private final int num1, num2, num3;
    
    //Constructor for user-inputted combo lock
    public ComboLock(int n1, int n2, int n3) {
        num1 = n1;
        num2 = n2;
        num3 = n3;
    }
    
    //Constructor for randomly-generated combo lock
    public ComboLock() {
        num1 = (int)(Math.random()*3)+1;
        num2 = (int)(Math.random()*3)+1;
        num3 = (int)(Math.random()*3)+1;
    }
    
    //Methods to access ComboLock number data
    public int getNum1() {
        return num1;
    }
    
    public int getNum2() {
        return num2;
    }
    
    public int getNum3() {
        return num3;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String output = "Combination: "
        +num1+" "+num2+" "+num3;
        return output;
    }
    
}
