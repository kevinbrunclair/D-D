public class Character {
    private String name;
    private String type;

    private int lifepoints;

    private int attackpoints;


    // Constructors

    public Character() {
    }

    public Character(String name) {
        this.name = name;
    }

    public Character(String name, String type) {
        this.name = name;
        this.type = type;
    }


    // Getter and Setter

    public String getName() {
        return name;
    }

    public void setNom(String nom) {
        this.name = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLifepoints() {
        return lifepoints;
    }

    public void setLifepoints(int lifepoints) {
        this.lifepoints = lifepoints;
    }

    public int getAttackpoints() {
        return attackpoints;
    }

    public void setAttackpoints(int attackpoints) {
        this.attackpoints = attackpoints;
    }

    @Override
    public String toString() {
        return "Characters {" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", lifepoints=" + lifepoints +
                ", attackpoints=" + attackpoints +
                '}';
    }
}






