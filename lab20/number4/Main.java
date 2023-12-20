package lab20.number4;

public class Main {
    public static void main(String[] args) {
        Integer a = 15;
        Double b = 10.2;

        System.out.println("Сумма: " + Calculator.sum(a, b));
        System.out.println("Умножение: " + Calculator.multiply(a, b));
        System.out.println("Деление: " + Calculator.divide(a, b));
        System.out.println("Вычитание: " + Calculator.subtract(a, b));

        Integer[] integers = {9, 2, 7, 4, 5, 6, 3};

        MinMax<Integer> minMax = new MinMax<>(integers);
        Integer min = minMax.findMin();
        Integer max = minMax.findMax();

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
    }
}
