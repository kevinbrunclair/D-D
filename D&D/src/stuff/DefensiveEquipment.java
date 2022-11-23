package stuff;

public abstract class DefensiveEquipment {
    protected int defense_Level;
    protected String name;
    protected int healpoints;

    // Constructors

    public DefensiveEquipment(int defense_Level, String name) {
        this.defense_Level = defense_Level;
        this.name = name;
    }


    public DefensiveEquipment(String name) {

    }


    // Setters et Getters


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


