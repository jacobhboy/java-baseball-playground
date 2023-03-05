package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringCalculatorTest {

    @Test
    @DisplayName("올바른 답을 반환하는가")
    void StringCalculatorRightAnswer() {
        //given
        String line1 = "2 + 3 * 4 / 2 - 5";
        //when
        int answer1 = StringCalculator.CalculateString(line1);
        //then
        assertThat(answer1).isEqualTo(5);
    }

    @Test
    @DisplayName("문자열 유효성 검증이 잘 작동하는가")
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
    @DisplayName("0으로 나눴을 떄 예외가 잘 발생하는가")
    void divideWithZero(){
        //given
        String line3 = "3 + 10 * 5 / 0";
        //when
        assertThatThrownBy(() -> StringCalculator.CalculateString(line3))
                //then
                .isInstanceOf(IllegalArgumentException.class);
    }
    @Test
    @DisplayName("9 초과의 수를 사용하여도 문제가 없는가")
    void numberIsBiggerThanNine(){
        //given
        String line4 = "10 + 1134";
        //when
        int answer4 = StringCalculator.CalculateString(line4);
        //then
        assertThat(answer4).isEqualTo(1144);
    }

    @Test
    @DisplayName("첫번째 수가 음수라도 잘 작동하는가")
    void firstNumberIsMinus(){
        //given
        String line5 = "-3 + 1 * 2";
        //when
        int answer5 = StringCalculator.CalculateString(line5);
        //then
        assertThat(answer5).isEqualTo(-4);
    }
}
