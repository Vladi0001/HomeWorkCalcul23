package homeworkcolcul23.homeworkcolcul23.Service;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static homeworkcolcul23.homeworkcolcul23.Service.ColculatorTestConstans.*;
import static homeworkcolcul23.homeworkcolcul23.Service.ColculatorTestConstans.Three;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColculatorServiceImplParamTest {
    private final ColculatorServiceImpl service = new ColculatorServiceImpl();
@MethodSource("provideParams")
    @ParameterizedTest

    void sum(int num1, int num2) {
        assertEquals(num1+num2,service.sum(num1,num2));

    }

    @MethodSource("provideParams")
    @ParameterizedTest
    void minus(int num1, int num2) {
        assertEquals(num1-num2,service.minus(num1,num2));
    }

    @MethodSource("provideParams")
    @ParameterizedTest
    void multiply(int num1, int num2) {
        assertEquals(num1*num2,service.multiply(num1,num2));
    }

    @MethodSource("provideParams")
    @ParameterizedTest
    void divide(int num1, int num2) {
        assertEquals(num1/num2,service.divide(num1,num2));
    }

    private static Stream<Arguments> provideParams() {
        return Stream.of(
                Arguments.of(One,Two),
                Arguments.of(Three,Two),
                Arguments.of(One,Three),
                Arguments.of(Three,One),
                Arguments.of(Three,Three)
        );
    }

}
