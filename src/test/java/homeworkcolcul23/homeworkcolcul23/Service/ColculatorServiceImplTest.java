package homeworkcolcul23.homeworkcolcul23.Service;

import homeworkcolcul23.homeworkcolcul23.Exception.ZeroDevideException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static homeworkcolcul23.homeworkcolcul23.Service.ColculatorTestConstans.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ColculatorServiceImplTest {
    private final ColculatorServiceImpl service = new ColculatorServiceImpl();


    @Test

    void sum() {
        assertEquals(One+Two,service.sum(One,Two));
        assertEquals(Two+Two,service.sum(Two,Two));
    }

    @Test
    void minus() {
        assertEquals(Three-Two,service.minus(Three,Two));
        assertEquals(Three-Three,service.minus(Three,Three));
    }

    @Test
    void multiply() {
        assertEquals(Three*Two,service.multiply(Three,Two));
        assertEquals(Three*One,service.multiply(Three,One));
    }

    @Test
    void divide() {
        assertEquals(Three/One,service.divide(Three,One));
        assertEquals(Three/Three,service.divide(Three,Three));
    }

    @Test
    void SchouldTrowZeroDivide() {
        assertThrows(ZeroDevideException.class, () -> service.divide(Three, Zero));
    }
}