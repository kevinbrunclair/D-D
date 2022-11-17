package stuff;

public abstract class DefensiveEquipment {
    protected int defense_Level;
    protected String name;

    // Constructors

    public DefensiveEquipment(int defense_Level, String name) {
        this.defense_Level = defense_Level;
        this.name = name;
    }

    public DefensiveEquipment() {

    }


    // Setters et Getters

    public int getDefense_Level() {
        return defense_Level;
    }

    public void setDefense_Level(int defense_Level) {
        this.defense_Level = defense_Level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}


