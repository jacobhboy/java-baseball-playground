package study;

import model.Balls;
import model.Result;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class MakeBallsTest {

    @Test
    @DisplayName("3스트라이크")
    void threeStrike(){
        //given
        Balls createdBalls = Balls.createBallsFactory(123);
        Balls compareBalls = Balls.createBallsFactory(123);
        //when
        Result result = createdBalls.compare(compareBalls);
        //then
        assertAll(
                () -> assertThat(result.getStrikes()).isEqualTo(3),
            () -> assertThat(result.getBalls()).isEqualTo(0)
        );
    }

    @Test
    @DisplayName("3볼")
    void threeBall(){
        //given
        Balls createdBalls = Balls.createBallsFactory(123);
        Balls compareBalls = Balls.createBallsFactory(312);
        //when
        Result result = createdBalls.compare(compareBalls);
        //then
        assertAll(
                () -> assertThat(result.getStrikes()).isEqualTo(0),
                () -> assertThat(result.getBalls()).isEqualTo(3)
        );
    }

    @Test
    @DisplayName("미씽")
    void missing(){
        //given
        Balls createdBalls = Balls.createBallsFactory(123);
        Balls compareBalls = Balls.createBallsFactory(456);
        //when
        Result result = createdBalls.compare(compareBalls);
        //then
        assertAll(
                () -> assertThat(result.getStrikes()).isEqualTo(0),
                () -> assertThat(result.getBalls()).isEqualTo(0)
        );
    }
}
