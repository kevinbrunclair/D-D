package stuff;

import board.Case;
import player.Personnage;
import player.Warrior;
import player.Wizard;

public class Spell extends OffensiveEquipment implements Case {

    public Spell(String name, int attack) {
        super(name, attack);
    }


    public Spell(String name) {
    }

    @Override
    public void interact(Personnage c) {
        if (c instanceof Wizard) {
            int damagetaken = c.getAttackpoints() + attackpoints;
            c.setAttackpoints(damagetaken);
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Vous avez trouver un " + name + " + " + attackpoints + " atk pour vous ");
            System.out.println("-----------------------------------------------------------------------");
        }else{
            System.out.println("-------------------------------------------------------");
            System.out.println("Vous trouvez une arme mais vous ne pouvez pas l'équiper");
            System.out.println("-------------------------------------------------------");
        }
    }
}



