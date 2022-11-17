package player;


import stuff.Shield;
import stuff.Weapons;

public class Warriors extends Character {

    Shield shield = new Shield();
    Weapons weapon = new Weapons();

    public Warriors(String name) {
        super(name);
        this.setLifepoints(10);
        this.setAttackpoints(10);

    }


    @Override
    public String toString() {
        return "Warriors " +  '\n' +
                "name = " + name + '\n' +
                "Lifepoints = " + lifepoints + '\n' +
                "Attackpoints = " + attackpoints + '\n' +
                "Weapon equiped = " + weapon.getName() + '\n' +
                "Protection = {" + shield + "}\n" +
                '}';
    }

}
