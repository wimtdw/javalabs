package lab5.num2;


import java.awt.*;
import java.util.Random;

public abstract class Shape {
    protected Color color;
    protected int x, y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = getRandomColor();
    }

    public abstract void draw(Graphics g);

    private Color getRandomColor() {
        Random random = new Random();
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        return new Color(r, g, b);
    }
}
