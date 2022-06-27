package example.tdd.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void plus_expect_3() {
        int result = Calculator.plus(1, 2);
        assertEquals(3, result);
    }

    @Test
    public void plus_expect_5() {
        int result = Calculator.plus(2, 3);
        assertEquals(5, result);
    }

}