package lab23.number4;

 class Multiply extends BinaryOperation {
    public Multiply(TripleExpression left, TripleExpression right) {
        super(left, right);
    }
    protected int calculate(int a, int b) {
        return a * b;
    }
}