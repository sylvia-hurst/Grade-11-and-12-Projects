/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hu765630
 */
public class DeckAY {
    
    public static int[] deck = new int[52]; //Stores the count for each card
    public static int randomCard = 0;
    public static int cardFaceNum = 0;
    public static int cardSuitNum = 0;
    public static int cardCount = 0;

    public static String suits[] = {"Spades", "Hearts", "Clubs", "Diamonds"};
    public static String faces[] = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    //Generates new card based on deck limit, updates deck array,
    //updates card count, returns int value.
    public static int generateCard() {
        do {
            randomCard = (int) (Math.random() * 52);
        } while (deck[randomCard] >= 1);
        cardCount++;
        deck[randomCard]++;
        
        //If cardCount reaches 52, the entire deck
        //will be reset. So all cards will go through
        //before resetting, making it possible to count
        //cards to help guessing near the end.
        if (cardCount==52){
            for (int i=0;i<52;i++){
                deck[i]=0;
            }
        }
        
        return randomCard;
    }
    
    //When passed a target integer, returns the String face value
    public static String getFace(int a) {
        cardFaceNum = a % 13;
        return (faces[cardFaceNum]);
    }
    
    //When passed a target integer, returns the String suit value
    public static String getSuit(int a) {
        cardSuitNum = a / 13;
        return (suits[cardSuitNum]);
    }

    
}
