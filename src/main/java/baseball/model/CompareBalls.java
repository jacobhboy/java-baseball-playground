package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class CompareBalls {

    public static Result compareBalls(final Balls randomBalls, final Balls userBalls){
        int ball = checkBall(randomBalls, userBalls);
        int strike = checkStrike(randomBalls, userBalls);

        return new Result(ball, strike);
    }

    private static int checkStrike(final Balls randomBalls, final Balls userBalls) {
        int strike = 0;
        for(int i=0, ballsSize = Balls.BALLSSIZE; i < ballsSize ;i++){
            if(randomBalls.getBallNumber(i).equals( userBalls.getBallNumber(i))) strike++;
        }
        return strike;
    }

    private static int checkBall(final Balls randomBalls, final Balls userBalls) {
        int ball = 0;
        for(int i=0, ballsSize = Balls.BALLSSIZE; i < ballsSize ;i++){
            int nextNumber = (i+1) % 3;
            int beforeNumber = (i+2) % 3;

            if(userBalls.getBallNumber(i).equals(randomBalls.getBallNumber(nextNumber)) ||
                    userBalls.getBallNumber(i).equals(randomBalls.getBallNumber(beforeNumber)))
                ball++;

        }
        return ball;
    }

    private static List<Integer> result(final int ball, final int strike) {
        if(strike == 0 && ball == 0) return null;

        ArrayList<Integer> result = new ArrayList<>();
        result.add(ball);
        result.add(strike);

        System.out.println(result);

        return result;
    }
}
