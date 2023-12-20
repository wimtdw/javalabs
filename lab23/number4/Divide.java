package lab23.number4;

class Divide extends BinaryOperation {
    public Divide(TripleExpression left, TripleExpression right) {
        super(left, right);
    }
    protected int calculate(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}