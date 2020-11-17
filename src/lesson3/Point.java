package lesson3;

public class Point {
    int x;
    int y;

    //конструктор
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point() {

    }

    //инверсия точки -> поменять знак у координат

    void flip(){
        x = -x;
        y = -y;
    }

    String asString(){
        String pointAsString = "Point coordinates: x=" + x + ", y=" + y;
        return pointAsString;
    }

    void changeCoordinates(int newX, int newY){
        x = newX;
        y = newY;
    }


    //сигнатура метода
    //название метода + его аргументы(важны тип аргументов и их порядок)
    //для метода changePoint сигнатурой будет "changePoint (int x, int y)"
    //в одном классе невозможно создание двух идентичных сигнатур,
    //сигнатура может иметь одинаоквое название, но обязательно разные аргументы
    void changePoint (int x, int y){
        this.x = x;
        this.y = y;
    }

}
