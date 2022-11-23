package stuff;

public abstract class OffensiveEquipment {
    private String type;

    protected String name;
    protected int attackpoints;



    // Constructors

    public OffensiveEquipment() {
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

    @Override
    public String toString() {
        return "" +
                 name +
                " \nattackpoints = " + attackpoints
                ;
    }
}



