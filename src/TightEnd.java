public class TightEnd extends Player {
    private int receptions;

    private int receptionYards;

    private int rushes;

    private int rushingYards;

    private int touchdowns;

    @Override
    public String toString() {
        return "TightEnd{" +
                "receptions=" + receptions +
                ", receptionYards=" + receptionYards +
                ", rushes=" + rushes +
                ", rushingYards=" + rushingYards +
                ", touchdowns=" + touchdowns +
                ", fumbles=" + fumbles +
                "} " + super.toString();
    }

    private int fumbles;

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
