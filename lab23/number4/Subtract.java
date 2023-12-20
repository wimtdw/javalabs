package lab23.number4;

class Subtract extends BinaryOperation {
    public Subtract(TripleExpression left, TripleExpression right) {
        super(left, right);
    }
    protected int calculate(int a, int b) {
        return a - b;
    }
}
