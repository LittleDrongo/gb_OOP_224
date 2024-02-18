package ComplexCalc.impl;

import ComplexCalc.ComplexNumber;
import ComplexCalc.ComplexOperation;

public class SubtractionComplex implements ComplexOperation {
    @Override
    public ComplexNumber operation(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getReal() - num2.getReal();
        double imaginaryPart = num1.getImaginary() - num2.getImaginary();
        return new ComplexNumber(realPart, imaginaryPart);
    }
}
