package lesson3;

public class App {
    public static void main(String[] args) {


        Point p1 = new Point(); // инициализировали переменную класса Point
        p1.x = 4;
        p1.y = 6;

        p1.flip();

        String p1AsString = p1.asString();

        p1.changeCoordinates(2,9);

        System.out.println(p1AsString);

    }
}
