package Calculator.impl;


import Calculator.Operation;

public class Division implements Operation {
    @Override
    public double calculate(double num1, double num2) {
        if (num2 != 0){
            return num1 / num2;
        } else {
            System.out.println("Нельзя делить на ноль!");
            return 0D;
        }


    }
}
