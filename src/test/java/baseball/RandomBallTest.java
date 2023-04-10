package baseball;

import baseball.model.Ball;
import baseball.model.Balls;
import baseball.model.RandomBalls;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class RandomBallTest {

    @Test
    void makeRandomBalls(){
        //given
        //when
        Balls balls = RandomBalls.BallsFactory();
        System.out.println(balls);
        List<Ball> allBalls = balls.getBalls();
        //then
        assertAll(()->{
            assertThat(allBalls.get(0).getBallNumber()).isIn("1", "2", "3", "4", "5", "6", "7", "8", "9");
            assertThat(allBalls.get(1).getBallNumber()).isIn("1", "2", "3", "4", "5", "6", "7", "8", "9");
            assertThat(allBalls.get(2).getBallNumber()).isIn("1", "2", "3", "4", "5", "6", "7", "8", "9");
        });
    }
}
