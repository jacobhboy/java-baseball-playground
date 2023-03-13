package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import view.input.RandomNumber;

public class RandomBallsTest {
    @Test
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
