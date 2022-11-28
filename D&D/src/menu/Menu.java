package menu;

import java.util.Scanner;


/**
 *
 */
public class Menu {
    private static Scanner sc = new Scanner(System.in);

    public String startGame() { // Method to start the game
        return askQuestion("""
                Welcome to the DnD game!
                Please enter your choice:
                1. Play
                2. Quit
                """);
    }

    /**
     * @return String
     */

    public String askName() { // Method to ask the name of the character
        return askQuestion("Please enter your name:");

    }


    /**
     * @return String
     */

    public String askType() { // Method to ask the type of the character
        return askQuestion("""
                Please choose the type of character you want to create :
                1. Warrior
                2. Wizard
                3. Quit
                """);
    }

    /**
     * @return String
     */

    public String askModify() { // Method to ask the type of the character
        return askQuestion("""
                Do you want to modify your character?
                1. Yes
                2. No
                """);
    }

    /**
     * @param question
     * @return String
     */

    public static String askQuestion(String question) {
        System.out.println(question);
        return sc.nextLine();
    }


    /**
     * @return String
     */
    public String askShowstats() {
        return askQuestion("""
                1.show stats
                2.quit""");
    }

    /**
     * @return String
     */

    public String askChangeNameOrType() {
        return askQuestion("""
                1.Name
                2.Type
                """);
    }

    /**
     * @return String
     */

    public String endGame() {
        return askQuestion("""
                1. Play again
                2. Quit""");
    }

    public static String nowFight(){
      return askQuestion("""
              1. Attack Enemy
              2. Escape""");
    }


}



















