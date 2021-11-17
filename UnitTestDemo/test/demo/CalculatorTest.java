package demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    //annotation
    @Test
    public void testSum_WithPositiveIntegers() {
        //Arrange
        Calculator calculator = new Calculator();
        int expected = 30;
        //Act
        int result = calculator.sum(10,20);
        //Assert
        assertEquals(expected, result);
    }

    @Test
    public void testSum_WithTooLarge_Integers() {
        //Arrange
        Calculator calculator = new Calculator();
        //Act + Assert
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(101,201));
    }

    @Test
    public void testRandomNumber_Between_One_And_Six() {
        //Arrange
        Calculator calculator = new Calculator();
        //Act
        for (int i = 0; i < 100; i++) {
            int result = calculator.random();
            assertTrue(result >= 1 && result <= 6);
        }
    }

}