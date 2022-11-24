package Objects;

import board.Case;
import player.Personnage;
import stuff.DefensiveEquipment;

public class Potion extends DefensiveEquipment implements Case {

    public Potion(String name,int pvrendu){
        super(pvrendu, name);
    }

    @Override
    public void interact(Personnage c) {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Vous avez trouvez un " + name + " et vous augmente vos pv de " + healpoints);
        System.out.println("--------------------------------------------------------------------------");
        int damagetaken = c.getLifepoints() + healpoints;
        c.setLifepoints(damagetaken);

    }

}
