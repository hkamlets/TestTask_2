import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введите математическое выражение (например, 2 + 2):");

        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        System.out.println(calc(expression));
    }

    public static String calc(String scanner) {
        String[] expression = scanner.split(" ");
        if (expression.length !=3 ) { //Оператор неравенства (!=) проверяет, не равны ли два его операнда, возвращая логический результат.
            throw new ArithmeticException("Строка не является математической операцией!");
        }

        int operandOne = Integer.parseInt(expression[0]);
        char operator = expression[1].charAt(0);
        int operandTwo = Integer.parseInt(expression[2]);

        int sum = 0;

        if ((operandOne > 0 && operandTwo > 0) && (operandOne < 11 && operandTwo < 11)) {
            sum = switch (operator) {
                case '+' -> operandOne + operandTwo;
                case '-' -> operandOne - operandTwo;
                case '*' -> operandOne * operandTwo;
                case '/' -> operandOne / operandTwo;
                default -> throw new ArithmeticException("Используем только 1 из перечисленных операторов +, -, /, *");
            };
        } else {
            throw new ArithmeticException("По условию используем операнды от 1 до 10 включительно!");
        }
        return String.valueOf(sum);
    }
}