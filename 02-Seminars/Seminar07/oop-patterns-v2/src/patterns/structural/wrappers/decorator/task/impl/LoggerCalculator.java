package patterns.structural.wrappers.decorator.task.impl;

import patterns.structural.wrappers.decorator.task.Calculable;

public class LoggerCalculator implements Calculable {

    private Calculable calculator;

    public LoggerCalculator(Calculable calculator) {
        this.calculator = calculator;
    }

    @Override
    public void sum(double a, double b) {
        System.out.printf("Суммирую: %s, %s%n", a, b);
        calculator.sum(a, b);
        System.out.println(result());
    }

    @Override
    public void multiply(double a, double b) {
        System.out.printf("Умножаю: %s, %s%n", a, b);
        calculator.multiply(a, b);
        System.out.println(result());
    }

    @Override
    public void divide(double a, double b) {
        System.out.printf("Делю: %s, %s%n", a, b);
        calculator.divide(a, b);
        System.out.println(result());
    }

    @Override
    public void subtraction(double a, double b) {
        System.out.printf("Вычитаю: %s, %s%n", a, b);
        calculator.subtraction(a, b);
        System.out.println(result());
    }

    @Override
    public double result() {
        return calculator.result();
    }

    @Override
    public void clear() {
        calculator.clear();
    }
}
