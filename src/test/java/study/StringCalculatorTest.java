package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringCalculatorTest {

    @Test
    void StringCalculatorRightAnswer() {
        //given
        String line1 = "2 + 3 * 4 / 2 - 5";
        //when
        int answer1 = StringCalculator.CalculateString(line1);
        //then
        assertThat(answer1).isEqualTo(5);
    }

    @Test()
    void withValidatingExpression(){
        //given
        String line2 = "-3 + 8 / 5 * 10 는 무엇일까요?";
        //when
        assertThatThrownBy(() ->
                StringCalculator.CalculateString(line2))
                //then
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void divideWithZero(){
        //given
        String line3 = "3 + 10 * 5 / 0";
        //when
        assertThatThrownBy(() -> StringCalculator.CalculateString(line3))
                //then
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void firstNumberIsMinus(){
        //given
        String line5 = "-3 + 1 * 2";
        //when
        int answer5 = StringCalculator.CalculateString(line5);
        //then
        assertThat(answer5).isEqualTo(-4);
    }

}
