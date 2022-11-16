package stuff;

abstract class DefensiveEquipment {
    private String type;
    private int defense_level;
    private String name = "Shield";
    private String nameWizard = "potiondef";

    // Constructors

    public DefensiveEquipment(String type) {
        this.type = type;
    }

    public DefensiveEquipment(String type, int defense_level, String name) {
        this.type = type;
        this.defense_level = defense_level;
        this.name = name;
    }


    // Setters et Getters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDefense_level() {
        return defense_level;
    }

    public void setDefense_level(int defense_level) {
        this.defense_level = defense_level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameWizard() {
        return nameWizard;
    }

    public void setNameWizard(String nameWizard) {
        this.nameWizard = nameWizard;
    }
}


