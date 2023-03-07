package baseball.model;

import java.util.List;

public class UserBalls extends Balls{
    public static Balls BallsFactory(final int number) {
        List<Ball> balls = createBalls(number);
        if(balls == null)
            return null;

        return new UserBalls(createBalls(number));
    }

    protected UserBalls(final List<Ball> balls) {
        super(balls);
    }
}
