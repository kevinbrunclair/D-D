package Player;

import Stuff.Defensive_Equipment;
import Stuff.Offensive_Equipment;

public class Character {
    private String name;
    private String type;

    private int lifepoints;
    private Defensive_Equipment weapondef = new Defensive_Equipment();
    private Offensive_Equipment weaponoff = new Offensive_Equipment();

    private int attackpoints;

    private int position;


    // Constructors

    public Character(String name, String type) {
        this.type = type;
        this.name = name;
        if (type.equals("Warrior")){
            this.lifepoints = 10;
            this.attackpoints = 10;
        } else {
            this.lifepoints = 6;
            this.attackpoints = 15;
        }
    }


    public Character(int position) {
        this.position = position;
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

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
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

    public String playerCharacterChoice(){
        return "Your character is named " + name + " and your are a " + type;
    }

}






