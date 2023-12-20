package lab20.number5;

import lab20.number4.Calculator;

public class Main {
    public static void main(String[] args) {
        // Создаем две матрицы
        Integer[][] matrix1 = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };

        Integer[][] matrix2 = {
                {9, 6, 2},
                {0, 7, 2},
                {1, 3, 8}
        };

        Matrix<Integer> matrixA = new Matrix<>(matrix1);
        Matrix<Integer> matrixB = new Matrix<>(matrix2);

        // Сложение матриц
        Matrix<Integer> sumResult = matrixA.add(matrixB);

        System.out.println("Сумма матриц:");
        sumResult.printMatrix();

        // Вычитание матриц
        Matrix<Integer> subResult = matrixA.subtract(matrixB);

        System.out.println("Разность матриц:");
        subResult.printMatrix();

        // Умножение матриц
        Matrix<Integer> mulResult = matrixA.multiply(matrixB);

        System.out.println("Произведение матриц:");
        mulResult.printMatrix();

        // Вычисление с использованием калькулятора
        Integer a = 2;
        Double b = 5.3;

        System.out.println("Сумма: " + Calculator.sum(a, b));
        System.out.println("Умножение: " + Calculator.multiply(a, b));
    }
}
