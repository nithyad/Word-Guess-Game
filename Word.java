
/**
 * This class creates Strings for a word guessing game.
 * Contains a hidden word (answer) and a display word comprised
 * of dashes. Will display 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Word 
{
    private String answer;
    private String display;

    /**
     * Constructor for objects of class Word (10 points)
     * 
     * Pre-condition: ans is a lowercase String.
     * Post-condition: display has as many dashes as answer has letters.
     */
    public Word(String ans)
    {
        /**
         * initialize instance variables -
         * create String for display
         */
       answer = ans;
       String lucy = "";
       String cal = "-";
       for (int a=0; a<answer.length(); a++){
           lucy += cal;
        }
       display = lucy;
    }

    /**
     * Check's the user's guess to see if that character
     * is in the answer String. Return true if the letter is in
     * the answer String; false otherwise. (20 points)
     * 
     * Pre-condition: g is a single letter String in lowercase.
     * Post-condition: display is updated by replacing any dashes
     * with the correctly guessed letter.
     */
    public boolean guess(String g)
    {
       boolean hi = false;
       for (int i = 0; i<answer.length(); i++){
           if (g.equals(answer.substring(i, i +1))){
             display = display.substring(0, i) + g + display.substring(i+1);
             hi = true;
           }
       }
       return hi; 
    }
    
    /**
     * Prints the String display with spaces in between each dash. 
     * Prints a newline at the end of the String. (10 points)
     */
    public void displayWord()
    {
       for (int g = 0; g<display.length(); g++) {
           System.out.print(display.substring(g, g+1) + " ");
        }
       System.out.println("");
    }
    
    /**
     * Returns true if the user has guessed all the letters in the 
     * word. Returns false otherwise. (5 points)
     */
    public boolean isGuessed()
    {
        System.out.println(display);
        System.out.println(answer);
        if(display.equals (answer)){
            System.out.println("Congrats you won!!");
            return true;
        }
        else {
            return false;
        }
    }
}
