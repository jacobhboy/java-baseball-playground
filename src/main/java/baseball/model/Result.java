package baseball.model;

public class Result {
    private final int strike;
    private final int ball;

    public Result(final int ball, final int strike){
        this.ball = ball;
        this.strike = strike;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }
}
