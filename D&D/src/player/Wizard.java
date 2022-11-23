package player;

import stuff.Philter;
import stuff.Spell;
import stuff.Weapon;

public class Wizard extends Personnage {


    public Wizard(String name) {
        super(name);
        this.setLifepoints(6);
        this.setAttackpoints(15);
        this.WeaponOf = new Weapon("Fireball", 1);
        this.WeaponDef = new Philter("Philter", 1);
    }
}
