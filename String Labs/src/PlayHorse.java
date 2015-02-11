/*
 * PlayHorse.java
 * Carden Reichert
 * 
 * This is the driver class for the game of Hangman.  The objects to obtain
 * input and start the game are instantiated.  This class expects to be in the
 * same directory as HorseGameSolution.java and ObtainInput.java.
 * 
 * Adapted from gameFunctions.c by Tony Schneider.
 * 
 * CSE 155H Fall 2012
 */

import java.util.ArrayList;

public class PlayHorse {
    
    public static void main( String[] args ){
        
        
        /* Prepare to read input from the text file */
        ObtainInput fileInput = new ObtainInput( "dictionary.txt" );
        
        /* Obtain input from the external text file */
        ArrayList<String> input;
        input = fileInput.readListOfWords();
        
        /* Start the game */
        HorseGame newGame = new HorseGame();
        newGame.startGame( input );
        
        System.out.println( "\nThanks for playing!" );

    } // End main()

    
} // End class definition