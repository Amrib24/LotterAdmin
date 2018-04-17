package lotteryadmin;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Amr
 */
public final class Utils {
    
    /*
        This is a Class I reuse in multiple projects, for that its scope is broad
    */
    
        // A recursive case overloaded method for other capitalize method
    public static String capitalize(String word){
        // Assume 1 letter words are abbreviations i.e "a" --> "A."
        if (word.length() == 1 && Character.isAlphabetic(word.charAt(0))){
            return word.toUpperCase() + '.';
        }
        //Other wise capitalize word
        return word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
    }
    
    
    /*  
    
        Ensures adherance to capitalization requirements for 1 to an arbitrary amount
        of words.  You can also mix numbers in which is convenient for i.e. addresses
        
    */
    
    public static String capitalize(String[] wordList){
        for (int i = 0; i < wordList.length; i++){
            wordList[i] = capitalize((String)wordList[i]);
        }
        return String.join(" ", wordList);
    }
    
    /*
    Method to remove duplicates that possibly could happen from Random Generators
    */
    
    public static Set eliminateDuplicateUsingSet(int[] arrayWithDuplicates) {
	Set set = new HashSet();
	for (int counter = 0; counter < arrayWithDuplicates.length; counter++) {
		set.add((int)arrayWithDuplicates[counter]);
	}
        return set;
    }
}
