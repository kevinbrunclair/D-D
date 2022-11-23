package enemy;

import board.Case;
import player.Personnage;

public class Enemy extends Personnage implements Case {



    public Enemy(int name) {
        super(name);
    }

    public Enemy(String name, int attack, int pv) {
        super(name);
    }

    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", lifepoints=" + lifepoints +
                ", attackpoints=" + attackpoints +
                '}';
    }

    @Override
    public void interact(Personnage c) {
        System.out.println("Vous avez trouvez un " + name + "ayant" + lifepoints + "pv" + attackpoints + "atk");
    }
}
