package lesson4;
    public class Application {

        public static void main(String[] args) {

            // Rectangle rec = new Rectangle();
            Point leftTop = new Point(4, 7);
            Point rightTop = new Point(7,7);
            Point leftBottom = new Point(4, 3);
            Point rightBottom = new Point(7, 3);

            Rectangle rec = Rectangle.createRectangle(
                    leftTop,
                    rightTop,
                    leftBottom,
                    rightBottom
            );

            // leftBottom

            // double distance = obj.calculateDistance(leftTop, rightBottom);
            double distance = calculateDistance(leftTop, rightBottom);
            double d = leftTop.calculateDistance(rightBottom);

            TriplePoint tp = new TriplePoint();
            // tp.equals()
            // tp.
        }

        static double calculateDistance(Point p1, Point p2) {
            double dx = Math.pow(p1.getX() - p2.getX(), 2);
            double dy = Math.pow(p1.getY() - p2.getY(), 2);

            return Math.sqrt(dx + dy);
        }

    }
