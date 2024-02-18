package Calculator.impl;


import Calculator.Operation;

public class Addition implements Operation {
    @Override
    public double calculate(double num1, double num2) {
        return num1 + num2;
    }
}
