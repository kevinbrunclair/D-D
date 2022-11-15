package Stuff;

public class Offensive_Equipment {
    private String type;
    private int attack_level;
    private String name;

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
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Offensive_Equipment() {
    }

    public Offensive_Equipment(String type, int attack_level, String name) {
        this.type = type;
        this.attack_level = attack_level;
        this.name = name;
    }

//    @Override
//    public String toString() {
//        return "Stuff.Offensive_Equipment{" +
//                "type='" + type + '\'' +
//                ", attack_level=" + attack_level +
//                ", name='" + name + '\'' +
//                '}';
//    }
}



