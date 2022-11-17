package player;

import stuff.Potion;
import stuff.Spells;

public class Wizards extends Character {

    Potion potion = new Potion();

    Spells spells = new Spells();
    public Wizards(String name) {
        super(name);
        this.setLifepoints(6);
        this.setAttackpoints(15);

    }

    @Override
    public String toString() {
        return "Wizards {" +
                "name='" + name + '\'' +
                ", lifepoints=" + lifepoints +
                ", attackpoints = " + attackpoints +
                ", weapon=" + spells.getName()+
                ", protection = " + potion +
                '}';
    }
}
