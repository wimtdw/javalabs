package lab4_1.num4;

public class Matrix {
    private double[][] data;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows][columns];
    }

    public Matrix(double[][] data) {
        this.rows = data.length;
        this.columns = data[0].length;
        this.data = data;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.columns != other.columns) {
            throw new IllegalArgumentException("Матрицы должны иметь одинаковые размеры для сложения.");
        }

        double[][] resultData = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultData[i][j] = this.data[i][j] + other.data[i][j];
            }
        }

        return new Matrix(resultData);
    }

    public Matrix multiplyByScalar(double scalar) {
        double[][] resultData = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultData[i][j] = this.data[i][j] * scalar;
            }
        }

        return new Matrix(resultData);
    }

    public Matrix multiply(Matrix other) {
        if (this.columns != other.rows) {
            throw new IllegalArgumentException("Число столбцов первой матрицы должно быть равно числу строк второй матрицы.");
        }

        double[][] resultData = new double[this.rows][other.columns];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                for (int k = 0; k < this.columns; k++) {
                    resultData[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }

        return new Matrix(resultData);
    }
}

