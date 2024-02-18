package ComplexCalc;

import ComplexCalc.impl.AdditionComplex;
import ComplexCalc.impl.DivisionComplex;
import ComplexCalc.impl.MultiplicationComplex;
import ComplexCalc.impl.SubtractionComplex;

import java.util.HashMap;

public class ComplexCalculator {

    public ComplexNumber calculateComplex (ComplexNumber num1, char operator, ComplexNumber num2){
        HashMap<Character, ComplexOperation> operations = new HashMap<>();
        operations.put('+', new AdditionComplex());
        operations.put('-', new SubtractionComplex());
        operations.put('*', new MultiplicationComplex());
        operations.put('/', new DivisionComplex());

        if (operations.containsKey(operator)) {
            ComplexOperation operation = operations.get(operator);
            return operation.operation(num1, num2);
        } else {
            System.out.println("Error: Invalid operator!");
            return null;
        }
    }
}
