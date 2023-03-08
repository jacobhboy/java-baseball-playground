package baseball.controller;

import baseball.model.*;
import baseball.ui.input.PlayNewGameInput;
import baseball.ui.input.UserBallsInput;
import baseball.ui.output.MessageOutput;
import baseball.ui.output.ResultOutput;

public class BaseballController {
    public static void play(){
        Balls randomBalls = RandomBalls.BallsFactory();

        while(turn(randomBalls));
        MessageOutput.printGameEndMessage();

        askNewGame();
    }

    private static void askNewGame() {
        MessageOutput.printStartNewGame();

        boolean newGame = PlayNewGameInput.doesPlayerWantNewGame();

        if(newGame) play();
    }

    private static boolean turn(final Balls randomBalls) {
        MessageOutput.printNumberMessage();
        Balls userBall = UserBallsInput.getUserBall();

        while(userBall == null) MessageOutput.printUserNumberNotValid();

        Result result = CompareBalls.compareBalls(randomBalls, userBall);
        ResultOutput.printTurnResult(result);

        return isThisGameNotFinished(result);
    }

    private static boolean isThisGameNotFinished(final Result result) {
        if(result.getStrike() == 3)
            return false;

        return true;
    }
}
