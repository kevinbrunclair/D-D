package Objects;

import board.Case;
import player.Personnage;
import stuff.DefensiveEquipment;

public abstract class Potion implements Case {

    protected final String name;

    protected final int pvrendu;

    public Potion(String name, int pvrendu){
        this.name = name;
        this.pvrendu = pvrendu;
    }

    @Override
    public void interact(Personnage c) {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Vous avez trouvez un " + name + " et vous augmente vos pv de " + pvrendu);
        System.out.println("--------------------------------------------------------------------------");
        int damagetaken = c.getLifepoints() + pvrendu;
        c.setLifepoints(damagetaken);
    }
}
