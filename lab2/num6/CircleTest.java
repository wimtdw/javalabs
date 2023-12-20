package lab2.num6;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(8);

        System.out.println("Радиус окружности 1: " + circle1.getRadius());
        System.out.println("Площадь окружности 1: " + circle1.getArea());
        System.out.println("Длина окружности 1: " + circle1.getLength());
        System.out.println("Радиус окружности 2: " + circle2.getRadius());
        System.out.println("Площадь окружности 2: " + circle2.getArea());
        System.out.println("Длина окружности 2: " + circle2.getLength());
        if (circle1.equals(circle2)) {
            System.out.println("Окружности равны");
        } else {
            System.out.println("Окружности не равны");
        }
    }
}

