package stuff;

public abstract class DefensiveEquipment {
    protected int defense_Level;
    protected String name;
    protected int healpoints;

    // Constructors

    public DefensiveEquipment(int pv, String name, int def) {
        this.name = name;
        this.healpoints = pv;
        this.defense_Level = def;
    }


    public DefensiveEquipment(int def, String name) {
        this.defense_Level=def;
        this.name=name;
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

    @Override
    public String toString() {
        return "" +
                name +
                " deflvl = " + '\n' + defense_Level
                ;
    }
}


