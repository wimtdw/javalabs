package lab21.number2;

import java.util.Arrays;

public class GenericArray<T> {
    private T[] array;

    public GenericArray(int size) {
        array = (T[]) new Object[size];
    }

    public void set(int index, T value) {
        array[index] = value;
    }

    public T get(int index) {
        return array[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        // Создание объекта GenericArray для хранения целых чисел
        GenericArray<Integer> intArray = new GenericArray<>(5);

        intArray.set(0, 1);
        intArray.set(1, 2);
        intArray.set(2, 3);
        intArray.set(3, 4);
        intArray.set(4, 5);

        System.out.println("Массив целых чисел: " + intArray);

        // Создание объекта GenericArray для хранения строк
        GenericArray<String> stringArray = new GenericArray<>(3);

        stringArray.set(0, "priv");
        stringArray.set(1, "privetik");
        stringArray.set(2, "Privet");

        System.out.println("Массив строк: " + stringArray);
    }
}
