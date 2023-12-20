package lab5.num2;

import java.awt.*;
class Ellipse extends Shape {
    private int width, height;

    public Ellipse(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }
}
