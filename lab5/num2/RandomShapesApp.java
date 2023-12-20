package lab5.num2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapesApp extends JFrame {
    private final int WINDOW_WIDTH = 800;
    private final int WINDOW_HEIGHT = 600;

    private final int NUM_SHAPES = 20;

    private Shape[] shapes;

    public RandomShapesApp() {
        setTitle("Random Shapes");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        shapes = new Shape[NUM_SHAPES];
        Random random = new Random();

        // Генерируем случайные фигуры
        for (int i = 0; i < NUM_SHAPES; i++) {
            int x = random.nextInt(WINDOW_WIDTH);
            int y = random.nextInt(WINDOW_HEIGHT);
            int width = random.nextInt(100) + 20;
            int height = random.nextInt(100) + 20;

            if (random.nextBoolean()) {
                shapes[i] = new Rectangle(x, y, width, height);
            } else {
                shapes[i] = new Ellipse(x, y, width, height);
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}

