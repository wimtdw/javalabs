package lab24.number1;

public class ConcreteComplexNumber implements ComplexNumber {
    private int real;
    private int imaginary;

    // Конструктор без аргументов
    public ConcreteComplexNumber() {
        this.real = 0;
        this.imaginary = 0;
    }

    // Конструктор с аргументами
    public ConcreteComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public double getRealPart() {
        return 0;
    }

    @Override
    public double getImaginaryPart() {
        return 0;
    }

    // Другие методы для работы с комплексными числами
    // ...
}
