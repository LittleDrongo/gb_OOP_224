package ComplexCalc.impl;

import ComplexCalc.ComplexNumber;
import ComplexCalc.ComplexOperation;

public class MultiplicationComplex implements ComplexOperation {
    @Override
    public ComplexNumber operation(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary();
        double imaginaryPart = num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal();
        return new ComplexNumber(realPart, imaginaryPart);
    }
}
