import Calculator.Calculator;
import ComplexCalc.ComplexCalculator;
import ComplexCalc.ComplexNumber;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(
                calculator.calculate(10, '*', 20)
        );


        ComplexCalculator compCalc = new ComplexCalculator();
        ComplexNumber num1 = new ComplexNumber(3, 2);
        ComplexNumber num2 = new ComplexNumber(1, 4);
        System.out.println("Сложение: " + compCalc.calculateComplex(num1, '+', num2));
        System.out.println("Вычитание: " + compCalc.calculateComplex(num1, '-', num2));
        System.out.println("Умножение: " + compCalc.calculateComplex(num1, '*', num2));
        System.out.println("Деление: " + compCalc.calculateComplex(num1, '/', num2));

    }
}
