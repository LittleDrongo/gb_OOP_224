package ComplexCalc.impl;

import ComplexCalc.ComplexNumber;
import ComplexCalc.ComplexOperation;

public class DivisionComplex implements ComplexOperation {
    @Override
    public ComplexNumber operation(ComplexNumber num1, ComplexNumber num2) {
        if (num2.getReal() == 0 && num1.getImaginary() == 0) {
            System.out.println("Деление на ноль невозможно");
            return null;
        }

        double denominator = num2.getReal() * num2.getReal() + num2.getImaginary() * num2.getImaginary();
        double realPart = (num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary()) / denominator;
        double imaginaryPart = (num1.getImaginary() * num2.getReal() - num1.getReal() * num2.getImaginary()) / denominator;
        return new ComplexNumber(realPart, imaginaryPart);
    }
}
