package baseball.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Balls {
    private final List<Ball> balls;

    protected static List<Ball> createBalls(final int number) {
        if (!isNumberValid(number))
            return null;

        return getStringArrayForNumber(number)
                .stream().map(Ball::new)
                .collect(Collectors.toList());
    }

    private static boolean isNumberValid(final int number) {
        if(number < 0) return false;
        List<String> splitNumber = getStringArrayForNumber(number);

        return !doesSplitNumberHasSameNumber(splitNumber);
    }

    private static boolean doesSplitNumberHasSameNumber(final List<String> splitNumber) {
        for (int i = 0, length = splitNumber.size(); i < length; i++) {
            if (splitNumber.get(i).equals("0")) return true;
            if (doesNumbersHasSameNumber(splitNumber, i)) return true;
        }
        return false;
    }

    private static List<String> getStringArrayForNumber(final int number) {
        return Arrays.stream(String.valueOf(number).split(""))
                .collect(Collectors.toList());
    }


    private static boolean doesNumbersHasSameNumber(final List<String> everyNumbers, final int i) {
        int numberNextToI = (i + 1) % 3;

        return everyNumbers.get(i).equals(everyNumbers.get(numberNextToI));
    }

    protected Balls(final List<Ball> balls) {
        this.balls = balls;
    }

    public List<Ball> getBalls() {
        return balls;
    }
}
