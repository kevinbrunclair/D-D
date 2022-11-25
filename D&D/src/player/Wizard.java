package player;

import stuff.Philter;
import stuff.Spell;
import stuff.Weapon;

public class Wizard extends Personnage {


    public Wizard(String name) {
        super(name);
        this.setLifepoints(6);
        this.setAttackpoints(10);
        this.WeaponOf = new Weapon("Fireball", 1);
        this.WeaponDef = new Philter("Philter", 1);
    }

    @Override
    public String toString() {
        return "Warriors " +  '\n' +
                "name = " + name + '\n' +
                "Lifepoints = " + lifepoints + '\n' +
                "Attackpoints = " + attackpoints + '\n' +
                "Weapon equiped = " + WeaponOf + '\n' +
                "Protection : " +  "" + WeaponDef + "\n"
                ;
    }
}
