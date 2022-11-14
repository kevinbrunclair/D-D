import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);

    public String startGame() { // Method to start the game
       return askQuestion("""
               Welcome to the DnD game!
               Please enter your choice:
               1. Play
               2. Quit
               """);
    }

    public String askName() { // Method to ask the name of the character
        return askQuestion("Please enter your name:");

    }

    public String askType() { // Method to ask the type of the character
        return askQuestion("""
                Please choose the type of character you want to create :
                1. Warrior
                2. Wizard
                3. Quit
                """);
    }

    public String askModify(Character character) { // Method to ask the type of the character
        System.out.println(character.playerCharacterChoice());
        return askQuestion("""
                Do you want to modify your character?
                1. Name of your character
                2. Type of your character
                3. Nope""");
    }

    private String askQuestion(String question) {
        System.out.println(question);
        return sc.nextLine();
    }
}
















