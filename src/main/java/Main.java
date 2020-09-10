import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean exit = true;
        System.out.println("Hello! This is Calculator.");

        Calculator calc = new Calculator();

        calc.setFirstNumber();
        calc.setSecondNumber();
        calc.calculateResult();
        System.out.println(calc.toString());


    }
}


