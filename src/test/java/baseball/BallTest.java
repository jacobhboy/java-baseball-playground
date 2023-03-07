package baseball;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    @Test
    void createBalls() {
        Balls balls = Balls.BallsFactory(432);

        List<String> everyBall = balls.getBalls();

        System.out.println("everyBall = " + everyBall);

        assertThat(everyBall.get(0)).isEqualTo("4");
        assertThat(everyBall.get(1)).isEqualTo("3");
        assertThat(everyBall.get(2)).isEqualTo("2");
    }

    @Test
    void ifBallIsSmallThanAHundred() {
        //given
        int number = 97;
        //when
        boolean isBallValid = Balls.isNumberValid(number);
        //then
        assertThat(isBallValid).isEqualTo(false);
    }

    @Test
    void ifBallsHaveZero() {
        //given
        int number1 = 703;
        int number2 = 340;
        //when
        boolean isNumber1Valid = Balls.isNumberValid(number1);
        boolean isNumber2Valid = Balls.isNumberValid(number2);
        //then
        assertThat(isNumber1Valid).isEqualTo(false);
        assertThat(isNumber2Valid).isEqualTo(false);
    }

    @Test
    void ifBallsHaveSameNumber() {
        //given
        int number1 = 773;
        int number2 = 355;
        //when
        boolean isNumber1Valid = Balls.isNumberValid(number1);
        boolean isNumber2Valid = Balls.isNumberValid(number2);
        //then
        assertThat(isNumber1Valid).isEqualTo(false);
        assertThat(isNumber2Valid).isEqualTo(false);
    }

}
