package stuff;

abstract class OffensiveEquipment {
    private String type;
    private int attack_level;
    private String nameWarrior = "Sword";
    private String nameWizard = "Fireball";

    // Constructors

    public OffensiveEquipment() {
    }

    public OffensiveEquipment(String type, int attack_level, String name) {
        this.type = type;
        this.attack_level = attack_level;
        this.nameWarrior = name;
    }

    // Setters et Getters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAttack_level() {
        return attack_level;
    }

    public void setAttack_level(int attack_level) {
        this.attack_level = attack_level;
    }

    public String getName() {
        return nameWarrior;
    }

    public void setName(String name) {
        this.nameWarrior = name;
    }

    public String getNameWizard() {
        return nameWizard;
    }

    public void setNameWizard(String nameWizard) {
        this.nameWizard = nameWizard;
    }


    public String getNameWarrior() {
        return nameWarrior;
    }
}



