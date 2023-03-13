package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import view.input.RandomNumber;

public class RandomBallsTest {
    @Test
    void createRandomBall(){
        //given
        int randomNumber1 = RandomNumber.randomNumber();
        int randomNumber2 = RandomNumber.randomNumber();
        int randomNumber3 = RandomNumber.randomNumber();
        int randomNumber4 = RandomNumber.randomNumber();
        int randomNumber5 = RandomNumber.randomNumber();
        int randomNumber6 = RandomNumber.randomNumber();
        int randomNumber7 = RandomNumber.randomNumber();
        int randomNumber8 = RandomNumber.randomNumber();

        //when, then
        Assertions.assertThat(randomNumber1).isBetween(100, 1000);
        Assertions.assertThat(randomNumber2).isBetween(100, 1000);
        Assertions.assertThat(randomNumber3).isBetween(100, 1000);
        Assertions.assertThat(randomNumber4).isBetween(100, 1000);
        Assertions.assertThat(randomNumber5).isBetween(100, 1000);
        Assertions.assertThat(randomNumber6).isBetween(100, 1000);
        Assertions.assertThat(randomNumber7).isBetween(100, 1000);
        Assertions.assertThat(randomNumber8).isBetween(100, 1000);
    }

}
