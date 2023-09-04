package algorithm0904;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MainTest {
    private static Stream<Arguments> testcases() {
        return Stream.of(
                Arguments.of("MANGO", "mango"),
                Arguments.of("peach", "PEACH"),
                Arguments.of("Apple", "aPPLE"),
                Arguments.of("baNANa", "BAnanA"),
                Arguments.of("Believe In YourSelF", "bELIEVE iN yOURsELf"),
                Arguments.of("THiS is how LIFE is!!", "thIs IS HOW life IS!!"),
                Arguments.of("Li^^ve  p$osi&TIVE*", "lI^^VE  P$OSI&tive*"),
                Arguments.of("%tiMe~~~~ iS>.< gggggolD ?:)", "%TImE~~~~ Is>.< GGGGGOLd ?:)")
        );
    }

    @ParameterizedTest(name = "{0} --> {1}")
    @MethodSource("testcases")
    @DisplayName("[1] 대문자 ↔️ 소문자 변환")
    void test(String input, String answer) {
        Assertions.assertEquals(Main.solution(input), answer);
    }
}