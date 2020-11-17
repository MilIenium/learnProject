package lesson5;

@SuppressWarnings("ALL")
public class ShapeApp {

    public static void main(String[] args) {

        // new Shape()
        //   - вызываем конструктор Shape
        //      -> вызываем конструктор суперкласса
        //          - выполняется конструктор суперкласса
        //  - выполняется коструктор Shape
        Shape shape = new Shape();

        // Вызов
        // Triangle() -> Shape() -> Object()
        // Выполнение
        // Object() -> Shape() -> Triangle()
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Периметр фигуры: " + shape.calculatePerimeter());
        System.out.println("Периметр треугольника: " + triangle.calculatePerimeter());

        Square square = new Square(5);
        System.out.println("Периметр квадрата: " + square.calculatePerimeter());
        System.out.println("Сторона квадрата: " + square.getSide());

        // Приведение объектов возможно от ребенка к родителю
        // Возможно объект привести к самому себе

        Shape fromSquare = square; // неявное расширяющее преобразование
        // fromSquare.getSide();

        Object fromShape = fromSquare;
        Object oFromSquare = square;

        // fromShape: Square -> Shape -> Object
        Square fromObject = (Square) fromShape; // Object -> Square явное сужающее преобразование

        // shape
        // Square sfromShape = (Square) shape; // Shape -> Square


        System.out.println();
        // shape, triangle, square
        Shape figure1 = new Shape();
        Shape figure2 = new Triangle(4, 5, 7); // Triangle t = new Triangle(4, 5, 7); Shape figure2 = t;
        Shape figure3 = new Square(7);

        Shape[] figures = new Shape[] {
                figure1,
                (Shape) triangle, // Triangle -> Shape
                figure2,
                figure3,
                (Shape) square   // Square -> Shape
        };

        for (int i = 0; i < figures.length; i++) {
            // 0: 0
            // 1: 3 + 4 + 5 -> 12
            // 2: 4 + 5 + 7 -> 16
            // 3: 7 * 4 -> 28
            // 4: 5 * 4 -> 20
            Shape s = figures[i];
            System.out.println(s.calculatePerimeter());
        }

    }

}
