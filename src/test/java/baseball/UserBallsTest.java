package baseball;

import baseball.model.Balls;
import baseball.model.UserBalls;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserBallsTest {

    @Test
    void makeUserBalls(){
        //given
        final int number1 = 123;
        final int number2 = 539;
        final int number3 = 952;
        //when
        Balls balls1 = UserBalls.BallsFactory(number1);
        Balls balls2 = UserBalls.BallsFactory(number2);
        Balls balls3 = UserBalls.BallsFactory(number3);
        //then
        assertAll(() -> {
            assertThat(balls1.getBallNumber(0)).isEqualTo("1");
            assertThat(balls1.getBallNumber(1)).isEqualTo("2");
            assertThat(balls1.getBallNumber(2)).isEqualTo("3");
            assertThat(balls2.getBallNumber(0)).isEqualTo("5");
            assertThat(balls2.getBallNumber(1)).isEqualTo("3");
            assertThat(balls2.getBallNumber(2)).isEqualTo("9");
            assertThat(balls3.getBallNumber(0)).isEqualTo("9");
            assertThat(balls3.getBallNumber(1)).isEqualTo("5");
            assertThat(balls3.getBallNumber(2)).isEqualTo("2");
        });
    }

    @Test
    void ifBallIsNotHundred(){
        //given
        final int number = 42;
        //when
        Balls balls = UserBalls.BallsFactory(42);
        //then
        assertThat(balls).isNull();

    }
}
