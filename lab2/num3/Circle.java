package lab2.num3;

public class Circle {
    public Point point;
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
}
