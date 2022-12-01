package Objects;

public class PotionStandard extends Potion {

    public PotionStandard() {
        super("potionstandard",2);
    }

    @Override
    public String toString() {
        return "PotionStandard{" +
                "name='" + name + '\'' +
                "healpoints=" + pvrendu +
                '}';
    }

}

