package Objects;

import board.Case;
import player.Personnage;
import stuff.Spell;


public class Eclair extends Spell {

    public Eclair() {
        super("eclair",1);
    }

    @Override
    public String toString() {
        return "Eclair{" +
                "name='" + name + '\'' +
                "attackpoints=" + attackpoints +
                '}';
    }

}

