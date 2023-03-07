package baseball.model;

import java.util.List;
import java.util.Random;

public class RandomBalls extends Balls {
    public static Balls BallsFactory() {
        int randomNumber = createRandomBalls();
        if(createBalls(randomNumber) == null)
            return BallsFactory();

        return new RandomBalls(createBalls(randomNumber));
    }

    private static int createRandomBalls(){
        Random randomNumber = new Random();
        return randomNumber.nextInt() % 1000;
    }

    protected RandomBalls(final List<Ball> balls) {
        super(balls);
    }
}
