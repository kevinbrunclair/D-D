package enemy;

import board.Case;
import player.Personnage;

public class Gobelin extends Enemy{

    public Gobelin() {
        super("Gobelin", 1, 12);
    }

    @Override
    public String toString() {
        return "Gobelin{" +
                "name='" + name + '\'' +
                ", lifepoints=" + lifepoints +
                ", attackpoints=" + attackpoints +
                '}';
    }
}

