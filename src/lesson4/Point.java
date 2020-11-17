package lesson4;

    // Superclass, baseclass, parent
    public class Point {

        private int x;
        private int y;

        public Point() {}

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public double calculateDistance(Point p2) {
            double dx = Math.pow(x - p2.x, 2); // Math.pow(this.x - p2.x, 2);
            double dy = Math.pow(this.y - p2.y, 2);

            return Math.sqrt(dx + dy);
        }

    }
