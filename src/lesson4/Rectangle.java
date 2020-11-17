package lesson4;


    public class Rectangle {

        private Point leftTop; // Ctrl + D -> duplicate line
        private Point rightTop;
        private Point leftBottom;
        private Point rightBottom;

        private Rectangle() {} // мы запретили создание объектов Rectangle за пределами класса

        // Generate -> Constructor -> Ctrl+A -> OK
        private Rectangle(Point leftTop, Point rightTop, Point leftBottom, Point rightBottom) {
            this.leftTop = leftTop;
            this.rightTop = rightTop;
            this.leftBottom = leftBottom;
            this.rightBottom = rightBottom;
        }

        public static Rectangle createRectangle(Point leftTop, Point rightTop, Point leftBottom, Point rightBottom) {
            // Проверяем правильность точек
            if (leftTop.getX() < rightTop.getX() && leftTop.getY() > leftBottom.getY()) {
                // Rectangle rec = new Rectangle(leftTop, rightTop, leftBottom, rightBottom);
                // rec.getLeftTopPoint();
                // return rec;
                // getLeftTopPoint(); <- нельзя
                return new Rectangle(leftTop, rightTop, leftBottom, rightBottom);
            }

            return null; // <- Возвращаем пустую ссылку, так как нельзя создать объект
        }

        public Point getLeftTopPoint() {
            // createRectangle() <- можно вызвать
            return leftTop;
        }

    }

