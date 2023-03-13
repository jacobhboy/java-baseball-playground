package model;

public class Result {
    private final int balls;

    private final int strikes;
    public Result(final int balls, final int strikes) {
        this.balls = balls;
        this.strikes = strikes;
    }

    public int getBalls() {
        return balls;
    }

    public int getStrikes() {
        return strikes;
    }
}
