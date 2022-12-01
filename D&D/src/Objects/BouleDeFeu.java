package Objects;
import board.Case;
import player.Personnage;
import stuff.Spell;

public class BouleDeFeu  extends Spell implements Case {

    public BouleDeFeu() {
        super("bouledefeu",7);
    }

    @Override

    public String toString() {
        return "BouleDeFeu{" +
                "name='" + name + '\'' +
                ", attackpoints=" + attackpoints +
                '}';
    }

    @Override
    public void interact(Personnage c) {

    }

}



