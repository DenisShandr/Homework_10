import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Hello! This is Calculator.");
        System.out.println("Command list:" + '\n' +
                " + : plus command" + '\n' +
                " - : minus command" + '\n' +
                " * : multiply command" + '\n' +
                " / : division command");

        Calculator.calculate(getString("Enter first number: "),
                getString("Enter second number: "),
                getString("Enter command: "));

    }

    public static String getString(String s){
        System.out.print(s);
        return in.nextLine();
    }

}


