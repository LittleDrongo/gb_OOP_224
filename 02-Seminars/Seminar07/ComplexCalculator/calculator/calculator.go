package calculator

import (
	"calc/complex"
	"log"
)

type ComplexCalculator struct{}

func (cc ComplexCalculator) Add(a, b complex.Number) complex.Number {
	return complex.Number{
		Real:      a.Real + b.Real,
		Imaginary: a.Imaginary + b.Imaginary,
	}
}

func (cc ComplexCalculator) Multiply(a, b complex.Number) complex.Number {
	return complex.Number{
		Real:      a.Real*b.Real - a.Imaginary*b.Imaginary,
		Imaginary: a.Real*b.Imaginary + a.Imaginary*b.Real,
	}
}

func (cc ComplexCalculator) Divide(a, b complex.Number) complex.Number {
	if b.Real == 0 && b.Imaginary == 0 {
		log.Panic("Деление на ноль невозможно")
		return complex.Number{}
	}
	denominator := b.Real*b.Real + b.Imaginary*b.Imaginary
	realPart := (a.Real*b.Real + a.Imaginary*b.Imaginary) / denominator
	imaginaryPart := (a.Imaginary*b.Real - a.Real*b.Imaginary) / denominator
	return complex.Number{Real: realPart, Imaginary: imaginaryPart}
}
