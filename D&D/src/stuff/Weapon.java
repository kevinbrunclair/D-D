package stuff;

import board.Case;
import player.Personnage;

public class Weapon extends OffensiveEquipment implements Case{

    public Weapon() {
        setName("Sword");
    }

    public Weapon(String massue, int attack) {

    }

    public void setAttackpoints(int attack) {
    }

    @Override
    public void interact(Personnage c) {
        System.out.println("Vous avez trouver" + name);
    }
}

