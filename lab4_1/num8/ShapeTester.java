package lab4_1.num8;

public class ShapeTester {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3, 4);
        Square square = new Square(5);

        rectangle.setColor("синий");
        square.setColor("зеленый");

        rectangle.setFilled(true);
        square.setFilled(false);

        System.out.println("Круг: " + circle.toString());
        System.out.println("Прямоугольник: " + rectangle.toString());
        System.out.println("Квадрат: " + square.toString());

        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Периметр круга: " + circle.getPerimeter());

        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());

        System.out.println("Площадь квадрата: " + square.getArea());
        System.out.println("Периметр квадрата: " + square.getPerimeter());
    }
}
