package baseball.ui.output;

import baseball.model.Result;


public class ResultOutput {
    private static final String BALLRESULT = "%d볼";
    private static final String STRIKERESULT = "%d스트라이크";
    private static final String BALLANDSTRIKERESULT = "%d볼 %d스트라이크";
    private static final String NOTHING = "NOTHING";

    public static void printTurnResult(final Result result){
        checkNothing(result);
        checkJustBall(result);
        checkJustStrike(result);
        checkBallAndStrike(result);
    }

    private static void checkJustBall(final Result result) {
        if(result.getBall() > 0 && result.getStrike() == 0)
            System.out.println(String.format(BALLRESULT, result.getBall()));
    }

    private static void checkJustStrike(final Result result) {
        if(result.getStrike() > 0 && result.getBall() == 0)
            System.out.println(String.format(STRIKERESULT, result.getStrike()));
    }

    private static void checkBallAndStrike(final Result result) {
        if(result.getStrike() > 0 && result.getBall() > 0)
            System.out.println(String.format(BALLANDSTRIKERESULT, result.getBall(), result.getStrike()));
    }

    private static void checkNothing(final Result result) {
        if(result.getBall() == 0 && result.getStrike() == 0)
            System.out.println(NOTHING);
    }
}
