package lab4_1.num3;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Иван Иванов", 30);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}

