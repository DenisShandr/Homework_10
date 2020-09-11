import java.util.Scanner;

public class Calculator {
    private Scanner in = new Scanner(System.in);

    public static String calculate(String firstNumber, String secondNumber, String command){
        float result = 0;
        switch (command) {
            case "+":
                result = plus(getNumberFromString(firstNumber), getNumberFromString(secondNumber));
                return firstNumber + command + secondNumber + "=" + result;
            case "-":
                result = minus(getNumberFromString(firstNumber), getNumberFromString(secondNumber));
                return firstNumber + command + secondNumber + "=" + result;
            case "*":
                result = multiply(getNumberFromString(firstNumber), getNumberFromString(secondNumber));
                return firstNumber + command + secondNumber + "=" + result;
            case "/":
                result = div(getNumberFromString(firstNumber), getNumberFromString(secondNumber));
                return firstNumber + command + secondNumber + "=" + result;
            default:
                System.out.println();
        }
        return "Incorrect command! No result!";
    }

    public static float getNumberFromString(String stringNumber) throws NumberFormatException {
        float number = 0;
        try {
            number = Float.parseFloat(stringNumber);
        } catch (NumberFormatException e) {
            System.out.println("It's not a number!");
            throw new NumberFormatException();
        }
        return  number;
    }

    private static float plus(float firstNumber, float secondNumber) {
        return (firstNumber + secondNumber);
    }

    private static float minus(float firstNumber, float secondNumber) {
        return (firstNumber - secondNumber);
    }

    private static float multiply(float firstNumber, float secondNumber) {
        return (firstNumber * secondNumber);
    }

    private static float div(float firstNumber, float secondNumber) {
        if (secondNumber == 0){
            System.out.println("Impossible operation!");
            return 0;
        }
        return (firstNumber / secondNumber);
    }
}

