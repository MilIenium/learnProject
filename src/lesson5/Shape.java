package lesson5;

public class Shape {

    protected int[] sides;

    public Shape() {
        super(); // <- вызов конструктора суперкласса
        System.out.println("Shape constructor...");
        this.sides = new int[0];
    }

    public Shape(int[] sides) {
        System.out.println("Shape(int[]) constructor...");
        this.sides = sides;
    }

    protected double calculateSquare() {
        return 0.0d;
    }

    protected double calculatePerimeter() {
        return 0.0d;
    }


}
