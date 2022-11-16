package stuff;

public class Shields extends DefensiveEquipment {

    public Shields(String type) {
        super(type);
        this.setDefense_level(10);
        this.setName("shield");

    }

//    @Override
//    public String toString() {
//        return "Protection {" +
//                "name='" + name + '\'' +
//                "type='" + type + '\'' +
//                ", defense_level=" + defense_level +
//                '}';
//    }
}

