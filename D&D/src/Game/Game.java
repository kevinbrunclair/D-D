package Game;

import Menu.Menu;
import Player.Character;


public class Game {
    private Character character; // Create a new character
    private final Menu menu = new Menu(); // Create a new object of the class Menu.Menu

    public void myGame() { // Method to start the game
        String input = menu.startGame();
        if (input.equals("1")) {
            String name = menu.askName(); // Call the method to ask the name of the character
            String type = choiceType(menu.askType()); // Call the method to ask the type of the character
            String choicestats = menu.askShowstats();
            character = new Character(name, type); // Create a new character
            if (choicestats.equals("1")) { // choix d'afficher les stats
                showStats();
            } else {
                System.exit(0);
            }

            while (userWantsToModify() == true) {
                modifyCharacter(); // Call the method to ask if the user wants to modify the character
                System.out.println(character.playerCharacterChoice()); // Call the method to display the character
            }

        } else {
            System.exit(0);
        }

    }


    private boolean userWantsToModify() {
        String choice = menu.askModify();
        if (choice.equals("1")) {
            return true;
        }
        System.out.println("Your character is created !");
        System.out.println(character.playerCharacterChoice());
        startMainGame();
        return false;
    }

    private String choiceType(String choice) { // Method to choose the type of the character
        if (choice.equals("1")) {
            return "Warrior";
        } else if (choice.equals("2")) {
            return "Wizard";
        } else if (choice.equals("3")) {
            System.exit(0);
            return null;
        } else {
            System.out.println("incorrect entry");
            return choiceType(menu.askType());
        }
    }

    private String choiceName(String choice) { // Method to choose the name of the character
        if (choice.equals("q")) {
            System.exit(0);
        }
        return choice;
    }

    private void modifyCharacter() { // Method to modify the character
        // menu qui fait la demande de l'attribut a modifier
        String choice = menu.askChangeNameOrType();
        if (choice.equals("1")) {
            character.setNom(choiceName(menu.askName()));
        } else if (choice.equals("2")) {
            character.setType(choiceType(menu.askType()));
        } else if (choice.equals("3")) {
            System.exit(0);
        } else {
            System.out.println("incorrect entry");
        }
    }

    /**
     * Method to show the stats of the character
     *
     */
    private void showStats() {
        System.out.println(character);
    }


    private int rollDice() {
        int dice = (int) (Math.random() * 6) + 1;
        System.out.println(dice);
        return dice;
    }

    private void startMainGame() {
        System.out.println("Launch the game ?");
        String choice = menu.askQuestion("1. Yes\n2. No");
        if (choice.equals("1")) {
            System.out.println("Game started");
            showPositionOnBoardGame();
        } else {
            System.out.println("Game stopped");
            System.exit(0);
        }
    }

    private void showPositionOnBoardGame() {

        int position = 0;
        while (position < 64) {
            int dice = rollDice();
            position += dice;
            System.out.println("You are on the case " + position);
            if (position >= 64) {
                String choice = menu.endGame();
                if (choice.equals("1")) {
                    myGame();
                } else if (choice.equals("2")) {
                    System.exit(0);
                }
            }

        }
    }
}














