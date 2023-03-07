package baseball.ui.input;

import baseball.model.Balls;
import baseball.model.UserBalls;

import java.util.Scanner;

public class UserBallsInput {

    public static Balls getUserBall(){
        return UserBalls.BallsFactory(getNumber());
    }

    private static int getNumber(){
        final Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

