package stuff;

import board.Case;
import player.Personnage;

public class Spell extends OffensiveEquipment implements Case {

    public Spell(String name, int attack) {
        super(name,attack);
    }

    public Spell() {
    }

    @Override
    public void interact(Personnage c) {
        System.out.println("Vous avez trouver un " + name + "qui a" + attackpoints + "atk");
    }
}
