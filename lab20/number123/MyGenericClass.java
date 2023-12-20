package lab20.number123;

import java.io.Serializable;


public class MyGenericClass<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T t;
    private V v;
    private K k;

    public MyGenericClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void printClassNames() {
        System.out.println("T class name: " + t.getClass().getName());
        System.out.println("V class name: " + v.getClass().getName());
        System.out.println("K class name: " + k.getClass().getName());
    }

    public static class Main {
        public static void main(String[] args) {
            Integer integer = 10;
            Animal cat = new Animal("Cat", 10);
            String string = "Hello";

            MyGenericClass<Integer, Animal, String> myGenericClass = new MyGenericClass<>(integer, cat, string);

            // Получение значений
            Integer tValue = myGenericClass.getT();
            Animal vValue = myGenericClass.getV();
            String kValue = myGenericClass.getK();

            System.out.println("T value: " + tValue);
            System.out.println("V value: " + vValue.getName());
            System.out.println("K value: " + kValue);

            // Вывод имен классов
            myGenericClass.printClassNames();
        }
    }
}

