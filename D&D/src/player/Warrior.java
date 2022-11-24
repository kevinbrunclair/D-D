package player;


import stuff.Shield;
import stuff.Weapon;

public class Warrior extends Personnage {




    public Warrior(String name) {
        super(name);
        this.setLifepoints(10);
        this.setAttackpoints(10);
        this.WeaponOf = new Weapon("axe",1);
        this.WeaponDef = new Shield("shield",3);
    }


    @Override
    public String toString() {
        return "Warriors " +  '\n' +
                "name = " + name + '\n' +
                "Lifepoints = " + lifepoints + '\n' +
                "Attackpoints = " + attackpoints + '\n' +
                "Weapon equiped = " + WeaponOf + '\n' +
                "Protection : " +  WeaponDef + "\n"
                ;
    }

}
