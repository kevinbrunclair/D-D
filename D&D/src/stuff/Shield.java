package stuff;

public class Shield extends DefensiveEquipment {

    public Shield() {
        super("Shield",3);
    }

    public Shield(String name, int def) {
        super(def, name);
    }


    @Override
    public String toString() {
        return name + "leveldefshield = " + defense_Level;
    }
}


