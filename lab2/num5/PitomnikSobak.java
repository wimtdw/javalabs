package lab2.num5;

import lab2.num3.Circle;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class PitomnikSobak {
    private static ArrayList<Dog> dogs = new ArrayList<>();
    public static void add_dog()
    {
        System.out.print("Имя собаки: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Возраст собаки: ");
        int age = sc.nextInt();
        Dog dog = new Dog(name, age);
        dogs.add(dog);
    }

    public static void main(String[] args) {
        add_dog();
        add_dog();
        for (int i=0; i<dogs.size(); i++){
            System.out.println(dogs.get(i));
        }
    }
}
