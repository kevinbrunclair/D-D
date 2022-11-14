public class Game {
    private Character character; // Create a new character
    private final Menu menu = new Menu(); // Create a new object of the class Menu

    public void myGame() { // Method to start the game
        String input = menu.startGame();
        if (input.equals("1")) {
            String name = menu.askName(); // Call the method to ask the name of the character
            String type = choiceType(menu.askType()); // Call the method to ask the type of the character
            character = new Character(name, type);
            modifyCharacter(menu.askModify(character));
            System.out.println(character.playerCharacterChoice());
        } else {
            System.exit(0);
        }
    }

    private String choiceType(String choice) {
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

    private String choiceName(String choice) {
        if (choice.equals("q")) {
            System.exit(0);
        }
        return choice;
    }

    private void modifyCharacter(String choice) {
        if (choice.equals("1")) {
            character.setNom(choiceName(menu.askName()));
        } else if (choice.equals("2")) {
            character.setType(choiceType(menu.askType()));
        } else if (choice.equals("3")) {
            System.exit(0);
        } else {
            System.out.println("incorrect entry");
            modifyCharacter(menu.askModify(character));
        }
    }
}









