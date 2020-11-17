package lesson5;

public class Square extends Shape {
    public Square(int side) {
        super(new int[] {side, side, side, side});
        System.out.println("Square(int) constructor...");
    }

    @Override
    protected double calculateSquare() {
        return sides[0] * sides[0];
    }

    @Override
    protected double calculatePerimeter() {
        return sides[0] * 4;
    }

    public int getSide() {
        return sides[0];
    }
}
