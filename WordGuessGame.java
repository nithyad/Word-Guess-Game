import java.util.Scanner;

/**
 * WordGuessGame
 * 
 * @author TAPCSA 
 * @version July, 2014
 */
public class WordGuessGame implements Game
{
  Word gameWord;
  String letter;
  
  /**
   * Post-condition: gameWord is a lowercase String containing only 
   *                 characters a-z
   */
  public WordGuessGame() {
      gameWord = new Word("hopper");
  }
  
  /**
   * Prints rules for game (5 points)
   */
  public void printRules() {
     System.out.println("Welcome to the Word Guess Game!");
     System.out.println("I'm thinking of a word, try to guess it!");
     System.out.println("Input what letter you think is in my word, and I will tell you if it is true or false.");
     System.out.println("If you guess correctly, I will show you where the letter is in the word.");
     System.out.println("Good luck! Now lets begin!");
    }
  
  /**
   * Begins and ends game play. (25 points)
   */
  public void play() {
      while (isWinner() == false) {
      gameWord.displayWord();
     
      System.out.println("Guess a letter!");
      
      letter = getUserInput();
      
      if (gameWord.guess (letter) == true) {
          System.out.println("That letter is in the puzzle!");
        }
      if (gameWord.guess (letter) != true) {
          System.out.println("Sorry, that letter is not the puzzle.");
        }
  
      gameWord.guess(letter);
    }
    System.out.println("End of play\n");
  }
  
  /**
   * Determines if user won game. Returns true if so, false if not.
   * (5 points)
   */
  public boolean isWinner() {
      return gameWord.isGuessed();
  }
  
  /**
   * Gets input from user.
   * 
   * Post-condition: Assumes a single letter input from user.
   */
  public String getUserInput() {
    Scanner input = new Scanner(System.in);
    return(input.nextLine());
  }
    
  public static void main(String[] args)
  {
    WordGuessGame g1 = new WordGuessGame();
    g1.printRules();
    g1.play();
    
    System.out.println("End main");
  }

}
