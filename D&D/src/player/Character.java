package player;

//import Stuff.Defensive_Equipment;
//import Stuff.Offensive_Equipment;

public abstract class Character {
    protected String name;

    protected int lifepoints;
   protected int attackpoints;

   protected int position;



    // Constructors
    public Character(String name){
        this.name = name;
    }
    public Character(int position) {
        this.position = position;
    }

    // Getter and Setter -> Setter pour affecter -> Getter pour récupérer

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String playerCharacterChoice(){
        return "Your character is named " + name;
    }

    public void setType(String choiceType) {
    }
}






