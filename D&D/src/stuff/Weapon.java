package stuff;

import board.Case;
import player.Personnage;
import player.Warrior;

public class Weapon extends OffensiveEquipment implements Case {


    private void setName(String name) {
    }

    public Weapon(String name, int attack) {
        super(name, attack);
    }

    public void setAttackpoints(int attack) {

    }

    @Override
    public void interact(Personnage c) {
        if (c instanceof Warrior) {
            int attack = c.getAttackpoints() + attackpoints;
            c.setAttackpoints(attack);
            System.out.println("Vous avez trouvez une " + name + " et vous augmente vos points d'attaque de " + attackpoints);
        } else {
            System.out.println("Vous ne pouvez pas équiper l'arme");
        }

    }

}

