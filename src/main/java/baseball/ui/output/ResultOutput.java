package baseball.ui.output;

import baseball.model.Ball;
import baseball.model.Result;

import java.util.List;

public class ResultOutput {
    private static final String BALLRESULT = "%d볼 ";
    private static final String STRIKERESULT = "%d스트라이크";
    private static final String NOTHING = "NOTHING";

    public static void printTurnResult(Result result){

        checkNothing(result);
        checkJustBall(result);
        checkJustStrike(result);
    }

    private static void checkJustBall(Result result) {
        if(result.getBall() > 0)
            System.out.println(String.format(BALLRESULT, result.getBall()));
    }

    private static void checkJustStrike(Result result) {
        if(result.getStrike() > 0)
            System.out.println(String.format(STRIKERESULT, result.getStrike()));
    }

    private static void checkNothing(Result result) {
        if(result.getBall() == 0 && result.getStrike() > 0)
            System.out.println(NOTHING);
    }
}
