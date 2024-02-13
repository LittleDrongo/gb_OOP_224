package srp1.figure;

import java.util.ArrayList;
import java.util.List;

public class Square {

    private final List<Point> points;
    private final int side;

    public Square(Point point1, int side) {
        this.side = side;

        Point point2 = new Point(point1.getX() + side, point1.getY());
        Point point3 = new Point(point1.getX() + side, point1.getY() + side);
        Point point4 = new Point(point1.getX(), point1.getY() + side);

        points = new ArrayList<>(4);
        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);
    }

    public List<Point> getPoints() {
        return points;
    }

    public int getArea() {
        return side * side;
    }

    public void draw() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < side; i++) {
            builder.append("* ");
        }
        System.out.println(builder);
        for (int i = 0; i < side; i++) {
            if (i < side - 2) {
                System.out.print("*");
            } else {
                continue;
            }

            for (int j = 1; j < side - 1; j++) {
                System.out.print(" *");
            }
            System.out.println(" *");
        }

        System.out.println(builder);
    }
}
