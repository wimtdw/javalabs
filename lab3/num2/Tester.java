package lab3.num2;

import java.util.ArrayList;

public class Tester {
    private static ArrayList<lab3.num2.Circle> circles = new ArrayList<>();
    public static int circles_size = circles.size();

    public static void main(String[] args) {
        lab3.num2.Circle circle1 = new lab3.num2.Circle(5, 10);
        circles.add(circle1);
        circles_size+=1;
        lab3.num2.Circle circle2 = new lab3.num2.Circle(2, 3);
        circles.add(circle2);
        circles_size+=1;
        circle1.setX(7);
        System.out.println(circles_size);
        for (int i=0; i<circles_size; i++)
        {
            Circle circ = circles.get(i);
            System.out.println(circ.point);
        }
        findBiggest();
        findSmallest();
    }

    public static void findBiggest() {
        Circle biggestCircle = circles.get(0);
        for (int i=0; i < circles.size(); i++){
            if (circles.get(i).getRadius() > biggestCircle.getRadius()){
                biggestCircle = circles.get(i);
            }
        }
        System.out.println("Самая большая окружность: " + biggestCircle);
    }

    public static void findSmallest() {
        Circle smallestCircle = circles.get(0);
        for (int i=0; i < circles.size(); i++){
            if (circles.get(i).getRadius() < smallestCircle.getRadius()){
                smallestCircle = circles.get(i);
            }
        }
        System.out.println("Самая маленькая окружность: " + smallestCircle);
    }
}
