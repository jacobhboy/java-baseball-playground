package baseball;

import baseball.model.Balls;
import baseball.model.CompareBalls;
import baseball.model.UserBalls;
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
        List<Integer> integers = CompareBalls.compareBalls(balls1, balls2);
        //then
        assertAll(() ->{
            assertThat(integers.get(0)).isEqualTo(3);
            assertThat(integers.get(1)).isEqualTo(0);
        });
    }

    @Test
    void TwoBall(){
        //given
        Balls balls1 = UserBalls.BallsFactory(132);
        Balls balls2 = UserBalls.BallsFactory(371);
        //when
        List<Integer> integers = CompareBalls.compareBalls(balls1, balls2);
        System.out.println(integers);
        //then
        assertAll(() ->{
            assertThat(integers.get(0)).isEqualTo(0);
            assertThat(integers.get(1)).isEqualTo(2);
        });
    }

    @Test
    void oneStrikeTwoBall(){
        //given
        Balls balls1 = UserBalls.BallsFactory(692);
        Balls balls2 = UserBalls.BallsFactory(296);
        //when
        List<Integer> integers = CompareBalls.compareBalls(balls1, balls2);
        System.out.println(integers);
        //then
        assertAll(() ->{
            assertThat(integers.get(0)).isEqualTo(1);
            assertThat(integers.get(1)).isEqualTo(2);
        });
    }

    @Test
    void Missing(){
        //given
        Balls balls1 = UserBalls.BallsFactory(142);
        Balls balls2 = UserBalls.BallsFactory(365);
        //when
        List<Integer> integers = CompareBalls.compareBalls(balls1, balls2);
        //then
        assertThat(integers).isNull();
    }
}
