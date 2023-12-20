package lab16.num1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessNumberGame extends JFrame {
    private JTextField textField;
    private JButton guessButton;
    private int targetNumber;
    private int attemptsLeft = 3;

    public GuessNumberGame() {
        setTitle("Угадай число");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        targetNumber = new Random().nextInt(21);

        textField = new JTextField(10);
        textField.setFont(new Font("Arial", Font.PLAIN, 16));

        guessButton = new JButton("Угадать");
        guessButton.setFont(new Font("Arial", Font.PLAIN, 16));
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new JLabel("Введите число от 0 до 20: "));
        panel.add(textField);
        panel.add(guessButton);

        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    private void checkGuess() {
        try {
            int guess = Integer.parseInt(textField.getText());

            if (guess < 0 || guess > 20) {
                JOptionPane.showMessageDialog(this, "Число должно быть от 0 до 20.", "Ошибка", JOptionPane.ERROR_MESSAGE);
            } else {
                attemptsLeft--;

                if (guess == targetNumber) {
                    JOptionPane.showMessageDialog(this, "Поздравляем! Вы угадали число.", "Победа", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                } else if (attemptsLeft == 0) {
                    JOptionPane.showMessageDialog(this, "Вы исчерпали все попытки. Загаданное число: " + targetNumber, "Поражение", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                } else {
                    String message = "Неверно. Загаданное число " + (targetNumber < guess ? "меньше" : "больше") + " вашей догадки. Осталось попыток: " + attemptsLeft;
                    JOptionPane.showMessageDialog(this, message, "Попытка #" + (3 - attemptsLeft), JOptionPane.WARNING_MESSAGE);
                    textField.setText("");
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Пожалуйста, введите число.", "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GuessNumberGame();
            }
        });
    }
}

