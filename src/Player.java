public class Player {
    protected static final String SPACING = "    ";

    private String position;

    private String name;

    private float weight;

    private int age;

    public Player(String position, String name, float weight, int age) {
        this.position = position;

        this.name = name;

        this.weight = weight;

        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return position +
                SPACING + name +
                SPACING + weight +
                SPACING + age;
    }
}
