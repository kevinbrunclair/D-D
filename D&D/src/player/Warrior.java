package player;


import stuff.Shield;
import stuff.Weapon;

public class Warrior extends Personnage {




    public Warrior(String name) {
        super(name);
        this.setLifepoints(9);
        this.setAttackpoints(7);
        this.WeaponOf = new Weapon("axe",1);
        this.WeaponDef = new Shield("shield",3);
    }

    public Warrior(String type, String nom, int niveauvie, int niveauforce, String armeetousort, String bouclier){
        this.type = type;
        this.name = nom;
        this.lifepoints = niveauvie;
        this.attackpoints = niveauforce;
        getWeaponOf().setName(armeetousort);
        getWeaponDef().setName(bouclier);
    }




    @Override
    public String toString() {
        return "Warriors " +  '\n' +
                "name = " + name + '\n' +
                "Lifepoints = " + lifepoints + '\n' +
                "Attackpoints = " + attackpoints + '\n' +
                "Weapon equiped = " + WeaponOf + '\n' +
                "Protection : " +'\n'+  WeaponDef + "\n"
                ;
    }

}
