package baseball;

import baseball.model.Balls;
import baseball.model.CompareBalls;
import baseball.model.Result;
import baseball.model.UserBalls;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class CompareBallsTest {

    @Test
    void AllStrike(){
        //given
        Balls balls1 = UserBalls.BallsFactory(432);
        Balls balls2 = UserBalls.BallsFactory(432);
        //when
        Result result = CompareBalls.compareBalls(balls1, balls2);
        //then
        assertAll(() ->{
            assertThat(result.getBall()).isEqualTo(0);
            assertThat(result.getStrike()).isEqualTo(3);
        });
    }

    @Test
    void TwoBall(){
        //given
        Balls balls1 = UserBalls.BallsFactory(132);
        Balls balls2 = UserBalls.BallsFactory(371);
        //when
        Result result = CompareBalls.compareBalls(balls1, balls2);
        //then
        assertAll(() ->{
            assertThat(result.getBall()).isEqualTo(2);
            assertThat(result.getStrike()).isEqualTo(0);
        });
    }

    @Test
    void oneStrikeTwoBall(){
        //given
        Balls balls1 = UserBalls.BallsFactory(692);
        Balls balls2 = UserBalls.BallsFactory(296);
        //when
        Result result = CompareBalls.compareBalls(balls1, balls2);
        //then
        assertAll(() ->{
            assertThat(result.getBall()).isEqualTo(2);
            assertThat(result.getStrike()).isEqualTo(1);
        });
    }

    @Test
    void Missing(){
        //given
        Balls balls1 = UserBalls.BallsFactory(142);
        Balls balls2 = UserBalls.BallsFactory(365);
        //when
        Result result = CompareBalls.compareBalls(balls1, balls2);
        //then
        assertAll(() ->{
            Assertions.assertThat(result.getStrike()).isEqualTo(0);
            Assertions.assertThat(result.getBall()).isEqualTo(0);
        });
    }
}
