package lab5.num3;


import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class DisplayImageApp extends JFrame {
    private BufferedImage image;

    public DisplayImageApp(String imagePath) {
        try {
            image = ImageIO.read(new File(imagePath));
            setTitle("Display Image");
            setSize(image.getWidth(), image.getHeight());
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null); // Чтобы окно было по центру экрана
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (image != null) {
            g.drawImage(image, 0, 0, this);
        }
    }

    public static void main(String[] args) {
        DisplayImageApp app = new DisplayImageApp("C:/Users/PA/Documents/java-labs/795a7e386049272e5dd7c8b6bd859747.jpg");
        app.setVisible(true);
    }
}

