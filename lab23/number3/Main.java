package lab23.number3;

public class Main {
    public static void main(String[] args) {

        int x = Integer.parseInt("5");

        // Вычисляем значение выражения x^2 - 2x + 1
        Expression expression = new Add(
                new Subtract(
                        new Multiply(new Variable("x"), new Variable("x")),
                        new Multiply(new Const(2), new Variable("x"))
                ),
                new Const(1)
        );

        int result = expression.evaluate(x);
        System.out.println("Result: " + result);
    }
}
