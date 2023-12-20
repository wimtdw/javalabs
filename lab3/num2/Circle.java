package lab3.num2;

public class Circle {
    public Point point;
    private double radius = Math.random() * 100;
    private double length = Math.random() * 100;
    public Circle(double x, double y)
    {
        point = new Point(x, y);
    }
    public void setX(double x)
    {
        point.x=x;
    }
    public void setY(double y)
    {
        point.y=y;
    }

    public double getRadius(){
        return radius;
    }
    public double getLength(){
        return length;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "point=" + point +
                ", radius=" + radius +
                ", length=" + length +
                '}';
    }
}
