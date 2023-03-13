package controller;

import model.Result;
import model.ball.Balls;
import view.input.RandomNumber;
import view.input.UserNumber;


import static view.output.MessageOutput.*;
import static view.output.ResultOutput.*;

public class BaseballController {
    private static final int MORE_PLAY_NUMBER = 1;
    public static final int THREE_STRIKE = 3;

    public static void play(){
        Balls randomBalls = Balls.create(RandomNumber.getRandomNumber());

        while(turn(randomBalls));

        tellGameEnd();
        askRegame();

        if(UserNumber.getRegameNumber() == MORE_PLAY_NUMBER) play();
    }

    private static boolean turn(final Balls randomBalls) {
        askNumber();

        Balls userBalls = Balls.create(UserNumber.getUserNumber());
        Result result = randomBalls.compare(userBalls);

        printTurnResult(result);

        return result.getStrikes() != THREE_STRIKE;
    }
}
