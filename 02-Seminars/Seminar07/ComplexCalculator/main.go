package main

import (
	"calc/calculator"
	"calc/complex"
	"calc/test"
	"fmt"
)

func main() {

	calculator := calculator.ComplexCalculator{}

	num1 := complex.Number{Real: 3, Imaginary: 2}
	num2 := complex.Number{Real: 1, Imaginary: 4}

	fmt.Println("------/ Cобственные методы / --------")
	sum := calculator.Add(num1, num2)
	fmt.Printf("Сумма: %s\n", sum.ToString())

	sum2 := calculator.Multiply(num1, num2)
	fmt.Printf("Умножение: %s\n", sum2.ToString())

	sum3 := calculator.Divide(num1, num2)
	fmt.Printf("Деление: %s\n", sum3.ToString())

	fmt.Println("\n------/ Встроенные методы (для проверки) / --------  ")
	test.TestCalc(3+2i, 1+4i, '+')
	test.TestCalc(3+2i, 1+4i, '-')
	test.TestCalc(3+2i, 1+4i, '*')
	test.TestCalc(3+2i, 1+4i, '/')
}
