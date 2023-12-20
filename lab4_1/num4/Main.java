package lab4_1.num4;

public class Main {
    public static void main(String[] args) {
        double[][] data1 = {{1, 2}, {3, 4}};
        double[][] data2 = {{5, 6}, {7, 8}};

        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);

        System.out.println("Matrix1:");
        matrix1.print();
        System.out.println();

        System.out.println("Matrix2:");
        matrix2.print();
        System.out.println();

        Matrix sum = matrix1.add(matrix2);
        System.out.println("Matrix1 + Matrix2:");
        sum.print();
        System.out.println();

        Matrix scaled = matrix1.multiplyByScalar(2);
        System.out.println("Matrix1 * 2:");
        scaled.print();
        System.out.println();

        Matrix product = matrix1.multiply(matrix2);
        System.out.println("Matrix1 * Matrix2:");
        product.print();
    }
}

