package test

import (
	"fmt"
)

/*Golang поддерживает комплексные числа, добавил читерский метод для проверки результатов собственных методов*/
func TestCalc(num1, num2 complex128, operator rune) {

	// Складываем комплексные числа
	switch operator {
	case '+':
		sum := num1 + num2
		fmt.Printf("Сложение: %v\n", sum)
	case '-':
		sum := num1 - num2
		fmt.Printf("Вычитание: %v\n", sum)
	case '*':
		sum := num1 * num2
		fmt.Printf("Умножение: %v\n", sum)
	case '/':
		sum := num1 / num2
		fmt.Printf("Деление: %v\n", sum)
	}

}
