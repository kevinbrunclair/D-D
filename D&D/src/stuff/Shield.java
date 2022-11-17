package stuff;

public class Shield extends DefensiveEquipment {

    public Shield() {
        super(3,"Shield");
    }


    @Override
    public String toString() {
        return name + ", " + "leveldefshield = " + defense_Level;
    }
}


