import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void getNumberFromStringPositiveFlow() {

        // GIVEN
        String numberString = "34.33";
        float number = 34.33f;

        // WHEN
        float numberFloat = Calculator.getNumberFromString(numberString);

        // THEN
        assertEquals(number, numberFloat, 0.00001);
    }

    @Test (expected = NumberFormatException.class)
    public void getNumberFromStringNegativeFlow() {

        // GIVEN
        String numberString = "34,33";
        float number = 34.33f;

        // WHEN
        float numberFloat = Calculator.getNumberFromString(numberString);

        // THEN
        assertEquals(0.0, numberFloat, 0.00001);
    }

    @Test
    public void calculatePositiveFlow() {

        // GIVEN
        String firstNnumberString = "340.33";
        float firstNumber = 340.33f;
        String secondNumberString = "0";
        float secondNumber = 0f;
        String command = "*";

        // WHEN
        String result = Calculator.calculate(firstNnumberString, secondNumberString, command);

        // THEN
        assertEquals(firstNnumberString + command + secondNumberString + "=" + "0.0", result);
    }

    @Test
    public void calculateNegativeFlow() {

        // GIVEN
        String firstNnumberString = "340.33";
        float firstNumber = 340.33f;
        String secondNumberString = "0";
        float secondNumber = 0f;
        String command = "=";

        // WHEN
        String result = Calculator.calculate(firstNnumberString, secondNumberString, command);

        // THEN
        assertEquals("Incorrect command! No result!", result);
    }
}