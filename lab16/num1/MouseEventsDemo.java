import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventsDemo extends JFrame {
    public MouseEventsDemo() {
        setTitle("Mouse Events Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel centerLabel = new JLabel("CENTER");
        JLabel westLabel = new JLabel("WEST");
        JLabel southLabel = new JLabel("SOUTH");
        JLabel northLabel = new JLabel("NORTH");
        JLabel eastLabel = new JLabel("EAST");

        centerLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        westLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        southLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        northLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        eastLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        centerLabel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЦАО");
            }
        });

        westLabel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЗАО");
            }
        });

        southLabel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЮАО");
            }
        });

        northLabel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в САО");
            }
        });

        eastLabel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ВАО");
            }
        });

        add(centerLabel, BorderLayout.CENTER);
        add(westLabel, BorderLayout.WEST);
        add(southLabel, BorderLayout.SOUTH);
        add(northLabel, BorderLayout.NORTH);
        add(eastLabel, BorderLayout.EAST);

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new MouseEventsDemo().setVisible(true);
    }
}