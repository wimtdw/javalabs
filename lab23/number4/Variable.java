package lab23.number4;

class Variable implements TripleExpression {
    private String name;
    public Variable(String name) {
        this.name = name;
    }
    public int evaluate(int x, int y, int z) {
        if (name.equals("x")) {
            return x;
        } else if (name.equals("y")) {
            return y;
        } else if (name.equals("z")) {
            return z;
        } else {
            throw new IllegalArgumentException("Unknown variable: " + name);
        }
    }
}