package lab5.num4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationApp extends JFrame {
    private ImageIcon[] frames;
    private JLabel animationLabel;
    private int currentFrame = 0;

    public AnimationApp() {
        setTitle("Simple Animation");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        frames = new ImageIcon[6];
        for (int i = 0; i < 6; i++) {
            frames[i] = new ImageIcon("C:/Users/PA/Documents/java-labs/frame_" + (i) + ".jpg");
        }

        animationLabel = new JLabel(frames[currentFrame]);
        add(animationLabel, BorderLayout.CENTER);

        Timer timer = new Timer(200, e -> {
            currentFrame = (currentFrame + 1) % frames.length;
            animationLabel.setIcon(frames[currentFrame]);
        });
        timer.start();
    }

    public static void main(String[] args) {
        AnimationApp app = new AnimationApp();
        app.setVisible(true);
    }
}

