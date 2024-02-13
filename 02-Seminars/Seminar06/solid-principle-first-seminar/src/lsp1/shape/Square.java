package lsp1.shape;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    @Override
    public void setSideA(int sideA) {
        super.setSideA(sideA);
    }

    @Override
    public void setSideB(int sideB) {
        super.setSideA(sideB);
    }

    @Override
    public int getArea() {
        return (int) Math.pow(getSideA(), 2);
    }
}
