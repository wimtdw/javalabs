package lab9.num4;

public class Main {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(5);
        MyClass obj2 = new MyClass(3);

        // Сравниваем объекты
        int result = obj1.compareTo(obj2);

        if (result < 0) {
            System.out.println(obj1 + " меньше " + obj2);
        } else if (result > 0) {
            System.out.println(obj1 + " больше " + obj2);
        } else {
            System.out.println(obj1 + " равно " + obj2);
        }
    }
}
