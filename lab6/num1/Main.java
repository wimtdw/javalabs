package lab6.num1;

public class Main {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(3, 4, 5, 2, 2);

        System.out.println(circle);

        circle.moveUp();
        System.out.println(circle);

        circle.moveRight();
        System.out.println(circle);

    }
}

