package stuff;

public class Philter extends DefensiveEquipment {

    public Philter() {
        super(3,"PhilterOfProtection");
    }

    @Override
    public String toString() {
        return name + ", " + "leveldefpotion = " + defense_Level ;
    }
}



