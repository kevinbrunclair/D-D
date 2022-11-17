package stuff;

public class Potion extends DefensiveEquipment {

    public Potion() {
        super(3,"PotionOfProtection");
    }

    @Override
    public String toString() {
        return name + ", " + "leveldefpotion = " + defense_Level ;
    }
}



