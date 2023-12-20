package lab5.num1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballMatchSimulator extends JFrame implements ActionListener {
    private int milanScore = 0;

    private int madridScore = 0;
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    public FootballMatchSimulator() {
        setTitle("Football Match Simulator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");
        resultLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        milanButton.addActionListener(this);
        madridButton.addActionListener(this);

        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("AC Milan")) {
            milanScore++;
            lastScorerLabel.setText("Last Scorer: AC Milan");
        } else if (e.getActionCommand().equals("Real Madrid")) {
            madridScore++;
            lastScorerLabel.setText("Last Scorer: Real Madrid");
        }

        resultLabel.setText("Result: " + milanScore + " X " + madridScore);

        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        FootballMatchSimulator simulator = new FootballMatchSimulator();
        simulator.setVisible(true);
    }
}
