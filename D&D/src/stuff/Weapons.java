package stuff;

public class Weapons extends OffensiveEquipment {

    public Weapons() {
        setName("Sword");
    }

    public Weapons(String type, int attack_level, String name) {
        super(type, attack_level, name);
    }
}
