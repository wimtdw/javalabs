package lab24.number1;

public interface ComplexAbstractFactory {
    ComplexNumber createComplex();
    ComplexNumber createComplex(int real, int imaginary);
    ComplexOperation createComplexOperation();
}
