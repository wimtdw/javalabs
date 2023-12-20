package lab3.zadanie1;

public class Main {
    public static void main(String[] args) {
        // 1. Создаем объекты класса Double с использованием методов valueOf()
        Double double1 = Double.valueOf(123.23);
        Double double2 = Double.valueOf("15.125");

        // 2. Преобразуем значение типа String в тип double с использованием parseDouble()
        String str = "233.233";
        double parsedDouble = Double.parseDouble(str);

        // 3. Преобразуем объект Double ко всем примитивным типам
        double primitiveD = double1;
        float primitiveF = double1.floatValue();
        int primitiveI = double1.intValue();
        long primitiveL = double1.longValue();
        short primitiveS = double1.shortValue();
        byte primitiveB = double1.byteValue();

        // 4. Выводим значение объекта Double на консоль
        System.out.println("double1: " + double1);

        // 5. Преобразуем литерал типа double к строке с использованием Double.toString()
        String d = Double.toString(3.14);

        System.out.println("Преобразованное значение из строки: " + parsedDouble);
        System.out.println("Преобразование в примитивные типы:");
        System.out.println("double: " + primitiveD);
        System.out.println("float: " + primitiveF);
        System.out.println("int: " + primitiveI);
        System.out.println("long: " + primitiveL);
        System.out.println("short: " + primitiveS);
        System.out.println("byte: " + primitiveB);
        System.out.println("Преобразованный литерал: " + d);
    }
}

