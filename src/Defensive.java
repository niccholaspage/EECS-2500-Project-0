public class Defensive extends Player {
    private int tackles;

    private float sacks;

    @Override
    public String toString() {
        return "Defensive{" +
                "tackles=" + tackles +
                ", sacks=" + sacks +
                ", interceptions=" + interceptions +
                "} " + super.toString();
    }

    private int interceptions;

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
