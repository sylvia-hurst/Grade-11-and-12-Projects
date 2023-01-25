/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg20191008_cyoa;
import java.util.Scanner;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course Code: ICS
 * Start Date: October 8, 2019
 * End Date: October 21, 2019
 * Description: A choose-your-own-adventure game.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner kI = new Scanner(System.in);
        String choice;
        
        //Choose your own adventure!
        //The user is a pirate searching for treasure.
        //The user will make a total of 4 choices in all scenarios before the game comes to an end.
        //Half the results are positive, and the other half are negative.
        //Results are mostly similar, but still provide unique experiences nonetheless. The coding is the point, not the storytelling, right?
        
        //Intro
        System.out.println("You are a pirate searching for treasure.");
        System.out.println("Your treasure map you found in a floating bottle on the water tells you to search in the open ocean.");
        System.out.println("You decide to dive underwater from your ship.");
        System.out.println("While diving for sunken treasure, you come across an underwater cave and decide to swim inside.");
        System.out.println("The cave is filled with air, however, it is dark and only dimly illuminated by strange glowing mushrooms.");
        System.out.println("You travel forward for a few paces, but soon, you come across a fork in the path. You have two options.");
        
        //Choice 1
        System.out.print("Will you (A) take the left path, or (B) take the right path? ");
        choice = kI.nextLine();
        if (choice.equals("A") || choice.equals("a"))
        {
            //(A) Left path
            System.out.println("You decide to take the left path.");
            System.out.println("The cave grows darker as less mushrooms are around to produce light.");
            System.out.println("You start to feel suspicious about this cave.");
            System.out.println("In the dim lighting, it almost looks as if the cave was dug by humans.");
            
            //Choice 2
            System.out.println("Will you (A) check the area for booby traps, or (B) go forth without fear?");
            choice = kI.nextLine();
            if (choice.equals("A") || choice.equals("a"))
            {
                //(A) Check for booby traps
                System.out.println("After a bit of careful inspection, it seems there are small holes in the walls.");
                System.out.println("You suspect that there is a trip wire ahead to activate an arrow trap.");
                
                //Choice 3
                System.out.println("Will you (A) try not to activate the trap, or (B) rush forward and try to dodge the arrows?");
                choice = kI.nextLine();
                if (choice.equals("A") || choice.equals("a"))
                {
                    //(A) Try not to activate the traps
                    System.out.println("You successfully pass through the cave without tripping the wire.");
                    System.out.println("In the distance, you can see the faint glimmer of gold and jewels.");
                    
                    //Choice 4
                    System.out.println("Will you (A) steal as much treasure as you can and run for your life?");
                    System.out.println("Or (B) steal and replace the treasure, then carefully escape?");
                    choice = kI.nextLine();
                    if (choice.equals("A") || choice.equals("a"))
                    {
                        //(A) Steal the treasure and run out
                        System.out.println("Upon grabbing some coins, you notice a rumble in the ground.");
                        System.out.println("Panicking, you flee towards the cave's exit.");
                        System.out.println("There is a cave-in blocking your way, and more rubble and stalactites fall from above.");
                        System.out.println("You are trapped and soon will die.");
                        System.out.println("GAME OVER");
                        //Game end (NEG) //ENDING #1 (A A A A)
                    }
                    else if (choice.equals("B") || choice.equals("b"))
                    {
                        //(B) Steal and replace the treasure, then carefully escape
                        System.out.println("You take some pebbles and mushrooms from around the cave and quickly replace some treasure with them.");
                        System.out.println("No traps activate, so carefully you claim your prize and walk out of the cave again, making sure not to trip the wire.");
                        System.out.println("The treasures will sell for a lot, and you can see a bright future ahead of you.");
                        System.out.println("THE END");
                        //Game end (POS) //ENDING #2 (A A A B)
                    }
                    else
                        System.out.println("Invalid response.");
                }
                else if (choice.equals("B") || choice.equals("b"))
                {
                    //(B) Rush forward, but try to dodge the arrows
                    System.out.println("You run forward as fast as you can, and nearly trip over the tripwire.");
                    System.out.println("Arrows begin to fly from either wall. You use your best moves to dodge the arrows.");
                    System.out.println("But it's no use. Several arrows pierce into your sides, and you feel immense pain.");
                    System.out.println("But you reach the end of the cave, and you see the shining treasure in the distance.");
                    
                    //Choice 4
                    System.out.println("Will you (A) try to steal the treasure anyway, or (B) tend to your wounds and leave the cave?");
                    choice = kI.nextLine();
                    if (choice.equals("A") || choice.equals("a"))
                    {
                        //(A) Try to steal the treasure anyway
                        System.out.println("You stagger forward as your wounds begin to bleed. The treasure is in sight, and you can almost reach it.");
                        System.out.println("Unfortunately, you collapse before you can even take one grasp of the gold coins and jewels.");
                        System.out.println("You lost too much blood, and you will soon die.");
                        System.out.println("GAME OVER");
                        //Game end (NEG) //ENDING #3 (A A B A)
                    }
                    else if (choice.equals("B") || choice.equals("b"))
                    {
                        //(B) Focus on tending to your wounds and leave the cave
                        System.out.println("With the arrows exhausted from the traps, you find it safe to stop and pull the arrows out from your body.");
                        System.out.println("Covering the wounds with bandages from your handy first aid kit, you manage to stop your body from losing too much blood.");
                        System.out.println("However, you are weak and in pain. You're best off leaving the cave to rest and heal.");
                        System.out.println("At least you didn't lose your life. There's always another chance to return to the cave.");
                        System.out.println("THE END");
                        //Game end (POS) //ENDING #4 (A A B B)
                    }
                    else
                        System.out.println("Invalid response.");
                }
                else
                    System.out.println("Invalid response.");
            }
            else if (choice.equals("B") || choice.equals("b"))
            {
                //(B) Go forth without fear
                System.out.println("You expect there to be no traps in this cave, and push forward fearlessly.");
                System.out.println("You suddenly trip and collapse onto the ground. Arrows fly over your head, and one hits you.");
                System.out.println("The arrows seemed to be directed at someone who would have tripped the wire and kept running forward.");
                System.out.println("With only one wound, you contemplate your options.");
                
                //Choice 3
                System.out.println("Will you (A) tend to your wound, or (B) keep the arrow in and ignore the pain?");
                choice = kI.nextLine();
                if (choice.equals("A") || choice.equals("a"))
                {
                    //(A) Remove the arrow and try to stop the bleeding
                    System.out.println("You quickly pull out the arrow that pierced you and cover it in a bandage from your handy first aid kit.");
                    System.out.println("Since it was only one arrow, you're not in too much pain and you're still fit enough to steal the treasure.");
                    System.out.println("Speaking of treasure, you notice the faint gleam of the jewels and gold in the distance.");
                    
                    //Choice 4
                    System.out.println("Will you (A) try to carefully steal the treasure, or (B) try to disable the traps first?");
                    choice = kI.nextLine();
                    if (choice.equals("A") || choice.equals("a"))
                    {
                        //(A) Try to carefully steal the treasure
                        System.out.println("You figure you should be able to manage grabbing some treasure and carefully stepping over the wire.");
                        System.out.println("You stuff your clothes full of treasure, and shove your other belongings in place of the treasure. No traps seem to activate.");
                        System.out.println("On your way back, you make sure to step over the tripwire and then safely exit the cave with your prize.");
                        System.out.println("The treasures will sell for a lot, and you can see a bright future ahead of you.");
                        System.out.println("THE END");
                        //Game end (POS) //ENDING #5 (A B A A)
                    }
                    else if (choice.equals("B") || choice.equals("b"))
                    {
                        //(B) Try to disable the traps
                        System.out.println("The trip wire remains in its place, and you decide you need to disable it so you don't trip on it again.");
                        System.out.println("As you do, you accidentally activate the trap a second time, spawning more arrows.");
                        System.out.println("Many more arrows now stab into you, and the pain is so immense that you collapse.");
                        System.out.println("GAME OVER");
                        //Game end (NEG) //ENDING #6 (A B A B)
                    }
                    else
                        System.out.println("Invalid response.");
                }
                else if (choice.equals("B") || choice.equals("b"))
                {
                    //(B) Keep the arrow in and push forward, ignoring the pain
                    System.out.println("You decide there is no time to tend to your wound, and you can fix it later.");
                    System.out.println("Despite the pain and bleeding, you manage to stand up and assess the situation.");
                    
                    //Choice 4
                    System.out.println("Will you (A) try to carefully steal the treasure, or (B) leave the cave empty-handed?");
                    choice = kI.nextLine();
                    if (choice.equals("A") || choice.equals("a"))
                    {
                        //(A) Try to carefully steal the treasure
                        System.out.println("You decide you don't want to leave the cave without a prize. You step toward the treasure.");
                        System.out.println("You stuff your clothes full, but the weight becomes so heavy that you can no longer pick yourself up.");
                        System.out.println("You feel yourself losing strength, and slowly fading into unconsciousness...");
                        System.out.println("GAME OVER");
                        //Game end (NEG) //ENDING #7 (A B B A)
                    }
                    else if (choice.equals("B") || choice.equals("b"))
                    {
                        //(B) Leave the cave empty-handed
                        System.out.println("With the energy you have, you decide it's best to leave the cave immediately and tend to your wounds back on your ship.");
                        System.out.println("Carefully, you maneuver over the tripwire and make your way back outside the cave.");
                        System.out.println("A quick swim back up to your boat and you're safe. Surely, you will come visit this cave again to steal its treasure.");
                        System.out.println("THE END");
                        //Game end (POS) //ENDING #8 (A B B B)
                    }
                    else
                        System.out.println("Invalid response.");
                }
                else
                    System.out.println("Invalid response.");
            }
            else
                System.out.println("Invalid response.");
        }
        else if (choice.equals("B") || choice.equals("b"))
        {
            //(B) Right path
            System.out.println("You decide to take the right path.");
            System.out.println("The cave grows darker, and only dim yet sparkly crystals on the ceiling of the cave illuminate the path ahead.");
            System.out.println("You start to feel suspicious about this cave.");
            System.out.println("In the dim lighting, it almost looks as if the cave was dug by humans.");
            
            //Choice 2
            System.out.println("Will you (A) check for booby traps or (B) go forth without fear?");
            choice = kI.nextLine();
            if (choice.equals("A") || choice.equals("a"))
            {
                //(A) Check for booby traps
                System.out.println("You carefully examine the floor and walls of the area. It seems there are bricks built into the surfaces.");
                System.out.println("You suspect there is a weak floor ahead that will collapse into a pit when enough weight is put on it.");
                System.out.println("If you were to run across, it would probably destroy the floor and catch you in the pit.");
                
                //Choice 3
                System.out.println("Will you (A) try to avoid activating the trap, or (B) rush and try to clear the pit with a jump?");
                choice = kI.nextLine();
                if (choice.equals("A") || choice.equals("a"))
                {
                    //(A) Try to avoid activating the trap
                    System.out.println("You decide it's best to go slow and steady. You drop to all fours to spread your weight out, and crawl forwards.");
                    System.out.println("Slowly, you pass through the cave, and a few paces in, you begin to feel an unstable ground.");
                    System.out.println("You keep your cool and continue stepping forward gently enough not to disturb the bricks.");
                    System.out.println("After the unsteady feeling disappears, you carefully stand back up again, all safe.");
                    System.out.println("You notice the faint shine of gems and gold in the distance.");
                    
                    //Choice 4
                    System.out.println("Will you (A) steal as much treasure as you can and run for your life?");
                    System.out.println("Or (B) steal and replace the treasure, then carefully escape?");
                    choice = kI.nextLine();
                    if (choice.equals("A") || choice.equals("a"))
                    {
                        //(A) Steal the treasure and run out
                        System.out.println("You decide you can't wait anymore and just want to snatch all that treasure up.");
                        System.out.println("Grabbing as much as you can hold in your two arms, you dash through the cave towards the exit.");
                        System.out.println("But you quickly realize this was a mistake. You collapse and fall into the pitfall trap.");
                        System.out.println("Crashing onto many bricks, the treasures in your arms stab into your skin and make you bleed.");
                        System.out.println("Rubble continues to fall from the ceiling. You are trapped and soon will die.");
                        System.out.println("GAME OVER");
                        //Game end (NEG) //ENDING #9 (B A A A)
                    }
                    else if (choice.equals("B") || choice.equals("b"))
                    {
                        //(B) Steal and replace the treasure, then carefully escape
                        System.out.println("You decide to take the careful approach, just as you did with the pitfall trap.");
                        System.out.println("Using some rubble lying around, you replace a handful of treasure.");
                        System.out.println("Nothing about the area seems to change. You didn't activate any more traps.");
                        System.out.println("You slowly crawl back over the pitfall with your prize, and escape the cave.");
                        System.out.println("The treasures will sell for a lot, and you can see a bright future ahead of you.");
                        System.out.println("THE END");
                        //Game end (POS) //ENDING #10 (B A A B)
                    }
                    else
                        System.out.println("Invalid response.");
                }
                else if (choice.equals("B") || choice.equals("b"))
                {
                    //(B) Rush forward, but try to jump across the pit
                    System.out.println("You think you can make the jump easily with a running start. This would save some time.");
                    System.out.println("You back up a bit and prepare to make your jump. Then, you start to run.");
                    System.out.println("As soon as you feel the ground become unsteady, you leap with all your might.");
                    System.out.println("In the middle of your jump, you notice the faint twinkle of treasure in the distance.");
                    System.out.println("But once you land, your feet crash into the still-unstable ground and you collapse into the pitfall.");
                    
                    //Choice 4
                    System.out.println("Will you (A) continue pursuing the treasure despite this setback?");
                    System.out.println("Or (B) leave the cave empty-handed due to your fatigue?");
                    choice = kI.nextLine();
                    if (choice.equals("A") || choice.equals("a"))
                    {
                        //(A) Continue pursuing the treasure
                        System.out.println("Frustrated, you relentlessly pursue the treasure you glimpsed ahead.");
                        System.out.println("With adrenaline rushing, you pull yourself out of the pitfall and lunge towards the treasure.");
                        System.out.println("Grabbing as much of it as you can, you rush back towards the cave exit.");
                        System.out.println("But you forgot about the pitfall. In the dim light, it catches you by surprise.");
                        System.out.println("A trip and fall break your bones this time, and everything seems to fade to black.");
                        System.out.println("GAME OVER");
                        //Game end (NEG) //ENDING #11 (B A B A)
                    }
                    else if (choice.equals("B") || choice.equals("b"))
                    {
                        //(B) Leave the cave empty-handed
                        System.out.println("You don't let your emotions hide your physical pain and weakness from the fall.");
                        System.out.println("You may be bruised in several locations from the fall, but you should be able to return to your ship.");
                        System.out.println("Slowly and carefully, you climb out of the pitfall and exit the cave.");
                        System.out.println("But you know you'll be back in the future to claim that treasure.");
                        System.out.println("THE END");
                        //Game end (POS) //ENDING #12 (B A B B)
                    }
                    else
                        System.out.println("Invalid response.");
                }
                else
                    System.out.println("Invalid response.");
            }
            else if (choice.equals("B") || choice.equals("b"))
            {
                //(B) Go forth without fear
                System.out.println("You believe there is no way a cave could be trapped, so you keep pushing forward.");
                System.out.println("As you walk forward, you notice the treasure ahead - but also, the ground starts to feel unsteady.");
                System.out.println("You stop to wonder why, but then it hits you. The ground beneath you collapses suddenly.");
                System.out.println("You fall into a pit, surrounded by tons of bricks that made up what used to be the cave's floor.");
                System.out.println("With your quick reactions, you were able to shield yourself from most of the fall's damage.");
                
                //Choice 3
                System.out.println("Will you (A) climb out towards the treasure, or (B) climb out towards the exit?");
                choice = kI.nextLine();
                if (choice.equals("A") || choice.equals("a"))
                {
                    //(A) Climb out of the pit towards the treasure
                    System.out.println("You decide you still want to nab a bit of treasure before you leave the cave.");
                    System.out.println("You carefully climb out of the pit towards where you saw the twinkles of treasure.");
                    System.out.println("You don't want to take any more chances, so you replace the treasure with some rubble lying around.");
                    System.out.println("Now you have a good handful of treasure to take home with you. But you still need to escape the cave.");
                    
                    //Choice 4
                    System.out.println("Will you (A) try to jump the pit on your way back?");
                    System.out.println("Or (B) try to carefully climb down, across, and up the pit to the other side?");
                    choice = kI.nextLine();
                    if (choice.equals("A") || choice.equals("a"))
                    {
                        //(A) Try to jump the pit
                        System.out.println("You are losing your patience as you just want to go home and sell this treasure.");
                        System.out.println("With the strength you have left, you think you can make the jump across the pit.");
                        System.out.println("You leap forward with all your might, but alas, it is not enough.");
                        System.out.println("Collapsing in the pit once more, this time you tried to keep on clutching your prize.");
                        System.out.println("You weren't able to break your fall, and instead, you broke your bones.");
                        System.out.println("GAME OVER");
                        //Game end (NEG) //ENDING #13 (B B A A)
                    }
                    else if (choice.equals("B") || choice.equals("b"))
                    {
                        //(B) Try to carefully climb down, across, and up the pit to the other side
                        System.out.println("You still want to remain serious about the situation and carefully exit.");
                        System.out.println("You cannot take as much treasure this way since you'll need your hands to climb with...");
                        System.out.println("But at least you won't risk falling and killing yourself. You escape successfully.");
                        System.out.println("The treasures will sell for a lot, and you can see a bright future ahead of you.");
                        System.out.println("THE END");
                        //Game end (POS) //ENDING #14 (B B A B)
                    }
                    else
                        System.out.println("Invalid response.");
                }
                else if (choice.equals("B") || choice.equals("b"))
                {
                    //(B) Climb out of the pit towards the exit
                    System.out.println("You don't want to climb up and down the pit repeatedly, so you climb up towards the exit.");
                    System.out.println("This will hopefully preserve more of your energy.");
                    System.out.println("However, you wonder if you can still reach some treasure using a grappling hook...");
                    
                    //Choice 4
                    System.out.println("Will you (A) try to steal some treasure with your grappling tool?");
                    System.out.println("Or (B) leave the cave empty-handed?");
                    choice = kI.nextLine();
                    if (choice.equals("A") || choice.equals("a"))
                    {
                        //(A) Try to steal the treasure with a grappling tool
                        System.out.println("You pull out your trusty grappling hook and prep it for use.");
                        System.out.println("Swinging it like a lasso, you launch it across the gap and it lands in the pile of treasure ahead.");
                        System.out.println("Excited, you reel back the rope, hoping it will catch some treasure and pull it along.");
                        System.out.println("But once some treasure leaves the pile, you notice the ground begin to shake.");
                        System.out.println("Rubble erupts from the ceiling and lands around you and on you.");
                        System.out.println("You are trapped and will soon die.");
                        System.out.println("GAME OVER");
                        //Game end (NEG) //ENDING #15 (B B B A)
                    }
                    else if (choice.equals("B") || choice.equals("b"))
                    {
                        //(B) Leave the cave empty-handed
                        System.out.println("You decide not to get too greedy, and leave the cave instead of risking nabbing the treasure.");
                        System.out.println("Perhaps you will return another day with renewed energy to steal it.");
                        System.out.println("At least you didn't activate any more traps that could've ended your life.");
                        System.out.println("THE END");
                        //Game end (POS) //ENDING #16 (B B B B)
                    }
                    else
                        System.out.println("Invalid response.");
                }
                else
                    System.out.println("Invalid response.");
            }
            else
                System.out.println("Invalid response.");
        }
        else
            System.out.println("Invalid response.");
        
    }

}
