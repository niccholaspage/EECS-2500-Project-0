public class Quarterback extends Player {
    private int passAttempts;

    private int passCompletions;

    private int passingYards;

    private int rushingAttempts;

    private int rushingYards;

    private int touchdowns;

    private int interceptions;

    private int fumbles;

    @Override
    public String toString() {
        return "Quarterback{" +
                "passAttempts=" + passAttempts +
                ", passCompletions=" + passCompletions +
                ", passingYards=" + passingYards +
                ", rushingAttempts=" + rushingAttempts +
                ", rushingYards=" + rushingYards +
                ", touchdowns=" + touchdowns +
                ", interceptions=" + interceptions +
                ", fumbles=" + fumbles +
                ", sacks=" + sacks +
                "} " + super.toString();
    }

    private int sacks;

    public int getPassCompletions() {
        return passCompletions;
    }

    public void setPassCompletions(int passCompletions) {
        this.passCompletions = passCompletions;
    }

    public int getPassingYards() {
        return passingYards;
    }

    public void setPassingYards(int passingYards) {
        this.passingYards = passingYards;
    }

    public int getRushingAttempts() {
        return rushingAttempts;
    }

    public void setRushingAttempts(int rushingAttempts) {
        this.rushingAttempts = rushingAttempts;
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

    public int getInterceptions() {
        return interceptions;
    }

    public void setInterceptions(int interceptions) {
        this.interceptions = interceptions;
    }

    public int getFumbles() {
        return fumbles;
    }

    public void setFumbles(int fumbles) {
        this.fumbles = fumbles;
    }

    public int getSacks() {
        return sacks;
    }

    public void setSacks(int sacks) {
        this.sacks = sacks;
    }

    public int getPassAttempts() {
        return passAttempts;
    }

    public void setPassAttempts(int passAttempts) {
        this.passAttempts = passAttempts;
    }
}
