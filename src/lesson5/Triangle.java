package lesson5;

public class Triangle extends Shape{
    public Triangle() {
        super(); // вызывать Shape()
        System.out.println("Triangle constructor...");
    }

    public Triangle(int sideA, int sideB, int sideC) {
        // new int[] {sideA, sideB, sideC}

        // int[] arr = new int[3];
        // arr[0] = sideA
        // arr[1] = sideB
        // arr[2] = sideC
        super(new int[] {sideA, sideB, sideC}); // вызывать Shape(int[])
        System.out.println("Triangle(int, int, int) constructor...");
    }

    @Override // <<
    protected double calculatePerimeter() {
        // super.calculatePerimeter(); << вызов метода calculatePerimeter из класса Shape
        // sides[0] -> вернуть значение элемента под индексом 0
        return sides[0] + sides[1] + sides[2];
    }
}
