package lab24.number1;

public class Main {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();

        // Создание комплексного числа без аргументов
        ComplexNumber complex1 = factory.createComplex();
        System.out.println("Complex 1: " + complex1.toString());

        // Создание комплексного числа с аргументами
        ComplexNumber complex2 = factory.createComplex(3, 4);
        System.out.println("Complex 2: " + complex2.toString());

        // Создание операции с комплексными числами
        ComplexOperation operation = factory.createComplexOperation();
    }
}
