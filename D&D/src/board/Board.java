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
private ArrayList<Case> board = new ArrayList<Case>();
    private int nbCases;

    public Board(boolean isRandom) {

        this.nbCases = 64;

        int dragon = 4;
        int gobelin = 10;
        int sorcier = 10;

        int potionstandard = 6;
        int grandepotion = 2;

        int massue = 5;
        int epee = 4;
        int eclair = 5;
        int bouledefeu = 2;


        for (int i = 0; i < nbCases; i++) {
            board.add(new EmptyCase());
        }

        if (isRandom == true) {

            while (dragon > 0) {
                int random = randomDice();
                if (board.get(random) instanceof EmptyCase) {
                    board.set(random, new Dragon());
                    dragon--;
                }
            }

            while (gobelin > 0) {
                int random = randomDice();
                if (board.get(random) instanceof EmptyCase) {
                    board.set(random, new Gobelin());
                    gobelin--;
                }
            }
            while (sorcier > 0) {
                int random = randomDice();
                if (board.get(random) instanceof EmptyCase) {
                    board.set(random, new Sorcier());
                    sorcier--;
                }
            }
            while (potionstandard > 0) {
                int random = randomDice();
                if (board.get(random) instanceof EmptyCase) {
                    board.set(random, new PotionStandard());
                    potionstandard--;
                }
            }
            while (grandepotion > 0) {
                int random = randomDice();
                if (board.get(random) instanceof EmptyCase) {
                    board.set(random, new GrandePotion());
                    grandepotion--;
                }
            }
            while (massue > 0) {
                int random = randomDice();
                if (board.get(random) instanceof EmptyCase) {
                    board.set(random, new Massue());
                    massue--;
                }
            }
            while (epee > 0) {
                int random = randomDice();
                if (board.get(random) instanceof EmptyCase) {
                    board.set(random, new Epee());
                    epee--;
                }
            }
            while (eclair > 0) {
                int random = randomDice();
                if (board.get(random) instanceof EmptyCase) {
                    board.set(random, new Eclair());
                    eclair--;
                }
            }
            while (bouledefeu > 0) {
                int random = randomDice();
                if (board.get(random) instanceof EmptyCase) {
                    board.set(random, new BouleDeFeu());
                    bouledefeu--;
                }
            }

        } else {
            for (int i = 0; i < nbCases; i++) {
                switch (i) {
                    case 45, 52, 56, 62 -> board.set(i,new Dragon());
                    case 10, 20, 25, 32, 35, 36, 37, 40, 44, 47 -> board.set(i,new Sorcier());
                    case 3, 6, 9, 12, 15, 18, 21, 24, 27, 30 -> board.set(i,new Gobelin());
                    case 2, 11, 5, 22, 38 -> board.set(i,new Massue());
                    case 19, 26, 42, 53 -> board.set(i,new Epee());
                    case 1, 4, 8, 17, 23 -> board.set(i,new Eclair());
                    case 48, 49 -> board.set(i,new BouleDeFeu());
                    case 7, 13, 31, 33, 39, 43 -> board.set(i,new PotionStandard());
                    case 28, 41 -> board.set(i,new GrandePotion());
                    default -> board.set(i,new EmptyCase());
                }
            }
        }

    }

    public void movePlayer(Personnage character, int dice) throws CharacterOutOfPlatformException {
        if (character.getPosition() + dice >= board.size()) {
            throw new CharacterOutOfPlatformException();
        }
        character.setPosition(character.getPosition() + dice);
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

    public int randomDice(){
        int dicerand = (int) (Math.random() * 63);
        return dicerand;
    }

    public ArrayList<Case> getBoard() {
        return board;
    }
}
























