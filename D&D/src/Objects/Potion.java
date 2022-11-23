package Objects;

import board.Case;
import player.Personnage;
import stuff.DefensiveEquipment;

public class Potion extends DefensiveEquipment implements Case {

    public Potion(String name,int pvrendu){
        super(name);
    }

    @Override
    public void interact(Personnage c) {
        System.out.println("Vous avez trouver " + name);
    }

}
