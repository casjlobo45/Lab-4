/*
 * ObtainInput.java
 * Carden Reichert
 * 
 * This class reads a list of words from a text file and stores them in an
 * ArrayList of Strings.  The words are expected to be written one per line down
 * the length of the page.
 * 
 * CSE155H Fall 2012
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class ObtainInput {
    
    /* Error message informing the user of file not found */
    public final String NO_FILE = "File not found.  Please be sure " +
            "that the input file dictionary.txt is in the working directory.";
    
    /* Name of the file to be read */
    private String fileName;
    
    /* Repository for the list of random words for the game */
    private ArrayList<String> guessWords = new ArrayList<String>();
    
    
    /* Class constructor */
    public ObtainInput( String inputFile ){
        
        fileName = inputFile;
        
    } // End constructor
    
    
    /**
     * Reads the file passed to it by the client program, and stores each word
     * in an ArrayList of Strings.
     * @return An ArrayList of Strings.
     */
    public ArrayList readListOfWords(){
        
        /* Prepare to obtain the guess words from the text file */
        try{
                       
            File words = new File( fileName );
            Scanner input = new Scanner( words );
            
            String word;
            while( input.hasNext() ){
                word = input.next();
                guessWords.add( word );
            }
               
        }catch ( FileNotFoundException notFound ) {
            
            System.out.println( NO_FILE );
            System.out.println( "Program closing...\n" );
            System.exit( 1 );
            
        } // End try-catch block
        
        return guessWords;

    } // End readListOfWords()
    
    
    /**
     * Prints out the list of collected random words to standard output.
     */
    public void printListOfWords(){
        
        System.out.println( "Random list of words for the game: \n" );
        
        for( String word : guessWords ){
            
            System.out.println( word );
            
        } // Verify input file was read correctly

    } // End printListOfWords()
    

} // End class defnition