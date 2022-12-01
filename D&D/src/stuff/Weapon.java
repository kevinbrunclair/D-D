package stuff;

import board.Case;
import player.Personnage;
import player.Warrior;

public class Weapon extends OffensiveEquipment implements Case {

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
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("Vous avez trouvez une "+ name +" et vous augmente vos points d'attaques de " + attackpoints);
            System.out.println("-------------------------------------------------------------------------------------------");
        } else {
            System.out.println("-------------------------------------------------------");
            System.out.println("Vous trouvez une "+ name +" mais vous ne pouvez pas l'équiper");
            System.out.println("-------------------------------------------------------");
        }

    }

}

