package game;

public class CharacterOutOfPlatformException extends Exception {

    @Override
    public String toString() {
        return "Your Character Is Out Of Board";
    }


}
