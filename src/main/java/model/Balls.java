package model;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private final List<Ball> balls  = new ArrayList<>();

    public static Balls createBallsFactory(final int number) {
        Balls balls = new Balls();
        String[] splitNumber = String.valueOf(number).split("");

        for (String ASplitNumber : splitNumber) {
            Ball ball = new Ball(Integer.parseInt(ASplitNumber));

            balls.balls.add(ball);
        }
        return balls;
    }

    public Result compare(Balls compareBalls) {
        int balls = checkBalls(compareBalls);
        int strikes = checkStrike(compareBalls);

        return new Result(balls, strikes);
    }

    private int checkBalls(Balls compareBalls) {
        int i = 0, ballNum = 0;
        for (Ball ball : balls) {
            int ballNextToI = (i + 1) % 3;
            int ballBeforeI = (i + 2) % 3;

            if(ball.getNumber().equals(compareBalls.getBallNumber(ballNextToI)) ||
                    ball.getNumber().equals(compareBalls.getBallNumber(ballBeforeI))) ballNum++;

            i++;
        }
        return ballNum;
    }

    private int checkStrike(Balls compareBalls) {
        int i = 0, strikeNum = 0;

        for (Ball ball : balls) {
            if(ball.getNumber().equals(compareBalls.getBallNumber(i))) strikeNum++;
            i++;
        }

        return strikeNum;
    }

    private Integer getBallNumber(int index){
        return balls.get(index).getNumber();
    }
}
