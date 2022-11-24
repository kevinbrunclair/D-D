package board;

import Objects.*;
import enemy.Dragon;
import enemy.Gobelin;
import enemy.Sorcier;
import player.Personnage;
import game.CharacterOutOfPlatformException;

import java.util.ArrayList;
import java.util.Random;

public class Board {

    static ArrayList<Case> board = new ArrayList<Case>();
    private int nbCases;

    public static ArrayList<Case> getBoard() {

        return board;
    }

    public void movePlayer(Personnage character, int dice) throws CharacterOutOfPlatformException {
        if (character.getPosition() + dice >= board.size()) {
            throw new CharacterOutOfPlatformException();
        }
        character.setPosition(character.getPosition() + dice);
    }

    public Board() {
        this.nbCases = 64;
        for (int i = 0; i < nbCases; i++) {
            switch (i) {
                case 45, 52, 56, 62 -> board.add(new Dragon());
                case 10, 20, 25, 32, 35, 36, 37, 40, 44, 47 -> board.add(new Sorcier());
                case 3, 6, 9, 12, 15, 18, 21, 24, 27, 30 -> board.add(new Gobelin());
                case 2, 11, 5, 22, 38 -> board.add(new Massue());
                case 19, 26, 42, 53 -> board.add(new Epee());
                case 1, 4, 8, 17, 23 -> board.add(new Eclair());
                case 48, 49 -> board.add(new BouleDeFeu());
                case 7, 13, 31, 33, 39, 43 -> board.add(new PotionStandard());
                case 28, 41 -> board.add(new GrandePotion());
                default -> board.add(new EmptyCase());
            }
        }
    }

    public void boardRandom() {
        this.nbCases = 64;
        for (int i = 0; i < nbCases; i++) {
            Random rand = new Random();
            int random = rand.nextInt(64);
            switch (random) {
                case 45, 52, 56, 62 -> board.add(new Dragon());
                case 10, 20, 25, 32, 35, 36, 37, 40, 44, 47 -> board.add(new Sorcier());
                case 3, 6, 9, 12, 15, 18, 21, 24, 27, 30 -> board.add(new Gobelin());
                case 2, 11, 5, 22, 38 -> board.add(new Massue());
                case 19, 26, 42, 53 -> board.add(new Epee());
                case 1, 4, 8, 17, 23 -> board.add(new Eclair());
                case 48, 49 -> board.add(new BouleDeFeu());
                case 7, 13, 31, 33, 39, 43 -> board.add(new PotionStandard());
                case 28, 41 -> board.add(new GrandePotion());
                default -> board.add(new EmptyCase());
            }
        }
    }

    public void displayGameBoard(Personnage c) {
        System.out.print("Your Board: ");
        for (int i = 0; i < board.size(); i++) {
            if (c.getPosition() == i) {
                System.out.print("YOU-ARE-HERE|");
            } else {
                System.out.print("...|");
            }
        }
        System.out.println(" ");
    }
}
























