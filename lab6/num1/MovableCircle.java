package lab6.num1;

class MovableCircle implements Movable {
    private MovablePoint center;
    int radius;
    public MovableCircle(int x, int y, int radius, int xSpeed, int ySpeed) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle[" + center + "]";
    }
}

