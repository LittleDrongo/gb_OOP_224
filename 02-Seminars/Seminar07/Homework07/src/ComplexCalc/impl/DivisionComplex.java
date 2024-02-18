package ComplexCalc.impl;

import ComplexCalc.ComplexNumber;
import ComplexCalc.ComplexOperation;

public class DivisionComplex implements ComplexOperation {
    @Override
    public ComplexNumber operation(ComplexNumber num1, ComplexNumber num2) {
        double divisor = num1.getReal() * num2.getReal() + num2.getImaginary() * num2.getImaginary();
        double realPart = (num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary()) / divisor;
        double imaginaryPart = (num1.getImaginary() * num2.getReal() - num1.getReal() * num2.getImaginary()) / divisor;
        return new ComplexNumber(realPart, imaginaryPart);
    }
}
