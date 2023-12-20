package lab23.number4;

class ExpressionParser {
    private String expression;
    private int index;
    private char currentChar;
    public TripleExpression parse(String expression) {
        this.expression = expression;
        this.index = 0;
        nextChar();
        return parseExpression();
    }
    private void nextChar() {
        if (index < expression.length()) {
            currentChar = expression.charAt(index);
            index++;
        } else {
            currentChar = '\0';
        }
    }
    private void skipWhitespace() {
        while (Character.isWhitespace(currentChar)) {
            nextChar();
        }
    }
    private TripleExpression parseExpression() {
        TripleExpression result = parseTerm();
        while (true) {
            skipWhitespace();
            if (currentChar == '+') {
                nextChar();
                result = new Add(result, parseTerm());
            } else if (currentChar == '-') {
                nextChar();
                result = new Subtract(result, parseTerm());
            } else {
                return result;
            }
        }
    }
    private TripleExpression parseTerm() {
        TripleExpression result = parseFactor();
        while (true) {
            skipWhitespace();
            if (currentChar == '*') {
                nextChar();
                result = new Multiply(result, parseFactor());
            } else if (currentChar == '/') {
                nextChar();
                result = new Divide(result, parseFactor());
            } else {
                return result;
            }
        }
    }
    private TripleExpression parseFactor() {
        skipWhitespace();
        if (currentChar == '(') {
            nextChar();
            TripleExpression result = parseExpression();
            skipWhitespace();
            if (currentChar != ')') {
                throw new IllegalArgumentException("Expected closing parenthesis");
            }
            nextChar();
            return result;
        } else if (currentChar == '-') {
            nextChar();
            skipWhitespace();
            if (Character.isDigit(currentChar)) {
                return parseNumber(true);
            } else {
                return new Subtract(new Const(0), parseFactor());
            }
        } else if (Character.isDigit(currentChar)) {
            return parseNumber(false);
        } else if (Character.isLetter(currentChar)) {
            return parseVariable();
        } else {
            throw new IllegalArgumentException("Unexpected character: " + currentChar);
        }
    }
    private TripleExpression parseVariable() {
        StringBuilder builder = new StringBuilder();
        while (Character.isLetter(currentChar)) {
            builder.append(currentChar);
            nextChar();
        }
        return new Variable(builder.toString());
    }
    private TripleExpression parseNumber(boolean negative) {
        StringBuilder builder = new StringBuilder();
        if (negative) {
            builder.append('-');
        }
        while (Character.isDigit(currentChar)) {
            builder.append(currentChar);
            nextChar();
        }
        try {
            int value = Integer.parseInt(builder.toString());
            return new Const(value);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid number format: " + builder.toString());
        }
    }
    public static String ch (int i, int result) {
        if (i >=5 && (result <= -21474836 || result >= 21474836))
            return "overflow";
        else{
            return String.valueOf(result);
        }
    }
}