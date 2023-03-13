package view.output;

import model.Result;

public class ResultOutput {
    private static final String TURN_RESULT_BALL_AND_STRIKE = "%d볼 %d스트라이크";
    private static final String TURN_RESULT_BALL = "%d볼";
    private static final String TURN_RESULT_STRIKE = "%d스트라이크";
    private static final String MISSING = "미씽";

    public static void printTurnResult(Result result){
        if (ballAndStrikeExist(result)) return;
        if (onlyBallExist(result)) return;
        if (onlyStrikeExist(result)) return;
        System.out.println(MISSING);
    }

    private static boolean ballAndStrikeExist(Result result) {
        if(result.getBalls() != 0 && result.getStrikes() != 0) {
            System.out.printf(TURN_RESULT_BALL_AND_STRIKE + System.lineSeparator(), result.getBalls(), result.getStrikes());
            return true;
        }
        return false;
    }

    private static boolean onlyBallExist(Result result) {
        if(result.getBalls() != 0){
            System.out.printf(TURN_RESULT_BALL+ System.lineSeparator(), result.getBalls());
            return true;
        }
        return false;
    }

    private static boolean onlyStrikeExist(Result result) {
        if(result.getStrikes() != 0){
            System.out.printf(TURN_RESULT_STRIKE+ System.lineSeparator(), result.getStrikes());
            return true;
        }
        return false;
    }
}
