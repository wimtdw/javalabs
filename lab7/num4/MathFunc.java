package lab7.num4;

public class MathFunc implements MathCalculable {
    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double complexModulus(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    @Override
    public double getPi() {
        return Math.PI;
    }

    public double calculateCircleLength(double radius) {
        return 2 * getPi() * radius;
    }

    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();

        double result1 = mathFunc.power(2, 3);
        System.out.println("2^3 = " + result1);

        double result2 = mathFunc.complexModulus(3, 4); // |3 + 4i| = 5
        System.out.println("|3 + 4i| = " + result2);

        double result3 = mathFunc.calculateCircleLength(5); // Длина окружности с радиусом 5
        System.out.println("Длина окружности: " + result3);
        System.out.println();
    }

}

