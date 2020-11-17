package lesson6;


// Особенности
//  1. Не имеет конструктора
//  2. Нельзя иметь объекты интерфейса: List l = new List();
//  3. Все методы интерфейса абстратны и публичны
//      public abstract
//  4. Все поля интерфейса - константы
//      public static final int VALUE = 3;
//  5. Любой класс может реализовывать бесконечное количество интерфйесов
public interface List {

    void add(int value); // public abstract add(int value);

}
