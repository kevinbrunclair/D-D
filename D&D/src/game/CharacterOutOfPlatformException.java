package game;

public class CharacterOutOfPlatformException extends Exception {

    @Override
    public String toString() {
        return "You win";
    }

}
