package board;

import Objects.*;
import enemy.Dragon;
import enemy.Gobelin;
import enemy.Sorcier;
import player.Personnage;
import game.CharacterOutOfPlatformException;

import java.nio.charset.CharacterCodingException;
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
        board.add(new Massue()); // case 11
        board.add(new Gobelin()); // case 12
        board.add(new PotionStandard()); // case 13
        board.add(new EmptyCase()); // case 14
        board.add(new Gobelin()); // case 15
        board.add(new EmptyCase()); // case 14
        board.add(new Eclair()); // case 17
        board.add(new Gobelin()); // case 18
//        board.add(new Epee()); // case 19
//        board.add(new Sorcier()); // case 20









//        board.add(new Epee());
//        board.add(new Dragon());
//        board.add(new BouleDeFeu());

        return board;
    }

    public void movePlayer(Personnage character, int dice) throws CharacterOutOfPlatformException {
        if (character.getPosition() + dice >= board.size()) {
            throw new CharacterOutOfPlatformException();
        }
        character.setPosition(character.getPosition() + dice);
    }
}





















