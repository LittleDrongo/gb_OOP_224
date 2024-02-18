import Calculator.Calculator;
import ComplexCalc.ComplexCalculator;
import ComplexCalc.ComplexNumber;

public class Main {
    public static void main(String[] args) {
        System.out.println("test");
        Calculator calculator = new Calculator();
        System.out.println(
                calculator.calculate(10, '*', 20)
        );


        ComplexCalculator compCalc = new ComplexCalculator();
        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(4, -1);
        char operator = '+';
        System.out.println("Результат: " +
                compCalc.calculateComplex(num1, operator, num2)
        );
    }
}
