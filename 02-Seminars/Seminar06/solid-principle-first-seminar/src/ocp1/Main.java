package ocp1;

import ocp1.shape.Shape;
import ocp1.shape.impl.RightTriangle;
import ocp1.shape.impl.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(2, 3));
        shapes.add(new Square(4));
        double sumArea = 0;
        for (Shape shape : shapes) {
            if (shape instanceof RightTriangle) {
                RightTriangle triangle = (RightTriangle) shape;
                sumArea += triangle.getLeg1() * triangle.getLeg2() / 2.0;
            }
            if (shape instanceof Square) {
                Square square = (Square) shape;
                sumArea += Math.pow(square.getSide(), 2);
            }
        }

        System.out.printf("Sum of areas equals %f \n", sumArea);
    }
}
