/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course: ICS
 * Start Date: January 6, 2020
 * End Date: January 22, 2020
 * Description: Culminating project - D&D style fighting with dice rolls, elemental weaknesses, and more.
 */

/*

You are given two element types and fight a series of enemies in turn-based combat.
You and your enemy's primary element determines strengths/weaknesses.
Enemy elements are not displayed; you must figure this out on your own.
Note that enemy element types usually correspond to their design/name.
For example, slimes are water-based and skeletons are earth-based.
The game continues until you run out of HP (Hit Points), you defeat all 10 enemies, or you hit "END".
As you play, your score will increase. Every defeated enemy is 1 point.
At the end of the game, if your score exceeds the current high score, it will replace that high score on the text file.
The high score taken from the text file is displayed each time the "START" button is pressed.

Combat works with four different action options. You can defend, physical attack, or use one of your two elements.
Whenever you attack, you must first roll a d20 to see if your attack hits.
If your roll exceeds your opponent's AC (Armour Class), you will hit.
Then you roll additional dice (depending on the type of attack) to determine the damage.
Enemies have progressively higher AC whlie the player always has an AC of 5.

Defending makes it so any attack you receive during the opponent's next turn will be rolled with dice half as strong.
There is a one turn cooldown for defending, but if used wisely, you may be able to trick your enemy into wasting their MP.
Physical attack is an easy way to attack without having to worry about elemental strengths and weaknesses.
Elemental attacks are a gamble, unless you have figured out your opponent's weakness.
Each element has one other element they resist, and one other element they are weak to.
If you can strike an opponent's weakness, you will roll double dice.
If you use the element they resist, you will roll a die half as strong as normal.
Additionally, if they are defending while you use an element they resist, they will completely block the attack.

Elemental attacks naturally deal more damage than physical attacks, but it costs MP to use them, unlike physicals.
You begin with a maximum of 3 MP, each elemental attack uses 1 MP, and it takes 3 turns to restore 1 MP.
So, it takes a bit of strategy to be able to use elemental attacks effectively.

Elements: Fire > Nature > Earth > Electricity > Ice > Water > Fire

Watch out for the AI! Enemies are programmed to use elemental attacks if they sense your weakness,
and they will be sure to defend if they sense you can strike their weakness as well.
Note that they will never defend two turns in a row, and they are limited to 3 elemental attacks per game.

Good luck!

*/

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FrmDnD extends javax.swing.JFrame {
    
    //VARIABLE DECLARATIONS:
    
    //File Reader and Writer objects
    public static FileReader in = null;
    public static FileWriter out = null;

    //Array to hold String values for each action (used for labels)
    public static String actNames[] = {"Defend", "Physical", "Inferno", "Tangle", "Earthquake", "Lightning", "Blizzard", "Tsunami"};
    
    //Array to hold String values for each element (used for labels)
    public static String eleNames[] = {"", "Water", "Fire", "Nature", "Earth", "Electricity", "Ice", "Water"};
    
    //Standard validity check to control game start / end button and next button
    public static boolean valid = false, cont = false, cont2 = false;
    
    //Holds a value from 2 - 7 based on the given elements. PLAYER: 1 & 2. OPPONENT: 3 & 4.
    public static int element1, element2, element3, element4;
    
    //Holds a value from 0 - 7 (copies from element int OR takes 0 or 1 from button press) to use for the action
    public static int pAct, oAct;
    
    //Armour class of the player and the opponent (Roll a d20 and if it exceeds the AC, your attack hits)
    public static int pAC = 5, oAC;
    
    //Holds true or false as to whether or not the player or opponent are defending
    public static boolean pDef = false, oDef = false;
    
    //Holds an integer to determine the Defend action cooldown
    //It is set to 2 when the Defend action is taken, and reduced by 1 for each successive turn
    //Only when it is BELOW 1 will the Defend action be available. If not, a message is displayed stating it's on cooldown.
    public static int pDefCount = 0, oDefCount = 0;
    
    //Counter for how many magical attacks the opponent has used (they get a max of 3)
    public static int oMagic = 0;
    
    //Counter for the MP recharge for the player
    public static int pMagic = 0;
    
    //Counter for the current MP of the player
    public static int MP = 3;
    
    //Integers to store attack values and such
    public static int d20, d12, d8, d6, d4, pAtk, oAtk, pHP, oHP;
    
    //A counter value to keep track of which opponent needs to be displayed next
    public static int oppCount = 1;
    
    //Vowel array and consonant array
    public static char vowels[] = {'a', 'e', 'i', 'o', 'u'};
    public static char consonants[] = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
    
    //Array used to store characters used for the randomized exclamation a monster shouts as it dies
    public static char blergh[] = new char[6];
    
    //Score
    public static int score, highS;
    
    //METHODS:
    
    //getOpp - This uses a counter to determine which opponent the player faces next and displays the information to the form.
    //Other code will determine when the opponent has fallen to 0 HP and must be replaced by a new opponent.
    //Additionally, the game ends if the player manages to defeat all opponents.
    public static void getOpp () {
        switch (oppCount) {
            case 1:
            {
                element3 = 7; element4 = 7; //Water (doesn't use magic)
                lblOppName.setText("Slime"); //Weak to ice
                lblOppHPVal.setText("5");
                oAC = 1;
                break;
            }
            case 2:
            {
                element3 = 3; element4 = 3; //Nature
                lblOppName.setText("Bunicorn"); //Weak to fire
                lblOppHPVal.setText("10");
                oAC = 2;
                break;
            }
            case 3:
            {
                element3 = 4; element4 = 4; //Earth
                lblOppName.setText("Skeleton"); //Weak to nature
                lblOppHPVal.setText("15");
                oAC = 3;
                break;
            }
            case 4:
            {
                element3 = 2; element4 = 2; //Fire
                lblOppName.setText("Chimaera"); //Weak to water
                lblOppHPVal.setText("20");
                oAC = 4;
                break;
            }
            case 5:
            {
                element3 = 5; element4 = 5; //Electricity
                lblOppName.setText("Scorpion"); //Weak to earth
                lblOppHPVal.setText("25");
                oAC = 5;
                break;
            }
            case 6:
            {
                element3 = 6; element4 = 6; //Ice
                lblOppName.setText("Cyclops"); //Weak to electricity
                lblOppHPVal.setText("30");
                oAC = 6;
                break;
            }
            case 7:
            {
                element3 = 7; element4 = 5; //Water & Electricity
                lblOppName.setText("Siren"); //Weak to ice
                lblOppHPVal.setText("35");
                oAC = 7;
                break;
            }
            case 8:
            {
                element3 = 3; element4 = 2; //Nature & Fire
                lblOppName.setText("Great Sabrecat"); //Weak to fire
                lblOppHPVal.setText("40");
                oAC = 8;
                break;
            }
            case 9:
            {
                element3 = 4; element4 = 6; //Earth & Ice
                lblOppName.setText("Golem"); //Weak to nature
                lblOppHPVal.setText("45");
                oAC = 9;
                break;
            }
            case 10:
            {
                element3 = 7; element4 = 7; //Water (doesn't use magic)
                lblOppName.setText("King Slime"); //Weak to ice
                lblOppHPVal.setText("50");
                oAC = 10;
                break;
            }
        }
        lbloAC.setText("AC: " + oAC);
        
        oppCount++;
    }
    
    //fight - This runs all the code for the player's turn during one round.
    //When it completes, the player must press the "Next" button to then watch the opponent's turn.
    //All compressed into one function so each button runs the same code but with a different value for pAct.
    public static void fight (int pAct) {
        //Resetting variables
        oAtk = 0; pAtk = 0;

        //Displays action
        if (pAct==0)
            lblAtk.setText("You draw your shield!");
        else if (pAct==1)
            lblAtk.setText("You launch a physical attack!");
        else
            lblAtk.setText("You use " + eleNames[pAct] + "!");

        //Large if statement to control what happens based on the user's choice and their opponent's strength/weakness
        if (pAct==0) {
            pDef=true;
            lblNarr1.setText("You enter a defensive stance!");
            lblNarr2.setText("Incoming damage from the next attack will be reduced!");
        }
        else if (pAct==1) {
            //d20 to attack
            d20 = (int) (Math.random()*20+1);

            //Does physical damage - Roll 1d8
            if (d20>oAC && oDef==false) {
                pAtk = (int) (Math.random()*8+1);
                lblNarr1.setText("You rolled a d20 to attack! " + d20 + "! Your attack hits!");
                lblNarr2.setText("You rolled 1d8 for damage! " + pAtk + "!");
            }
            
            //If the enemy is defending it does less damage - Roll 1d4
            else if (d20>oAC && oDef==true) {
                pAtk = (int) (Math.random()*4+1);
                lblNarr1.setText("You rolled a d20 to attack! " + d20 + "! Your attack hits!");
                lblNarr2.setText("The enemy is defending! You rolled 1d4 for damage! " + pAtk + "!");
            }
            else {
                pAtk = 0; //Miss
                lblNarr1.setText("You rolled a d20 to attack! " + d20 + "! Your attack misses!");
                lblNarr2.setText("");
            }
        }
        else if ((pAct==2 && element3==3) || (pAct==3 && element3==4) || (pAct==4 && element3==5) || (pAct==5 && element3==6) || (pAct==6 && element3==7) || (pAct==7 && element3==2)) {
            //d20 to attack
            d20 = (int) (Math.random()*20+1);

            //Crit - Roll 2d12
            if (d20>oAC && oDef==false) {
                pAtk = (int) (Math.random()*12+1) + (int) (Math.random()*12+1);
                lblNarr1.setText("You rolled a d20 to attack! " + d20 + "! Your attack hits!");
                lblNarr2.setText("Cricital hit! You rolled 2d12 for damage! " + pAtk + "!");
            }
            
            //If the enemy is defending it does a normal ele hit - Roll 1d12
            else if (d20>oAC && oDef==true) {
                pAtk = (int) (Math.random()*12+1);
                lblNarr1.setText("You rolled a d20 to attack! " + d20 + "! Your attack hits!");
                lblNarr2.setText("Cricital, but the enemy is defending! You rolled 1d12 for damage! " + pAtk + "!");
            }
            else {
                pAtk = 0; //Miss
                lblNarr1.setText("You rolled a d20 to attack! " + d20 + "! Your attack misses!");
                lblNarr2.setText("");
            }
        }
        else if ((pAct==2 && element3==7) || (pAct==3 && element3==2) || (pAct==4 && element3==3) || (pAct==5 && element3==4) || (pAct==6 && element3==5) || (pAct==7 && element3==6)) {
            //d20 to attack
            d20 = (int) (Math.random()*20+1);

            //Resisted - Roll 1d6
            if (d20>oAC && oDef==false) {
                pAtk = (int) (Math.random()*6+1);
                lblNarr1.setText("You rolled a d20 to attack! " + d20 + "! Your attack hits!");
                lblNarr2.setText("Resisted! You rolled 1d6 for damage! " + pAtk + "!");
            }
            
            //If the enemy is defending it is completely blocked - No roll
            else if (d20>oAC && oDef==true) {
                pAtk = 0;
                lblNarr1.setText("You rolled a d20 to attack! " + d20 + "! Your attack hits!");
                lblNarr2.setText("The enemy is defending, and they completely block the attack!");
            }
            else {
                pAtk = 0; //Miss
                lblNarr1.setText("You rolled a d20 to attack! " + d20 + "! Your attack misses!");
                lblNarr2.setText("");
            }
        }
        else {
            //d20 to attack
            d20 = (int) (Math.random()*20+1);

            //Normal ele hit - Roll 1d12
            if (d20>oAC && oDef==false) {
                pAtk = (int) (Math.random()*12+1);
                lblNarr1.setText("You rolled a d20 to attack! " + d20 + "! Your attack hits!");
                lblNarr2.setText("You rolled 1d12 for damage! " + pAtk + "!");
            }
            
            //If the enemy is defending it does less damage - Roll 1d6
            else if (d20>oAC && oDef==true) {
                pAtk = (int) (Math.random()*6+1);
                lblNarr1.setText("You rolled a d20 to attack! " + d20 + "! Your attack hits!");
                lblNarr2.setText("The enemy is defending! You rolled 1d6 for damage! " + pAtk + "!");
            }
            else {
                pAtk = 0; //Miss
                lblNarr1.setText("You rolled a d20 to attack! " + d20 + "! Your attack misses!");
                lblNarr2.setText("");
            }
        }
        
        //At the end, the damage (if done) is subtracted from the enemy's HP. If it hits 0, they are dead and will be replaced immediately.
        oHP = Integer.parseInt(lblOppHPVal.getText());
        oHP = oHP - pAtk;
        if (oHP<0)
            oHP = 0;
        lblOppHPVal.setText(String.valueOf(oHP));
        
        //Ends by resetting oDef to false
        oDef = false;
        
        //The "NEXT" button must be pressed to continue the rest of the round. This allows the player a chance to view the current stats.
        btnNext.setText("NEXT");
        cont = true;
        btnNext.setForeground(new java.awt.Color(51, 51, 51));
    }
    
    //endGame - This method will run code to take the current scores and record them to the file containing high scores.
    public static void endGame () throws IOException {
        
        //Resets the enemy value to 1
        oppCount = 1;

        //Resets the button
        valid = false;
        btnStartEnd.setText("START");
        btnStartEnd.setForeground(new java.awt.Color(153, 0, 255));
        
        if (score>highS) {

            try {
                //Giving the writer object the path to the file
                //Note this path is specific to the PC I developed this on
                out = new FileWriter("C:\\Users\\hu765630\\Documents\\NetBeansProjects\\20200106_DnD\\highscores.txt");
                out.write(String.valueOf(score));
            } finally {
                if (out != null) {
                    out.close();
                }
            }
            lblHScore.setText(String.valueOf(score));
        }
    }
    
    //getHS - This method is run at the beginning of the game to grab the high score value from the text file
    public static void getHS () throws IOException {
        
        try {
            //Giving the reader object the path to the file
            //Note this path is specific to the PC I developed this on
            in = new FileReader("C:\\Users\\hu765630\\Documents\\NetBeansProjects\\20200106_DnD\\highscores.txt");
            
            String highScore = "";
            int content;
            char ascii[] = {' ', ' '};
            int counter = 0;
            
            while ((content = in.read()) != -1) {
                //GIVES ASCII VALUES - must convert to char, then to integer before being stored in the array
                ascii[counter] = (char) content;
                counter++;
            }
            
            if (ascii[1]!=(' '))
                highScore = String.valueOf(ascii[0]) + String.valueOf(ascii[1]);
            else
                highScore = String.valueOf(ascii[0]);
            
            lblHScore.setText(highScore);
            
            highS = Integer.parseInt(highScore);
            
        } finally {
            if (in != null) {
                in.close();
            }
        }
        
    }

    /**
     * Creates new form FrmDnD
     */
    public FrmDnD() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnStartEnd = new javax.swing.JButton();
        btnDef = new javax.swing.JButton();
        btnEle1 = new javax.swing.JButton();
        btnPhys = new javax.swing.JButton();
        btnEle2 = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblNarr1 = new javax.swing.JLabel();
        lblNarr2 = new javax.swing.JLabel();
        lblOpp = new javax.swing.JLabel();
        lblYou = new javax.swing.JLabel();
        lblOppName = new javax.swing.JLabel();
        lblYouHP = new javax.swing.JLabel();
        lblYouHPVal = new javax.swing.JLabel();
        lblOppHP = new javax.swing.JLabel();
        lblOppHPVal = new javax.swing.JLabel();
        lblHS = new javax.swing.JLabel();
        lblS = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        lblHScore = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        lblpAC = new javax.swing.JLabel();
        lbloAC = new javax.swing.JLabel();
        lblAtk = new javax.swing.JLabel();
        lblMP = new javax.swing.JLabel();
        lblMPVal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnStartEnd.setBackground(new java.awt.Color(204, 204, 204));
        btnStartEnd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnStartEnd.setForeground(new java.awt.Color(153, 0, 255));
        btnStartEnd.setText("START");
        btnStartEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartEndActionPerformed(evt);
            }
        });
        getContentPane().add(btnStartEnd);
        btnStartEnd.setBounds(20, 780, 90, 30);

        btnDef.setBackground(new java.awt.Color(204, 204, 204));
        btnDef.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnDef.setForeground(new java.awt.Color(51, 51, 51));
        btnDef.setText("Defend");
        btnDef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefActionPerformed(evt);
            }
        });
        getContentPane().add(btnDef);
        btnDef.setBounds(80, 410, 230, 70);

        btnEle1.setBackground(new java.awt.Color(204, 204, 204));
        btnEle1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnEle1.setForeground(new java.awt.Color(51, 51, 51));
        btnEle1.setText("Element 1");
        btnEle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEle1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEle1);
        btnEle1.setBounds(380, 410, 220, 70);

        btnPhys.setBackground(new java.awt.Color(204, 204, 204));
        btnPhys.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPhys.setForeground(new java.awt.Color(51, 51, 51));
        btnPhys.setText("Physical");
        btnPhys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhysActionPerformed(evt);
            }
        });
        getContentPane().add(btnPhys);
        btnPhys.setBounds(80, 500, 230, 70);

        btnEle2.setBackground(new java.awt.Color(204, 204, 204));
        btnEle2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnEle2.setForeground(new java.awt.Color(51, 51, 51));
        btnEle2.setText("Element 2");
        btnEle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEle2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEle2);
        btnEle2.setBounds(380, 500, 220, 70);

        lblTitle.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(153, 0, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Monsters and Mages");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(20, 20, 650, 60);

        lblNarr1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNarr1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNarr1.setText("Welcome to Monsters and Mages! Please, use your magic and skills to defeat these beasts!");
        getContentPane().add(lblNarr1);
        lblNarr1.setBounds(10, 320, 670, 40);

        lblNarr2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNarr2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNarr2.setText("You'll be given two random elements for magic attacks. Use these wisely. Press \"START\" to begin!");
        getContentPane().add(lblNarr2);
        lblNarr2.setBounds(10, 350, 670, 40);

        lblOpp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblOpp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOpp.setText("OPPONENT");
        getContentPane().add(lblOpp);
        lblOpp.setBounds(220, 90, 250, 40);

        lblYou.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblYou.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblYou.setText("YOU");
        getContentPane().add(lblYou);
        lblYou.setBounds(280, 590, 130, 50);

        lblOppName.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblOppName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOppName.setText("...");
        getContentPane().add(lblOppName);
        lblOppName.setBounds(70, 130, 540, 40);

        lblYouHP.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblYouHP.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblYouHP.setText("HP:");
        getContentPane().add(lblYouHP);
        lblYouHP.setBounds(150, 690, 90, 60);

        lblYouHPVal.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblYouHPVal.setText("300");
        getContentPane().add(lblYouHPVal);
        lblYouHPVal.setBounds(250, 690, 100, 60);

        lblOppHP.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblOppHP.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblOppHP.setText("HP:");
        getContentPane().add(lblOppHP);
        lblOppHP.setBounds(250, 220, 90, 60);

        lblOppHPVal.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblOppHPVal.setText("...");
        getContentPane().add(lblOppHPVal);
        lblOppHPVal.setBounds(360, 220, 100, 60);

        lblHS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblHS.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblHS.setText("High score:");
        getContentPane().add(lblHS);
        lblHS.setBounds(480, 770, 100, 50);

        lblS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblS.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblS.setText("Score:");
        getContentPane().add(lblS);
        lblS.setBounds(270, 770, 70, 50);

        lblScore.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblScore.setText("...");
        getContentPane().add(lblScore);
        lblScore.setBounds(350, 770, 90, 50);

        lblHScore.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblHScore.setText("...");
        getContentPane().add(lblHScore);
        lblHScore.setBounds(590, 770, 80, 50);

        btnNext.setBackground(new java.awt.Color(204, 204, 204));
        btnNext.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNext.setForeground(new java.awt.Color(204, 204, 204));
        btnNext.setText("NEXT");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        getContentPane().add(btnNext);
        btnNext.setBounds(20, 730, 90, 30);

        lblpAC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblpAC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpAC.setText("AC: 5");
        getContentPane().add(lblpAC);
        lblpAC.setBounds(280, 650, 130, 30);

        lbloAC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbloAC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbloAC.setText("AC: 5");
        getContentPane().add(lbloAC);
        lbloAC.setBounds(270, 170, 140, 30);

        lblAtk.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblAtk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblAtk);
        lblAtk.setBounds(110, 280, 460, 40);

        lblMP.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblMP.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblMP.setText("MP:");
        getContentPane().add(lblMP);
        lblMP.setBounds(370, 690, 90, 60);

        lblMPVal.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblMPVal.setText("3");
        getContentPane().add(lblMPVal);
        lblMPVal.setBounds(470, 690, 60, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartEndActionPerformed
        
        //START & END button
        
        if (valid==false) {
            
            //Displays the high score
            try {
                getHS();
            } catch (IOException ex) {
                Logger.getLogger(FrmDnD.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //The game starts by selecting two random elements out of the 6 and assigning them to the user.
            element1 = (int) (Math.random()*6+2);
            do {
                element2 = (int) (Math.random()*6+2);
            } while (element2==element1);
            
            //Setting the correct name and colour for element 1's button
            btnEle1.setText(actNames[element1]);
            switch (element1) {
                case 2:
                {
                    btnEle1.setForeground(new java.awt.Color(255, 0, 0));
                    break;
                }
                case 3:
                {
                    btnEle1.setForeground(new java.awt.Color(0, 153, 0));
                    break;
                }
                case 4:
                {
                    btnEle1.setForeground(new java.awt.Color(153, 102, 0));
                    break;
                }
                case 5:
                {
                    btnEle1.setForeground(new java.awt.Color(255, 255, 0));
                    break;
                }
                case 6:
                {
                    btnEle1.setForeground(new java.awt.Color(0, 204, 255));
                    break;
                }
                case 7:
                {
                    btnEle1.setForeground(new java.awt.Color(0, 0, 255));
                    break;
                }
            }
            
            //Setting the correct name and colour for element 2's button
            btnEle2.setText(actNames[element2]);
            switch (element2) {
                case 2:
                {
                    btnEle2.setForeground(new java.awt.Color(255, 0, 0));
                    break;
                }
                case 3:
                {
                    btnEle2.setForeground(new java.awt.Color(0, 153, 0));
                    break;
                }
                case 4:
                {
                    btnEle2.setForeground(new java.awt.Color(153, 102, 0));
                    break;
                }
                case 5:
                {
                    btnEle2.setForeground(new java.awt.Color(255, 204, 0));
                    break;
                }
                case 6:
                {
                    btnEle2.setForeground(new java.awt.Color(0, 204, 255));
                    break;
                }
                case 7:
                {
                    btnEle2.setForeground(new java.awt.Color(0, 0, 255));
                    break;
                }
            }
            
            //Setting this button to be the END button, and the next time it is pressed it will run the END function
            valid = true;
            btnStartEnd.setText("END");
            btnStartEnd.setForeground(new java.awt.Color(153, 153, 153));
            
            //Setting the display labels to give the player instructions
            lblNarr1.setText("You have been assigned " + eleNames[element1] + " and " + eleNames[element2] + "! This means your weakness is " + eleNames[element1-1] + "!");
            lblNarr2.setText("Your first opponent approaches! Select an action to initiate the fight!");
            
            //Setting up the first opponent
            getOpp();
        }
        else {
            //Ends program and records high scores (separate method)
            try {
                endGame();
            } catch (IOException ex) {
                Logger.getLogger(FrmDnD.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //Resets the enemy value to 1
            oppCount = 1;
            
            //Resets the button
            valid = false;
            btnStartEnd.setText("START");
            btnStartEnd.setForeground(new java.awt.Color(153, 0, 255));
            
            //Displays messages
            lblAtk.setText("");
            lblNarr1.setText("You have chosen to retreat!");
            lblNarr2.setText("Your score is " + score + "!");
            score = 0;
        }
        
    }//GEN-LAST:event_btnStartEndActionPerformed

    private void btnDefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefActionPerformed
        
        //DEFEND ACTION
        
        if (valid==true && pDefCount<1) {
            valid = false;
            pDefCount = 2;
            pAct = 0; //Sets the chosen action for the turn.
            fight(pAct); //Runs the method for this and the next turn to run.
        }
        else if (valid==true && pDefCount>=1) {
            lblAtk.setText("");
            lblNarr1.setText("You cannot defend again so soon!");
            lblNarr2.setText("You must wait one turn for this skill to recharge!");
        }
        
    }//GEN-LAST:event_btnDefActionPerformed

    private void btnPhysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhysActionPerformed
        
        //PHYSICAL ACTION
        
        if (valid==true) {
            valid = false;
            pAct = 1; //Sets the chosen action for the turn.
            fight(pAct); //Runs the method for this and the next turn to run.
        }
        
    }//GEN-LAST:event_btnPhysActionPerformed

    private void btnEle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEle1ActionPerformed
        
        //ELEMENT 1 ACTION
        
        if (valid==true && MP>0) {
            valid = false;
            MP--;
            lblMPVal.setText(String.valueOf(MP));
            pAct = element1; //Sets the chosen action for the turn.
            fight(pAct); //Runs the method for this and the next turn to run.
        }
        else if (valid==true && MP<=0) {
            lblAtk.setText("");
            lblNarr1.setText("You don't have enough MP!");
            lblNarr2.setText("Remember, 1 MP is restored every 3 turns!");
        }
        
    }//GEN-LAST:event_btnEle1ActionPerformed

    private void btnEle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEle2ActionPerformed
        
        //ELEMENT 2 ACTION
        
        if (valid==true && MP>0) {
            valid = false;
            MP--;
            lblMPVal.setText(String.valueOf(MP));
            pAct = element2; //Sets the chosen action for the turn.
            fight(pAct); //Runs the method for this and the next turn to run.
        }
        else if (valid==true && MP<=0) {
            lblAtk.setText("");
            lblNarr1.setText("You don't have enough MP!");
            lblNarr2.setText("Remember, 1 MP is restored every 3 turns!");
        }
        
    }//GEN-LAST:event_btnEle2ActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        
        //NEXT button - The Opponent's turn
        
        if (cont==true && oHP>0) {
            
            cont = false;
            //This runs if the enemy is still alive
            
            //Opponent's turn: oAct is chosen after running through each option they have. Can they crit? They will. Can the player crit them? They will defend.
            //If their defend action is on cooldown, they will not defend. If they have used 3 magic attacks already, they cannot use magic again.
            //Otherwise they use a physical attack. (Slimes only use physical anyways.)
            
            if (oppCount < 11 && oppCount > 2) {
                if (pHP<10)
                    oAct = 1;
                else if (((element3==(element1-1)) || (element3==7 && element1==2)) && (oMagic<3))
                    oAct = element3;
                else if (((element4==(element1-1)) || (element4==7 && element1==2)) && (oMagic<3))
                    oAct = element4;
                else if (((element1==(element3-1)) || (element2==(element3-1)) || (element1==7 && element3==2) || (element2==7 && element3==2)) && (oDefCount<1))
                    oAct = 0;
                else
                    oAct = 1;
            }
            else {
                if (pHP<10)
                    oAct = 1;
                else if (((element1==(element3+1)) || (element2==(element3+1))) && (oDefCount<1))
                    oAct = 0;
                else
                    oAct = 1;
            }

            //Displays action
            if (oAct==0)
                lblAtk.setText("The enemy seems afraid!");
            else if (oAct==1)
                lblAtk.setText("The enemy launches a physical attack!");
            else
                lblAtk.setText("The enemy uses " + eleNames[oAct] + "!");
            
            //Large if statement to control what happens based on the AI's choice and the player's strength/weakness
            if (oAct==0) {
                oDef=true;
                oDefCount=2;
                lblNarr1.setText("The enemy enters a defensive stance!");
                lblNarr2.setText("Incoming damage from the next attack will be reduced!");
            }
            else if (oAct==1) {
                //d20 to attack
                d20 = (int) (Math.random()*20+1);

                //Does physical damage - Roll 1d8
                if (d20>pAC && pDef==false) {
                    oAtk = (int) (Math.random()*8+1);
                    lblNarr1.setText("They rolled a d20 to attack! " + d20 + "! Their attack hits!");
                    lblNarr2.setText("They rolled 1d8 for damage! " + oAtk + "!");
                }

                //If the enemy is defending it does less damage - Roll 1d4
                else if (d20>pAC && pDef==true) {
                    oAtk = (int) (Math.random()*4+1);
                    lblNarr1.setText("They rolled a d20 to attack! " + d20 + "! Their attack hits!");
                    lblNarr2.setText("You are defending! They rolled 1d4 for damage! " + oAtk + "!");
                }
                else {
                    oAtk = 0; //Miss
                    lblNarr1.setText("They rolled a d20 to attack! " + d20 + "! Their attack misses!");
                    lblNarr2.setText("");
                }
            }
            else if ((oAct==2 && element1==3) || (oAct==3 && element1==4) || (oAct==4 && element1==5) || (oAct==5 && element1==6) || (oAct==6 && element1==7) || (oAct==7 && element1==2)) {
                //Counting the magic attack
                oMagic++;
                //d20 to attack
                d20 = (int) (Math.random()*20+1);

                //Crit - Roll 2d12
                if (d20>pAC && pDef==false) {
                    oAtk = (int) (Math.random()*12+1) + (int) (Math.random()*12+1);
                    lblNarr1.setText("They rolled a d20 to attack! " + d20 + "! Their attack hits!");
                    lblNarr2.setText("Cricital hit! They rolled 2d12 for damage! " + oAtk + "!");
                }

                //If the enemy is defending it does a normal ele hit - Roll 1d12
                else if (d20>pAC && pDef==true) {
                    oAtk = (int) (Math.random()*12+1);
                    lblNarr1.setText("They rolled a d20 to attack! " + d20 + "! Their attack hits!");
                    lblNarr2.setText("Cricital, but you are defending! They rolled 1d12 for damage! " + oAtk + "!");
                }
                else {
                    oAtk = 0; //Miss
                    lblNarr1.setText("They rolled a d20 to attack! " + d20 + "! Their attack misses!");
                    lblNarr2.setText("");
                }
            }
            else if ((oAct==2 && element1==7) || (oAct==3 && element1==2) || (oAct==4 && element1==3) || (oAct==5 && element1==4) || (oAct==6 && element1==5) || (oAct==7 && element1==6)) {
                //Counting the magic attack
                oMagic++;
                //d20 to attack
                d20 = (int) (Math.random()*20+1);

                //Resisted - Roll 1d6
                if (d20>pAC && pDef==false) {
                    oAtk = (int) (Math.random()*6+1);
                    lblNarr1.setText("They rolled a d20 to attack! " + d20 + "! Their attack hits!");
                    lblNarr2.setText("Resisted! They rolled 1d6 for damage! " + oAtk + "!");
                }

                //If the enemy is defending it is completely blocked - No roll
                else if (d20>pAC && pDef==true) {
                    oAtk = 0;
                    lblNarr1.setText("They rolled a d20 to attack! " + d20 + "! Their attack hits!");
                    lblNarr2.setText("You are defending, and you completely block the attack!");
                }
                else {
                    oAtk = 0; //Miss
                    lblNarr1.setText("They rolled a d20 to attack! " + d20 + "! Their attack misses!");
                    lblNarr2.setText("");
                }
            }
            else {
                //Counting the magic attack
                oMagic++;
                //d20 to attack
                d20 = (int) (Math.random()*20+1);

                //Normal ele hit - Roll 1d12
                if (d20>pAC && pDef==false) {
                    oAtk = (int) (Math.random()*12+1);
                    lblNarr1.setText("They rolled a d20 to attack! " + d20 + "! Their attack hits!");
                    lblNarr2.setText("They rolled 1d12 for damage! " + oAtk + "!");
                }

                //If the enemy is defending it does less damage - Roll 1d6
                else if (d20>pAC && pDef==true) {
                    oAtk = (int) (Math.random()*6+1);
                    lblNarr1.setText("They rolled a d20 to attack! " + d20 + "! Their attack hits!");
                    lblNarr2.setText("You are defending! They rolled 1d6 for damage! " + oAtk + "!");
                }
                else {
                    oAtk = 0; //Miss
                    lblNarr1.setText("They rolled a d20 to attack! " + d20 + "! Their attack misses!");
                    lblNarr2.setText("");
                }
            }

            //Deals damage to the player (if it hits) and checks to see if the player died. If they did, the game ends.
            pHP = Integer.parseInt(lblYouHPVal.getText());
            pHP = pHP - oAtk;
            if (pHP<0)
                pHP = 0;
            lblYouHPVal.setText(String.valueOf(pHP));
            
            //Ends by resetting pDef to false
            pDef = false;
            
            cont2 = true;
            btnNext.setForeground(new java.awt.Color(51, 51, 51));
        }
        else if (cont==true) {
            cont = false;
            
            //IF THE ENEMY IS DEFEATED THE OPPONENT'S TURN IS SKIPPED
            pDefCount--;
            oDefCount=0;
            pMagic++;
            if (pMagic==3) {
                MP++;
                if (MP>3)
                    MP=3;
                lblMPVal.setText(String.valueOf(MP));
                pMagic=0;
            }
            if (MP==3)
                pMagic=0;
            oMagic=0;
            
            //Character manipulation used to create a randomized exclamation for the monster to shout as it dies.
            //Please count this as String manipulation,
            //I used pretty much the same code as you would for a String
            //but it works better with chars in this scenario
            for (int i = 0; i <= 5; i++) {
                if (i==0) {
                    blergh[i] = consonants[(int)(Math.random()*20)];
                    blergh[i] = Character.toUpperCase(blergh[i]);
                }
                else if (i==1 || i==4 || i==5)
                    blergh[i] = consonants[(int)(Math.random()*20)];
                else if (i==2 || i==3)
                    blergh[i] = vowels[(int)(Math.random()*4)];
            }
            
            lblAtk.setText("'" + blergh[0] + blergh[1] + blergh[2] + blergh[3] + blergh[4] + "!'");
            
            if (oppCount>10) {
                score++;
                lblScore.setText(String.valueOf(score));
                btnNext.setForeground(new java.awt.Color(153, 153, 153));
                lblNarr1.setText("You've defeated all ten enemies! Well done!");
                lblNarr2.setText("Thank you for saving our world!");
                try {
                    endGame();
                } catch (IOException ex) {
                    Logger.getLogger(FrmDnD.class.getName()).log(Level.SEVERE, null, ex);
                }
                return;
            }
            
            lblNarr1.setText("You've defeated the enemy! Well done!");
            lblNarr2.setText("A new foe draws near. What will you do?");
            getOpp();
            score++;
            lblScore.setText(String.valueOf(score));
            valid = true;
            btnNext.setForeground(new java.awt.Color(153, 153, 153));
        }
        else if (cont2==true){
            cont2 = false;
            
            //Checks if the player died
            if (pHP==0) {
                try {
                    endGame();
                } catch (IOException ex) {
                    Logger.getLogger(FrmDnD.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                //Displays messages
                lblAtk.setText("");
                lblNarr1.setText("You have been defeated!");
                lblNarr2.setText("Your score is " + score + "!");
                score = 0;
                return;
            }
            
            //If the player is alive, the game continues
            pMagic++;
            if (pMagic==3) {
                MP++;
                if (MP>3)
                    MP=3;
                lblMPVal.setText(String.valueOf(MP));
                pMagic=0;
            }
            if (MP==3)
                pMagic=0;
            pDefCount--;
            oDefCount--;
            lblAtk.setText("");
            lblNarr1.setText("The round has ended.");
            lblNarr2.setText("What will you do next?");
            valid = true;
            btnNext.setForeground(new java.awt.Color(153, 153, 153));
        }
        
    }//GEN-LAST:event_btnNextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmDnD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDnD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDnD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDnD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDnD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDef;
    private javax.swing.JButton btnEle1;
    private javax.swing.JButton btnEle2;
    public static javax.swing.JButton btnNext;
    private javax.swing.JButton btnPhys;
    public static javax.swing.JButton btnStartEnd;
    public static javax.swing.JLabel lblAtk;
    private javax.swing.JLabel lblHS;
    public static javax.swing.JLabel lblHScore;
    private javax.swing.JLabel lblMP;
    public static javax.swing.JLabel lblMPVal;
    public static javax.swing.JLabel lblNarr1;
    public static javax.swing.JLabel lblNarr2;
    private javax.swing.JLabel lblOpp;
    private javax.swing.JLabel lblOppHP;
    public static javax.swing.JLabel lblOppHPVal;
    public static javax.swing.JLabel lblOppName;
    private javax.swing.JLabel lblS;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblYou;
    private javax.swing.JLabel lblYouHP;
    private javax.swing.JLabel lblYouHPVal;
    public static javax.swing.JLabel lbloAC;
    private javax.swing.JLabel lblpAC;
    // End of variables declaration//GEN-END:variables
}
