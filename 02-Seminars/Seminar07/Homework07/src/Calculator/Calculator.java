package Calculator;

import Calculator.impl.Addition;
import Calculator.impl.Division;
import Calculator.impl.Multiplication;
import Calculator.impl.Subtraction;

import java.util.HashMap;

public class Calculator {
    double num1;
    char operator;
    double num2;

public double calculate (double num1, char operator, double num2) {
        HashMap<Character, Operation> operations = new HashMap<>();
        operations.put('+', new Addition());
        operations.put('-', new Subtraction());
        operations.put('*', new Multiplication());
        operations.put('/', new Division());

        if (operations.containsKey(operator)) {
        Operation operation = operations.get(operator);
        return operation.calculate(num1, num2);
        } else {
            System.out.println("Некорректный оператор!");
            return 0D;
        }
}
}
