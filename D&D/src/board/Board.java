package board;

import Objects.*;
import enemy.Dragon;
import enemy.Gobelin;
import enemy.Sorcier;
import player.Personnage;
import game.CharacterOutOfPlatformException;
import java.util.ArrayList;

public class Board {

    static ArrayList<Case> board = new ArrayList<Case>();

    public static ArrayList<Case> getBoard() {

        board.add(new EmptyCase()); // START
        board.add(new Eclair()); // case 1
        board.add(new Massue()); // case 2
        board.add(new Gobelin()); // case 3
        board.add(new Eclair()); // case 4
        board.add(new Massue()); // case 5
        board.add(new Gobelin()); // case 6
        board.add(new PotionStandard()); // case 7
        board.add(new Eclair()); // case 8
        board.add(new Gobelin()); // case 9
        board.add(new Sorcier()); // case 10
        return board;
    }

    public void movePlayer(Personnage character, int dice) throws CharacterOutOfPlatformException {
        if (character.getPosition() + dice >= board.size()) {
            throw new CharacterOutOfPlatformException();
        }
        character.setPosition(character.getPosition() + dice);
    }

}





















