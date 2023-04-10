package baseball.model;

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
}
