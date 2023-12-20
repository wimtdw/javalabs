package lab15.num1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculator extends JFrame {
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton addButton = new JButton("Add");
    JButton subtractButton = new JButton("Subtract");
    JButton multiplyButton = new JButton("Multiply");
    JButton divideButton = new JButton("Divide");

    Calculator() {
        super("Calculator");
        setLayout(new FlowLayout());
        setSize(400, 300);

        add(new JLabel("1st Number"));
        add(jta1);

        add(new JLabel("2nd Number"));
        add(jta2);

        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                performOperation('+');
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                performOperation('-');
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                performOperation('*');
            }
        });

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                performOperation('/');
            }
        });

        setVisible(true);
    }

    private void performOperation(char operator) {
        try {
            double x1 = Double.parseDouble(jta1.getText().trim());
            double x2 = Double.parseDouble(jta2.getText().trim());
            double result = 0;

            switch (operator) {
                case '+':
                    result = x1 + x2;
                    break;
                case '-':
                    result = x1 - x2;
                    break;
                case '*':
                    result = x1 * x2;
                    break;
                case '/':
                    if (x2 != 0) {
                        result = x1 / x2;
                    } else {
                        JOptionPane.showMessageDialog(null, "Division by zero is not allowed!", "Alert",
                                JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid operator!", "Alert", JOptionPane.ERROR_MESSAGE);
                    return;
            }

            JOptionPane.showMessageDialog(null, "Result = " + result, "Alert", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error in Numbers!", "Alert", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
