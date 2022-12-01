package game;

import board.Board;
import menu.Menu;
import player.Personnage;
import player.Warrior;
import player.Wizard;
import singleton.Dbaccess;

import java.util.Scanner;

/**
 *
 */
public class Game {
    private Personnage character; // Create a new character
    private final Menu menu; // Create a new object of the class Menu.Menu

    Dbaccess access = Dbaccess.getInstance();

    private Board board;
    private Scanner sc;


    public Game() {
        sc = new Scanner(System.in);
        board = new Board(true);
        menu = new Menu();

    }

    /**
     * @throws Exception
     */
    public void myGame() { // Method to start the game
        String input = menu.startGame();
        if (input.equals("1")) {
            String name = menu.askName(); // Call the method to ask the name of the character
            String type = choiceType(menu.askType());// Call the method to ask the type of the character
            if (type.equals("Warrior")) {
                character = new Warrior(name);
                access.createHero("guerrier", "kev", 80, 10, "epee", "bouclier");
            } else if (type.equals("Wizard")) {
                character = new Wizard(name);
                access.createHero("magicien", "cedric", 20, 10, "baton", "boucliersupercool");
            }

        } else if (input.equals("2")) {
            access.selectHero(2);
        }


        String choicestats = menu.askShowstats();
        if (choicestats.equals("1")) { // choix d'afficher les stats
            showStats();
        } else {
            System.exit(0);
        }

        while (userWantsToModify() == true) {
            modifyCharacter(); // Call the method to ask if the user wants to modify the character
            System.out.println(character.playerCharacterChoice()); // Call the method to display the character
        }

    }

    /**
     * @return
     * @throws Exception
     */

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

    /**
     * @param choice
     * @return
     */
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


    /**
     * @param choice
     * @return
     */
    private String choiceName(String choice) { // Method to choose the name of the character
        if (choice.equals("q")) {
            System.exit(0);
        }
        return choice;
    }

    /**
     *
     */
    private void modifyCharacter() { // Method to modify the character
        // menu qui fait la demande de l'attribut a modifier
        String choice = menu.askChangeNameOrType();
        if (choice.equals("1")) {
            character.setName(choiceName(menu.askName()));
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
     */

    private void showStats() {
        System.out.println(character);
    }

    /**
     * @return
     */


    private int rollDice() {
        int dice = (int) (Math.random() * 6 + 1);
        System.out.println("Résultat du dé : " + dice);
        return dice;
    }

    /**
     * @throws Exception
     */
    private void startMainGame() {
        System.out.println("Launch the game ?");
        String choice = menu.askQuestion("1. Yes\n2. No");
        if (choice.equals("1")) {
            System.out.println("Game started");
            playATurn();
        } else {
            System.out.println("Game stopped");
            System.exit(0);
        }
    }

    /**
     * @throws Exception
     */
    private void playATurn() {
        int position = 0;
        boolean isRandom = false;
        Board boardarray = new Board(isRandom);
        try {
            while (character.getLifepoints() > 0) {
                int dice = rollDice();
                board.movePlayer(character, dice);
                position += dice; //
                System.out.println("Press enter to continue");
                sc.nextLine();
                board.displayGameBoard(character);
                boardarray.getBoard().get(position).interact(this.character);
                board.displayGameBoard(character);
                System.out.println(character);

            }
            if (character.getLifepoints() <= 0) {
                characterisDead();

            }
        } catch (CharacterOutOfPlatformException e) {
            System.out.println(e);
            String choice = menu.endGame();
            if (choice.equals("1")) {
                myGame();
            } else if (choice.equals("2")) {
                System.exit(0);
            }

        }
    }

    public void characterisDead() {
        if (character.getLifepoints() <= 0) {
            System.out.println("You are dead : GAME OVER !! ");
            myGame();
        }
    }
}



















