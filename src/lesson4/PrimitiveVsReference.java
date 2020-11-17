package lesson4;

    @SuppressWarnings("ALL")
    public class PrimitiveVsReference {

        public static void main(String[] args) {
            int value = 10;         // 123ab
            Point point = new Point(10, 10); // point.x = 10 // 765ab

            changeInt(value);       // 123ab -> copy to 534ab
            // changeXInPoint(point);  // 765ab

            System.out.println(value);      // 30, 10, 10 -> 123ab
            // System.out.println(point.x);    // 30, 30, 10 -> 765ab.x
        }

        static void changeInt(int value) {  // 534ab
            value = 30; // arg = 30;        // write 30 to 534ab
        }

//    static void changeXInPoint(Point point) { // 765ab
//        point.x = 30;   // 765ab.x -> write 30
//    }

    }
