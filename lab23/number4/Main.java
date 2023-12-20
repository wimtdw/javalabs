package lab23.number4;

public class Main {
    public static void main(String[] args) {
        ExpressionParser parser = new ExpressionParser();
        TripleExpression expression = parser.parse("1000000 * x * x * x * x * x / (x - 1)");
        for (int x = 0; x <= 10; x++) {
            try {
                int result = expression.evaluate(x, 0, 0);
                String res;
                res = ExpressionParser.ch(x, result);
                System.out.println(x + " " + res);
            } catch (ArithmeticException e) {
                System.out.println(x + " " + e.getMessage());

            }
        }

    }
}