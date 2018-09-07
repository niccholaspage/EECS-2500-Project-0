public class Defensive extends Player {
    private int tackles;

    private float sacks;

    private int interceptions;

    @Override
    public String toString() {
        return super.toString() +
                ", Tackles: " + tackles +
                ", Sacks: " + sacks +
                ", Interceptions: " + interceptions;
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
