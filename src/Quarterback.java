public class Quarterback extends Player {
    private int passAttempts;

    private int passCompletions;

    private int passingYards;

    private int rushingAttempts;

    private int rushingYards;

    private int touchdowns;

    private int interceptions;

    private int fumbles;
    private int sacks;

    public Quarterback(String position, String name, float weight, int age) {
        super(position, name, weight, age);
    }

    @Override
    public String toString() {
        return super.toString() +
                SPACING + passAttempts +
                SPACING + passCompletions +
                SPACING + passingYards +
                SPACING + rushingAttempts +
                SPACING + rushingYards +
                SPACING + touchdowns +
                SPACING + interceptions +
                SPACING + fumbles +
                SPACING + sacks;
    }

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
