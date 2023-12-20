package lab2.num3;

import java.util.ArrayList;

public class Tester {
    private static ArrayList<Circle> circles = new ArrayList<>();
    public static int circles_size = circles.size();

    public static void main(String[] args) {
        Circle circle1 = new Circle(5, 10);
        circles.add(circle1);
        circles_size+=1;
        Circle circle2 = new Circle(2, 3);
        circles.add(circle2);
        circles_size+=1;
        circle1.setX(7);
        System.out.println(circles_size);
        for (int i=0; i<circles_size; i++)
        {
            Circle circ = circles.get(i);
            System.out.println(circ.point);
        }
    }
}
