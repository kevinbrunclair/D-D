package player;


import stuff.Shield;
import stuff.Weapon;

public class Warrior extends Personnage {

    Shield shield = new Shield();
    Weapon weapon = new Weapon();

    public Warrior(String name) {
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
