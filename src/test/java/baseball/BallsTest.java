package baseball;

import baseball.model.Ball;
import baseball.model.Balls;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class BallsTest {

    static class BallsImpl extends Balls{

        static Balls BallsFactory(int number){
            if(createBalls(number) == null)
                return null;

            return new BallsImpl(createBalls(number));
        }

        protected BallsImpl(List<Ball> balls) {
            super(balls);
        }
    }


    @Test
    void createBalls() {
        //given
        final Balls balls = BallsImpl.BallsFactory(432);
        //when
        List<Ball> everyBall = balls.getBalls();
        //then
        assertAll(() -> {
            assertThat(everyBall.get(0).getBallNumber()).isEqualTo("4");
            assertThat(everyBall.get(1).getBallNumber()).isEqualTo("3");
            assertThat(everyBall.get(2).getBallNumber()).isEqualTo("2");
        });
    }

    @Test
    void ifBallsHaveZero() {
        //given
        final int number1 = 703;
        final int number2 = 340;
        //when
        Balls balls1 = BallsImpl.BallsFactory(number1);
        Balls balls2 = BallsImpl.BallsFactory(number2);

        //then
        assertAll(() -> {
            assertThat(balls1).isNull();
            assertThat(balls2).isNull();
        });
    }

    @Test
    void ifBallsHaveSameNumber() {
        //given
        final int number1 = 773;
        final int number2 = 355;
        //when
        Balls balls1 = BallsImpl.BallsFactory(number1);
        Balls balls2 = BallsImpl.BallsFactory(number2);
        //then

        assertAll(() -> {
            assertThat(balls1).isNull();
            assertThat(balls2).isNull();
        });
    }

}
