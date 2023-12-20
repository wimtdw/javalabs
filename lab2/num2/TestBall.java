package lab2.num2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball_1 = new Ball(3.0, 2.0);
        Ball ball_2 = new Ball();
        System.out.println("ball 1: " + ball_1);
        System.out.println("ball 2: " + ball_2);
        System.out.println("ball 1 x: " + ball_1.getX());
        ball_2.setX(5.0);
        ball_1.setY(1.0);
        System.out.println("ball 1 y: " + ball_1.getY());
        ball_2.setXY(1, 1);
        ball_1.move(3, 7);
        System.out.println("ball 1: " + ball_1);
        System.out.println("ball 2: " + ball_2);
    }
}
