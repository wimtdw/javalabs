package lab22.number1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Calculator extends JFrame {
    private JTextField textField;
    private JButton[] digitButtons;
    private JButton[] operatorButtons;
    private JButton equalsButton;
    private JButton clearButton;
    private JButton spaceButton;

    public Calculator() {
        setTitle("Калькулятор");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 24));
        add(textField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4));

        digitButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            digitButtons[i] = new JButton(String.valueOf(i));
            digitButtons[i].setFont(new Font("Arial", Font.PLAIN, 18));
            digitButtons[i].addActionListener(new DigitButtonListener());
            buttonPanel.add(digitButtons[i]);
        }

        operatorButtons = new JButton[4];
        operatorButtons[0] = new JButton("+");
        operatorButtons[1] = new JButton("-");
        operatorButtons[2] = new JButton("*");
        operatorButtons[3] = new JButton("/");
        for (JButton button : operatorButtons) {
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            button.addActionListener(new OperatorButtonListener());
            buttonPanel.add(button);
        }

        equalsButton = new JButton("=");
        equalsButton.setFont(new Font("Arial", Font.PLAIN, 18));
        equalsButton.addActionListener(new EqualsButtonListener());
        buttonPanel.add(equalsButton);

        clearButton = new JButton("C");
        clearButton.setFont(new Font("Arial", Font.PLAIN, 18));
        clearButton.addActionListener(new ClearButtonListener());
        buttonPanel.add(clearButton);

        spaceButton = new JButton("Space");
        spaceButton.setFont(new Font("Arial", Font.PLAIN, 18));
        spaceButton.addActionListener(new SpaceButtonListener());
        buttonPanel.add(spaceButton);

        add(buttonPanel, BorderLayout.CENTER);
    }

    public double calculate(String expression) {
        String[] tokens = expression.split("\\s+");
        Stack<Double> stack = new Stack<>();

        for (String token : tokens) {
            if (isNumber(token)) {
                stack.push(Double.parseDouble(token));
            } else if (isOperator(token)) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Invalid expression: " + expression);
                }
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = performOperation(operand1, operand2, token);
                stack.push(result);
            } else {
                throw new IllegalArgumentException("Invalid token: " + token);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid expression: " + expression);
        }

        return stack.pop();
    }

    private boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private double performOperation(double operand1, double operand2, String operator) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    private class DigitButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            String digit = button.getText();
            textField.setText(textField.getText() + digit);
        }
    }

    private class OperatorButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            String operator = button.getText();
            textField.setText(textField.getText() + " " + operator + " ");
        }
    }

    private class EqualsButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String expression = textField.getText();
            try {
                double result = evaluateRPN(expression);
                textField.setText(String.valueOf(result));
            } catch (Exception ex) {
                textField.setText("Ошибка");
            }
        }

        private double evaluateRPN(String expression) {
            Stack<Double> stack = new Stack<>();
            String[] tokens = expression.split("\\s+");

            for (String token : tokens) {
                if (token.matches("-?\\d+(\\.\\d+)?")) {
                    stack.push(Double.parseDouble(token));
                } else if (token.equals("+")) {
                    double operand2 = stack.pop();
                    double operand1 = stack.pop();
                    stack.push(operand1 + operand2);
                } else if (token.equals("-")) {
                    double operand2 = stack.pop();
                    double operand1 = stack.pop();
                    stack.push(operand1 - operand2);
                } else if (token.equals("*")) {
                    double operand2 = stack.pop();
                    double operand1 = stack.pop();
                    stack.push(operand1 * operand2);
                } else if (token.equals("/")) {
                    double operand2 = stack.pop();
                    double operand1 = stack.pop();
                    stack.push(operand1 / operand2);
                }
            }

            return stack.pop();
        }
    }

    private class ClearButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textField.setText("");
        }
    }

    private class SpaceButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textField.setText(textField.getText() + " ");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculator calculator = new Calculator();
            calculator.setVisible(true);
        });
    }
}