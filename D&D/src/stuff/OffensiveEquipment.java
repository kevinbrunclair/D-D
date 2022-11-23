package stuff;

public abstract class OffensiveEquipment {
    private String type;

    protected String name;
    protected int attackpoints;
    private String nameWarrior = "Sword";
    private String nameWizard = "Fireball";

    // Constructors

    public OffensiveEquipment() {
    }

    public OffensiveEquipment(String type, int attackpoints, String name) {
        this.type = type;
        this.attackpoints = attackpoints;
        this.nameWarrior = name;
    }

    public OffensiveEquipment(String name, int attack) {
        this.name = name;
        this.attackpoints = attack;
    }

    // Setters et Getters

    public void setAttackpoints(int attackpoints) {
        this.attackpoints = attackpoints;
    }

    public int getAttackpoints() {
        return attackpoints;
    }

    public String getName() {
        return nameWarrior;
    }

    public void setName(String name) {
        this.nameWarrior = name;
    }

}



