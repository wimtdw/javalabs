package lab23.number4;

class Const implements TripleExpression {
    private int value;
    public Const(int value) {
        this.value = value;
    }
    public int evaluate(int x, int y, int z) {
        return value;
    }
}