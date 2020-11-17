package lesson9;

public class RecursionStackOverflow {

    public static void main(String[] args) {
        recursiveMethod(10);
    }

    static void recursiveMethod(int value) {
        if (value < 0) {
            return;
        }
        recursiveMethod(value - 1);
    }

}
