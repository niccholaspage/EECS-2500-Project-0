public class Receiver extends Player {
    private int receptions;

    private int receptionYards;

    private int rushes;

    private int rushingYards;

    private int touchdowns;

    private int fumbles;

    @Override
    public String toString() {
        return super.toString() + ", " +
                "Receptions: " + receptions +
                ", Reception Yards: " + receptionYards +
                ", Rushes: " + rushes +
                ", Rushing Yards: " + rushingYards +
                ", Touchdowns: " + touchdowns +
                ", Fumbles: " + fumbles;
    }

    public int getReceptions() {
        return receptions;
    }

    public void setReceptions(int receptions) {
        this.receptions = receptions;
    }

    public int getReceptionYards() {
        return receptionYards;
    }

    public void setReceptionYards(int receptionYards) {
        this.receptionYards = receptionYards;
    }

    public int getRushes() {
        return rushes;
    }

    public void setRushes(int rushes) {
        this.rushes = rushes;
    }

    public int getRushingYards() {
        return rushingYards;
    }

    public void setRushingYards(int rushingYards) {
        this.rushingYards = rushingYards;
    }

    public int getTouchdowns() {
        return touchdowns;
    }

    public void setTouchdowns(int touchdowns) {
        this.touchdowns = touchdowns;
    }

    public int getFumbles() {
        return fumbles;
    }

    public void setFumbles(int fumbles) {
        this.fumbles = fumbles;
    }
}
