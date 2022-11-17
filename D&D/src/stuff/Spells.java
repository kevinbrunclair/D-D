package stuff;

public class Spells extends OffensiveEquipment {

    public Spells() {
        setName("Fireball");
    }

    public Spells(String type, int attack_level, String name) {
        super(type, attack_level, name);
    }
}
