import java.util.Scanner;

public class Calculator {
    private Scanner in = new Scanner(System.in);
    private String calcOperation = null;
    private double firstNumber;
    private double secondNumber;
    private double result;


    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber() {
        this.firstNumber = getNumber("Enter first number: ");
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber() {
        this.secondNumber = getNumber("Enter second number: ");
    }

    public double getResult() {
        return result;
    }

    private void setResult(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return  firstNumber + calcOperation +
                secondNumber +
                " = " + result;
    }

    private double getNumber(String s){
        System.out.print(s);
        String numberString = in.next().trim();
        double number = 0;
        try {
            number = Double.parseDouble(numberString);
        } catch (NumberFormatException e) {
            System.out.println("It's not a number!" + '\n');
            getNumber("Enter number again: ");
        }
        return  number;
    }

    public void calculateResult(){
        double finishNumber = 0;
        switch (setCommand().trim()) {
            case "+":
                finishNumber = plus(firstNumber, secondNumber);
                break;
            case "-":
                finishNumber = minus(firstNumber, secondNumber);
                break;
            case "*":
                finishNumber = multiply(firstNumber, secondNumber);
                break;
            case "/":
                finishNumber = div(firstNumber, secondNumber);
                break;
        }
        setResult(finishNumber);
    }

    private String setCommand(){
        System.out.println("Command list:" + '\n' +
                " + : plus command" + '\n' +
                " - : minus command" + '\n' +
                " * : multiply command" + '\n' +
                " / : division command");
        System.out.print("Enter command: ");
        switch (in.next().trim()) {
            case "+":
                calcOperation = " + ";
                break;
            case "-":
                calcOperation = " - ";
                break;
            case "*":
                calcOperation = " * ";
                break;
            case "/":
                calcOperation = " / ";
                break;
            default:
                System.out.println("Incorrect command!");
                setCommand();
                break;
        }
        return calcOperation;
    }

    private double plus(double firstNumber, double secondNumber) {
        return (firstNumber + secondNumber);
    }

    private double minus(double firstNumber, double secondNumber) {
        return (firstNumber - secondNumber);
    }

    private double multiply(double firstNumber, double secondNumber) {
        return (firstNumber * secondNumber);
    }

    private double div(double firstNumber, double secondNumber) {
        if (secondNumber == 0){
            System.out.println("Impossible operation!");
            return 0;
        }
        return (firstNumber / secondNumber);
    }
}

