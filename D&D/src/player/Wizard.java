package player;

import stuff.Philter;
import stuff.Spell;

public class Wizard extends Personnage {

    Philter philter = new Philter();

    Spell spell = new Spell();
    public Wizard(String name) {
        super(name);
        this.setLifepoints(6);
        this.setAttackpoints(15);

    }

    @Override
    public String toString() {
        return "Wizards " + '\n' +
                "name='" + name + '\n' +
                " lifepoints=" + lifepoints + '\n' +
                " attackpoints = " + attackpoints + '\n' +
                " weapon=" + spell.getName()+ '\n' +
                " protection = " + philter + '\n' +
                '}';
    }
}
