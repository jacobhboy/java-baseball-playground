package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import view.input.RandomNumber;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class RandomBallsTest {
    @Test
    @DisplayName("랜덤 공 생성이 잘 되는지 테스트")
    void createRandomBall(){
        //given
        int randomNumber1 = RandomNumber.getRandomNumber();
        int randomNumber2 = RandomNumber.getRandomNumber();
        int randomNumber3 = RandomNumber.getRandomNumber();
        int randomNumber4 = RandomNumber.getRandomNumber();
        int randomNumber5 = RandomNumber.getRandomNumber();
        int randomNumber6 = RandomNumber.getRandomNumber();
        int randomNumber7 = RandomNumber.getRandomNumber();
        int randomNumber8 = RandomNumber.getRandomNumber();

        //when, then
        assertAll(()->assertThat(randomNumber1).isBetween(100, 1000),
                () -> assertThat(randomNumber2).isBetween(100, 1000),
                () -> assertThat(randomNumber3).isBetween(100, 1000),
                () -> assertThat(randomNumber4).isBetween(100, 1000),
                () -> assertThat(randomNumber5).isBetween(100, 1000),
                () -> assertThat(randomNumber6).isBetween(100, 1000),
                () -> assertThat(randomNumber7).isBetween(100, 1000),
                () -> assertThat(randomNumber8).isBetween(100, 1000)
                );
    }

}
