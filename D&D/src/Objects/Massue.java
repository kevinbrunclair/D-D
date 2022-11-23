package Objects;

import board.Case;
import player.Personnage;
import stuff.Weapon;

public class Massue extends Weapon{

    public Massue() {
        super("massue",3);

    }


    @Override
    public String toString() {
        return "Massues {" +
                "name ='" + name + '\'' +
                ", attackpoints=" + attackpoints +
                '}';
    }

}

