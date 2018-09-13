public class Defense extends Player {
    private int tackles;

    private float sacks;

    private int interceptions;

    public Defense(String position, String name, float weight, int age) {
        super(position, name, weight, age);
    }

    @Override
    public String toString() {
        return super.toString() +
                SPACING + tackles +
                SPACING + sacks +
                SPACING + interceptions;
    }

    public int getTackles() {
        return tackles;
    }

    public void setTackles(int tackles) {
        this.tackles = tackles;
    }

    public float getSacks() {
        return sacks;
    }

    public void setSacks(float sacks) {
        this.sacks = sacks;
    }

    public int getInterceptions() {
        return interceptions;
    }

    public void setInterceptions(int interceptions) {
        this.interceptions = interceptions;
    }
}
