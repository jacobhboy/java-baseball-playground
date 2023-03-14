package study;

import org.junit.jupiter.api.Test;
import view.input.ValidateNumber;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

public class BallsValidationTest {

    @Test
    void ballsValidationTest(){
        //given
        final int number1 = 100;
        final int number2 = 1000;
        final int number3 = 200;
        final int number4 = 919;
        final int number5 = 122;
        final int number6 = 120;
        //when, then
        assertAll(
                () -> assertThatThrownBy(
                        () -> ValidateNumber.validate(number1)).isInstanceOf(Exception.class),
                () -> assertThatThrownBy(
                        () -> ValidateNumber.validate(number2)).isInstanceOf(Exception.class),
                () -> assertThatThrownBy(
                        () -> ValidateNumber.validate(number3)).isInstanceOf(Exception.class),
                () -> assertThatThrownBy(
                        () -> ValidateNumber.validate(number4)).isInstanceOf(Exception.class),
                () -> assertThatThrownBy(
                        () -> ValidateNumber.validate(number5)).isInstanceOf(Exception.class),
                () -> assertThatThrownBy(
                        () -> ValidateNumber.validate(number6)).isInstanceOf(Exception.class));
    }
}
