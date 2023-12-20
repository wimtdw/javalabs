package lab23.number4;

class Add extends BinaryOperation {
    public Add(TripleExpression left, TripleExpression right) {
        super(left, right);
    }
    protected int calculate(int a, int b) {
        return a + b;
    }
}
