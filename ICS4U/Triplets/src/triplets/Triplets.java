/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package triplets;
import java.util.ArrayList;

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course: ICS
 * Start Date: September 28, 2020
 * End Date: September 28, 2020
 * Description: Randomly generates a triplet poem, with a set
 * list of nouns, verbs, adjectives and adverbs to choose from.
 */
public class Triplets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variable declarations
        
        //People
        ArrayList<String> nouns = new ArrayList<>();
        nouns.add("martial artist");
        nouns.add("mage");
        nouns.add("priest");
        nouns.add("warrior");
        nouns.add("sage");
        nouns.add("jester");
        nouns.add("soldier");
        nouns.add("ranger");
        nouns.add("thief");
        nouns.add("merchant");
        
        //Adjectives to describe the people
        ArrayList<String> adjectives = new ArrayList<>();
        adjectives.add("sweaty");
        adjectives.add("smelly");
        adjectives.add("tall");
        adjectives.add("short");
        adjectives.add("skinny");
        adjectives.add("fat");
        adjectives.add("tired");
        adjectives.add("energetic");
        
        //Past-tense verbs to describe what the people did
        ArrayList<String> verbs = new ArrayList<>();
        verbs.add("skipped to");
        verbs.add("jumped to");
        verbs.add("slapped");
        verbs.add("hugged");
        verbs.add("kissed");
        
        //Adverbs to describe the verbs
        ArrayList<String> adverbs = new ArrayList<>();
        adverbs.add("spontaneously");
        adverbs.add("quickly");
        adverbs.add("frantically");
        adverbs.add("carefully");
        adverbs.add("slowly");
        
        //Rhyming nouns to go at the end of each line
        ArrayList<String> rhymingNouns = new ArrayList<>();
        rhymingNouns.add("tree");
        rhymingNouns.add("bee");
        rhymingNouns.add("sea");
        rhymingNouns.add("tea");
        rhymingNouns.add("jamboree");
        rhymingNouns.add("key");
        rhymingNouns.add("flea");
        rhymingNouns.add("debris");
        rhymingNouns.add("pea");
        rhymingNouns.add("brie");
        
        //Strings for selecting words from the corresponding array lists
        String noun;
        String adjective;
        String verb1, verb2, verb3;
        String adverb1, adverb2, adverb3;
        String rhymingNoun1, rhymingNoun2, rhymingNoun3;
        
        //Integer to host a random number so it can be used for both
        //finding a word from a list to use, and then removing that word
        int randNum;
        
        //Collecting chosen words
        randNum = (int)(Math.random()*nouns.size());
        noun = nouns.get(randNum);
        
        randNum = (int)(Math.random()*adjectives.size());
        adjective = adjectives.get(randNum);
        
        randNum = (int)(Math.random()*verbs.size());
        verb1 = verbs.get(randNum);
        verbs.remove(randNum);
        randNum = (int)(Math.random()*verbs.size());
        verb2 = verbs.get(randNum);
        verbs.remove(randNum);
        randNum = (int)(Math.random()*verbs.size());
        verb3 = verbs.get(randNum);
        
        randNum = (int)(Math.random()*adverbs.size());
        adverb1 = adverbs.get(randNum);
        adverbs.remove(randNum);
        randNum = (int)(Math.random()*adverbs.size());
        adverb2 = adverbs.get(randNum);
        adverbs.remove(randNum);
        randNum = (int)(Math.random()*adverbs.size());
        adverb3 = adverbs.get(randNum);
        
        randNum = (int)(Math.random()*rhymingNouns.size());
        rhymingNoun1 = rhymingNouns.get(randNum);
        rhymingNouns.remove(randNum);
        randNum = (int)(Math.random()*rhymingNouns.size());
        rhymingNoun2 = rhymingNouns.get(randNum);
        rhymingNouns.remove(randNum);
        randNum = (int)(Math.random()*rhymingNouns.size());
        rhymingNoun3 = rhymingNouns.get(randNum);
        
        //Displaying the poem
        System.out.println("The "+adjective+" "+noun+" "+adverb1+" "+verb1+" the "+rhymingNoun1);
        System.out.println("So they "+adverb2+" "+verb2+" the "+rhymingNoun2);
        System.out.println("But they "+adverb3+" "+verb3+" the "+rhymingNoun3+".");
        
    }

}
