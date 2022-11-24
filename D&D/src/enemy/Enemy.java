package enemy;

import board.Case;
import player.Personnage;

public class Enemy extends Personnage implements Case {

    public Enemy(int name) {
        super(name);
    }

    public Enemy(String name, int attack, int pv) {
        super(name,attack,pv);
    }


    public String toString() {
        return "Enemy" +
                "name='" + name + '\'' +
                ", lifepoints=" + lifepoints +
                ", attackpoints=" + attackpoints +
                '}';
    }

    @Override
    public void interact(Personnage c) {
        int damagetaken = c.getLifepoints() - attackpoints;
        c.setLifepoints(damagetaken);
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Vous avez trouvez un " + name + " ayant " + lifepoints + " pv " + attackpoints + " atk " + " Vous prenez " + attackpoints);
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
    }
}
