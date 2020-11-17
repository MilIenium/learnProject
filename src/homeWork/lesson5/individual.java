package homeWork.lesson5;

import static java.util.Arrays.fill;

public class individual {


        public static void main(String[] args) {
                /*
                 первая задачка
                 Создайте класс любой сущности на выбор. Определите у нее несколько полей, конструктор с параметрами
                 и переопределите метод equals. Далее в методе main создайте массив из объектов этого класса.
                 И попробуйте с помощью цикла и метода equals найти объект в массиве (как мы делали на занятии).
                */
                Human me = new Human(20, "Andrei", "Lavrinovich", 175, 80, true);

                System.out.println(new Human(20, "Andrei", "Lavrinovich", 175, 80, true)
                        .equals(new Human(20, "Sergei", "Lavrinovich", 175, 80, true)));
        }

}
