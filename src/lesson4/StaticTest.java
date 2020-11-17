package lesson4;


    @SuppressWarnings("ALL")
    public class StaticTest {

        public static void main(String[] args) {
            A obj = null;
            obj.printMessage("Hello world!");

            // A obj = null;
            // A.printMessage("HelloWorld");
        }

    }

    @SuppressWarnings("ALL")
    class A {

        static void printMessage(String message) {
            System.out.println(message);
        }

    }

