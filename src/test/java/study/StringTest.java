package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split(){
        //given
        String oneTwo = "1,2";
        String one = "1";

        //when
        List<Integer> oneTwoArray = Arrays.asList(oneTwo.split(","))
                .stream()
                .map(Integer::new)
                .collect(Collectors.toList());

        List<Integer> oneArray = Arrays.asList(one.split(","))
                .stream()
                .map(Integer::new)
                .collect(Collectors.toList());

        //then
        assertThat(oneTwoArray).contains(1, 2);
        assertThat(oneArray).containsExactly(1);
    }

    @Test
    void substring(){
        //given
        String oneTwo = "(1,2)";

        //when
        oneTwo = oneTwo.substring(1,4);

        //then
        assertThat(oneTwo).isEqualTo("1,2");
    }

    @Test
    @DisplayName("CharAt의 범위가 넘어갔을 때 StringIndexOutOfBoundsException 이 발생하는 지 테스트")
    void charAtError(){
        //given
        String abc = "abc";

        assertThatThrownBy(
                () -> abc.charAt(5)
        ).isInstanceOf(StringIndexOutOfBoundsException.class);
    }
}
