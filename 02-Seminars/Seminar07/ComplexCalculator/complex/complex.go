package complex

import "fmt"

type Number struct {
	Real      float64
	Imaginary float64
}

func (cn Number) ToString() string {
	return fmt.Sprintf("%v + %vi", cn.Real, cn.Imaginary)
}
