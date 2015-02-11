/*
 * Palindrome.java
 * Carden Reichert
 * 
 * This program takes a word or phrase as input from the command line and
 * determines if it is a palindrome or not, and displays the result.
 * 
 * Adapted from palindrome.c.
 * CSE 155H Fall 2012
 */
import java.lang.String;
public class Palindrome {
    
    public static void main( String[] args ){
        
        String inputWord;
        
        if( args.length != 1 ){
            
            System.out.println( "Usage: isPalindrome word." );
            System.exit( 1 );
            
        } // End preliminary input check
        
        inputWord = args[0];
        
        /* Find out if it's a palindrome */
        boolean isPal = isPalindrome( inputWord, 0, (inputWord.length() - 1) );
        
        if( isPal ){
            System.out.format( "%s is a palindrome!\n", inputWord );
        }
        else
            System.out.format( "%s is not a palindrome.\n", inputWord );
        

    } // End main()
    
    
    /**
     * Determines if a provided word or phrase is a palindrome or not.
     * @param word String reference for the word or phrase to be tested.
     * @param leftIndex The leftmost index of the word or phrase.
     * @param rightIndex The rightmost index of the word or phrase.
     * @return Boolean true if the word or phrase is a palindrome, false otherwise.
     */
    private static boolean isPalindrome( String word, int leftIndex, int rightIndex ){
        
        // Implement this method to determine if the String passed in is a 
        // palindrome or not.
    	String[] word = word.split("");
        if(word[leftIndex] != word[rightIndex]){
        	return false;
        }
        
        return false;
        
    } // End isPalindrome()
    

} // End class definition
