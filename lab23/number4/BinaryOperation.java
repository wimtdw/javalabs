package lab23.number4;

abstract class BinaryOperation implements TripleExpression {
    private TripleExpression left;
    private TripleExpression right;
    public BinaryOperation(TripleExpression left, TripleExpression right) {
        this.left = left;
        this.right = right;
    }
    protected abstract int calculate(int a, int b);
    public int evaluate(int x, int y, int z) {
        return calculate(left.evaluate(x, y, z), right.evaluate(x, y, z));
    }
}
