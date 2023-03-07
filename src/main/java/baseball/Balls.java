package baseball;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Balls {
    List<String> balls;

    public static Balls BallsFactory(int number) {
        return new Balls().createBalls(number);
    }

    public Balls createBalls(int number) {
        if (!isNumberValid(number))
            return null;

        balls = Arrays.stream(getStringArrayForNumber(number))
                .collect(Collectors.toList());

        return this;
    }

    public static boolean isNumberValid(int number) {
        String[] numberArrayForValidating = getStringArrayForNumber(number);

        if (numberArrayForValidating.length != 3) return false;
        for (int i = 0; i < numberArrayForValidating.length; i++) {
            if (numberArrayForValidating[i].equals("0")) return false;
            if (doesNumbersHasSameNumber(numberArrayForValidating, i)) return false;
        }

        return true;
    }

    private static String[] getStringArrayForNumber(int number) {
        return String.valueOf(number).split("");
    }


    private static boolean doesNumbersHasSameNumber(String[] everyNumbers, int i) {
        int numberNextToI = (i + 1) % 3;

        return everyNumbers[i].equals(everyNumbers[numberNextToI]);
    }

    private Balls() {
    }

    public List<String> getBalls() {
        return balls;
    }
}
