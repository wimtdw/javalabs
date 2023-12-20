package lab4_1.num8;

import lab4_1.num1.Shape;

public class Rectangle extends Shape {
    private double width;
    private double length;
    private String color;
    private Boolean filled;


    public Rectangle() {
        this.width = 0;
        this.length = 0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle[width=" + width + ", length=" + length + ", color=" + getColor() + ", filled=" + isFilled() + "]";    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        if (filled == null) {
            return false; // or throw an exception, depending on your requirements
        }
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
